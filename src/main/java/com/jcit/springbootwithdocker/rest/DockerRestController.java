package com.jcit.springbootwithdocker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class DockerRestController {
	@GetMapping
	public String HelloWorld(){
		return "Hello World in Docker=============>>>";
	}
	
}
