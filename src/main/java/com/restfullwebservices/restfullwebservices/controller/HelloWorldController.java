package com.restfullwebservices.restfullwebservices.controller;

import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restfullwebservices.restfullwebservices.bean.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloMethod() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	private HelloWorldBean hello() {
		return new HelloWorldBean("Hello World Bean");

	}

	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	private HelloWorldBean helloUisngPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));

	}
}


