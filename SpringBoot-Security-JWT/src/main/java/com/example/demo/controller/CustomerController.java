package com.example.demo.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.security.authentication.AuthenticationManager;
	import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
	import org.springframework.security.core.Authentication;
	import org.springframework.security.crypto.password.PasswordEncoder;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;
    import com.example.demo.entity.Customer;
	import com.example.demo.repo.CustomerRepo;
	import com.example.demo.service.JWTService;
	
	@RestController
    public class CustomerController {
		
		public CustomerController()
		{
			
		}
			
			@Autowired
			private PasswordEncoder encoder ;
			
			@Autowired
			private CustomerRepo service;
			
			@Autowired
			private AuthenticationManager manager;
			
			@Autowired
			private JWTService jwtservice;
			
		@PostMapping("/registerUser")
		public String register(@RequestBody Customer customer) {
		  String encoded =	encoder.encode(customer.getPassword());
			  customer.setPassword(encoded);
			  service.save(customer);
			  return "Registration Successful";
		}
		
		@PostMapping("/login")
		public ResponseEntity<String> login (@RequestBody Customer customer){
			//UsernamePasswordAuthenticationToken token  = new UsernamePasswordAuthenticationToken(customer.getCustName(), customer.getPassword());
			try {
				 String jwttoken = jwtservice.generateToken(customer.getCustName());
				    return new ResponseEntity<>(jwttoken, HttpStatus.OK);
			} catch (Exception e) {
				e.getStackTrace();
			}
			return new ResponseEntity<>("Invalid Creditials",HttpStatus.BAD_REQUEST);
		}  
		
		
		@GetMapping("/welcome")
		public String getmsg() {
			return "Protected url method only used with jwt token";
		}

	}
