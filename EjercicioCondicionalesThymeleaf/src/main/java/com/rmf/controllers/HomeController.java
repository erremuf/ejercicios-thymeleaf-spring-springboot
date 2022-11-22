package com.rmf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.rmf.models.Coche;

@Controller
public class HomeController {

	
	Coche carUno = new Coche(false, 150, "Azul");
	Coche carDos = new Coche(true, 100, "Rojo");
	Coche carTres = new Coche(true, 60, "Blanco");
	Coche carCuatro = new Coche(false, 160, "Negro");
	Coche carCinco = new Coche(false, 200, "Negro");
	Coche carSeis = new Coche(false, 90, "Azul");
	Coche carSiete = new Coche(true, 175, "Blanco");
	Coche carOcho = new Coche(false, 210, "Blanco");
	Coche carNueve = new Coche(true, 140, "Negro");
	Coche carDiez = new Coche(false, 170, "Amarillo");
	
	
	private List<Coche> listaCoches(){
		List<Coche> listado = new ArrayList<Coche>() {{ add(carUno); add(carDos);
		add(carTres); add(carCuatro); add(carCinco); add(carSeis); add(carSiete);
		add(carOcho); add(carNueve); add(carDiez); }};
		
		return listado;
	}
	
	@GetMapping("/home")
	public String home(ModelMap map, Model model) {
		model.addAttribute("titulo", "Listado de coches");
		model.addAttribute("tituloDos", "Listado coches válidos");
		map.addAttribute("listado", listaCoches());
		
		return "home";
	}
}
