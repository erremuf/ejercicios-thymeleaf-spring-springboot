package com.rmf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.rmf.models.Persona;

@Controller
public class HomeController {

	Persona per1 = new Persona("Pepe", "Rodriguez", "12345678Z", "usuario1.png", 33);
	Persona per2 = new Persona("María", "Murillo", "83487392P", "usuario2.png", 23);
	Persona per3 = new Persona("Raul", "Sanchez", "29876309Q", "usuario3.png", 59);
	Persona per4 = new Persona("Andrea", "Pérez", "19827698L", "usuario1.png", 26);
	Persona per5 = new Persona("Martín", "Aguado", "83792082L", "usuario2.png", 37);
	Persona per6 = new Persona("Ana", "López", "76389920V", "usuario3.png", 39);
	Persona per7 = new Persona("Jorge", "Fernández", "88739820D", "usuario1.png", 21);
	Persona per8 = new Persona("Fabiola", "Rey", "73788933D", "usuario2.png", 17);
	Persona per9 = new Persona("Javier", "Ubago", "09387267F", "usuario3.png", 43);
	Persona per10 = new Persona("Emma", "Saelices", "83766687W", "usuario1.png", 51);
	
	private List<Persona> listaPersonas(){
		List<Persona> lista = new ArrayList<Persona>() {{add(per1);add(per2);add(per3);add(per4);add(per5);
														add(per6);add(per7);add(per8);add(per9);add(per10);}};
		return lista;
	}
	
	@GetMapping("/home")
	public String home(ModelMap map) {
		map.addAttribute("lista",listaPersonas());
		
		return "home";
	}
	

}
