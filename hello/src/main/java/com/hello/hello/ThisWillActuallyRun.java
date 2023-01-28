package com.hello.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ThisWillActuallyRun {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/welcome")
	String welcome() {
		return "Hello World welcome 2!";
	}
}
