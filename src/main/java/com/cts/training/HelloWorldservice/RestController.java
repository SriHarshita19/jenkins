package com.cts.training.HelloWorldservice;

import org.springframework.web.bind.annotation.GetMapping;

public class RestController {
@GetMapping("/hello")
public String hello() {
	return "Hello";
}
}
