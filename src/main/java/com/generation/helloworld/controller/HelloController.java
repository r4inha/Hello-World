package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {
	
	@GetMapping
	public String hello () {
		return "<b>Hello world</b>";	
	}
	
	@GetMapping ("/nome")
	public String meunome () {
		return "<b> Bianquinha</b>";
	
	@GetMapping ("/bsm")
	public String ListaBsms() {
		return "<b>Lista de BSMs</br>Responsabilidade Pessoal<br/>Mentalidade de Crescimentos<b></br>Orientação ao Futuro</br>Persistencia</br>Comunicação</br>Orientação aos Detalhes</br>Trabalho em Equipe</br>Proatividade</br>";
	}
	@GetMapping ("/objetivo")
	public String MeuObjetivo() { 
		return "<b>Melhorar a Comunicação</b>";
	}
	
}

