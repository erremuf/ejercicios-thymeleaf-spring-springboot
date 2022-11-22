package com.rmf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

	@ModelAttribute("listado")
	private List<String> listaNombres(){
		List<String> list = new ArrayList<String>();
		list.add("Manuel");
		list.add("Jorge");
		list.add("Maria");
		list.add("Valentina");
		list.add("Daniela");
		list.add("Martín");
		list.add("Nicolás");
		list.add("Emma");
		list.add("Antonio");
		list.add("Lourdes");
		
		return list;
	}
	
	@GetMapping("/")
	public String home(@ModelAttribute("listado") List<String> list, Model model) {
		
		model.addAttribute("titulo", "Listado de nombres con modelAttribute");
		model.addAttribute("listado", list);
		
		return "home";
	}
}
