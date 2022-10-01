package br.com.cod3r.exercicios_sb.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControler {

//	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = { "/hi", "/greetings" })
	public String hi() {
		return "Hi Spring Boot";
	}
	@PostMapping(path =  "/hi")
	public String greetings() {
		return "Hi Spring Boot";
	}

}
