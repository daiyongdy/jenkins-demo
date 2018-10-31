package com.example.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daiyong
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/index")
	public String index() {
		return "nice";
	}

}
