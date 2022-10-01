package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

	// @RequestMapping(method = RequestMethod.GET, path = "/welcome")
	@GetMapping(path = { "/welcome", "main_page" })
	public String hi() {
		return "Welcome to Frank's super market!";
	}
//	@PostMapping(path = "/main_page")
//	public String salutation() {
//		return "Welcome to Frank's super market!(POST)";
//		//salutation
//	}
}
