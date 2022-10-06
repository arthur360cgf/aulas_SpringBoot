package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodoHttpController {
	@GetMapping
	String get() {
		return "Requisição GET";
	}
	
	@PostMapping
	String post() {
		return "Requisição POST";
	}
	
	@PutMapping
	String put() {
		return "Requisição PUT";
	}
	
	@PatchMapping
	String patch() {
		return "Requisição PATCH";
	}
	
	@DeleteMapping
	String delete() {
		return "Requisição DELETE";
	}

}
