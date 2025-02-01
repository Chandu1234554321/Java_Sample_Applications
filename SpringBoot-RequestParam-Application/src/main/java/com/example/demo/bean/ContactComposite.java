package com.example.demo.bean;

import java.io.Serializable;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Component
public class ContactComposite implements Serializable {
	
        /**
	 * 
	 */
	private static final long serialVersionUID = -3290375216090441460L;

		public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Id
	@GenericGenerator(name="order_id_seq" ,strategy = "com.example.demo.bean.OrderIdGenarator")
	@GeneratedValue(generator = "order_id_seq")
	
		private String cid;
	
    	private String cname;

}
