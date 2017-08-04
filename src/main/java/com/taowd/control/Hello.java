package com.taowd.control;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Taowd 
 * 功能：控制器的演示
 */
@RestController
@EnableAutoConfiguration
public class Hello {

	@RequestMapping("/")
	public String Say() {
		return "Hello Spring-Boot!";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		return "Hello " + myName + "!!!";
	}
}
