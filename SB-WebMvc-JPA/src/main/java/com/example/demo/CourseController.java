package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entity.Course;
import com.example.demo.repo.CourseRepository;

@Controller
public class CourseController {
	
	@Autowired
	private CourseRepository repo;
	
	@GetMapping("/index")
	public ModelAndView  index() {

		ModelAndView mav = new ModelAndView();
        
		List<Course> empList=new ArrayList<Course>();
		empList.add(new Course());
		mav.addObject("empList",empList);
		
		mav.setViewName("index");
		return mav;
	}
	
	@PutMapping("/save")
	public ModelAndView  saveBook(Course course) {
		
		System.out.println("###########SAving#######################");

		ModelAndView mav = new ModelAndView();
        try {
        	course.setActiveSW("Y");
		repo.save(course);
		
			mav.addObject("succMsg", "Book Saved");
        }
        catch (Exception e) {
        	mav.addObject("errMsg", " Failed to save");
		}
		mav.setViewName("adduser");

		return  mav;
	}

	@GetMapping("/getEmployeeDetails")
	public ModelAndView getEmpDetails()
	{
		ModelAndView  view=new ModelAndView();
		view.setViewName("index");
		
		
		List<Course> courseList=(List<Course>) repo.findByActiveSW("Y");
		view.addObject("empList",courseList);
		
		return view;
	}
	@GetMapping("/delete")
	public ModelAndView deleteDetails(@RequestParam("courseId") String courseId)
	{
		System.out.println("################DELET######################"+courseId);
		java.util.Optional<Course>  course=repo.findById(Integer.parseInt(courseId));
		if(course.isPresent())
		{
			Course course1=course.get();
			course1.setActiveSW("N");
			repo.save(course1);
		}
		ModelAndView  view=new ModelAndView();
		view.setViewName("index");
		List<Course> courseList=(List<Course>) repo.findByActiveSW("Y");
		view.addObject("empList",courseList);
		return view;
	}
	@GetMapping("/adduser")
	public ModelAndView showNewUser() {
		System.out.println("######showNewUser###################");
		ModelAndView  view=new ModelAndView();
		view.addObject("course", new Course());
		view.setViewName("adduser");
		
		return view;

	}
	@PutMapping("/update")
	public ModelAndView update(@RequestParam("courseId") Integer courseId) {
		System.out.println("######update###################");
		
		Course course=repo.findByCourseId(courseId);
		ModelAndView  view=new ModelAndView();
		view.addObject("course", course);
		view.setViewName("updateuser");
		
		return view;

	}
	 

}
