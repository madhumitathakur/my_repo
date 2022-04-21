package com.spring.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

public class ContactController {
	
	//Path parameter based API versioning
//	@GetMapping(value="/api/contact/v1", produces = MediaType.APPLICATION_JSON_VALUE)
//	public Contact getContact() {
//		return new Contact("Tom",12345);
//	}
//	
//	@GetMapping(value="/api/contact/v2", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ContactV2 getContact2() {
//		return new ContactV2("Tom",12345);
//	}
	
	//Query/Request Parameter based API versioning
//	@GetMapping(value="/api/contact", produces = MediaType.APPLICATION_JSON_VALUE, params = "version=v1")
//	public Contact getContactQuesryV1() {
//		return new Contact("Tom",12345);
//	}
//	
//	@GetMapping(value="/api/contact", produces = MediaType.APPLICATION_JSON_VALUE, params = "version=v2")
//	public ContactV2 getContactQueryV2() {
//		return new ContactV2("Tom",12345);
//	}
	
	//Header Parameter based API versioning
//	@GetMapping(value="/api/contact", produces = MediaType.APPLICATION_JSON_VALUE, headers = "version=v1")
//	public Contact getContactHeaderV1() {
//		return new Contact("Tom",12345);
//	}
//	
//	@GetMapping(value="/api/contact", produces = MediaType.APPLICATION_JSON_VALUE, headers = "version=v2")
//	public ContactV2 getContactHeaderV2() {
//		return new ContactV2("Tom",12345);
//	}
	
	
	//Content Nigotiation 
	@GetMapping(value="/api/contact", produces = "application/contact.v1+json")
	public Contact getContactContentNegoV1() {
		return new Contact("Tom",12345);
	}
	
	@GetMapping(value="/api/contact", produces = "application/contact.v2+json")
	public ContactV2 getContactContentNegoV2() {
		return new ContactV2("Tom",12345);
	}
	
	
	
}

class ContactV2{
	private String name;
	private int mobileNo;
	public ContactV2() {
		super();
	}
	public ContactV2(String name, int mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
	}
	
}

class Contact{
	private String name;
	private int mobile;
	public Contact() {
		super();
	}
	public Contact(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobile=" + mobile + "]";
	}

}
