package com.rmf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.rmf.model.Usuario;

@Controller
public class IndexController {
	
	@Autowired
	Usuario usuario;
	
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/usuarios")
	public String users(@ModelAttribute("usuarios") List<Usuario> usuarios, Model model) {	
		model.addAttribute("id", usuario.getId());	
		model.addAttribute("nombre", usuario.getNombre());
		model.addAttribute("apellido", usuario.getApellido());
		model.addAttribute("dni", usuario.getDni());
		return "usuarios";
	}
	
	

	@ModelAttribute("usuarios")
	public List<Usuario> usuarios(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		for(int i = 0; i < 3; i++) {
			usuario = new Usuario(i, "Nombre" + i,  "Apellido" + i,  "DNI" + i);
			usuarios.add(usuario);
		}
		
		
		return usuarios;
		
	}
	
	
	
}
