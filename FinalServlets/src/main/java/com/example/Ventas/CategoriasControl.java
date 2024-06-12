package com.example.Ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("categorias")
public class CategoriasControl {
	@Autowired
	private CategoriasInterface categoriasServicio;
	
	
	@GetMapping(value="/categoriasInsertar")
	public String categoriasInsertar(Model model) {
		
		Categorias categorias = new Categorias();
		model.addAttribute("categorias", categorias);
		model.addAttribute("mensaje", "Nuevo Registro");
		return "categoriasInsertar";
	}
	
	@PostMapping ("/insertar")
	public String insertar(@ModelAttribute (name="categorias") Categorias categorias, Model model,SessionStatus status) {
		categoriasServicio.guardar(categorias);
		status.setComplete();
		return "redirect:/categoriasListar";
	}
	@GetMapping(value="/categoriasListar")
	public String categoriasListar(Model model) {
		
		List<Categorias> categorias = categoriasServicio.listado();
		model.addAttribute("categorias", categorias);
		model.addAttribute("mensaje", "listado");
		return "/categoriasListar";
	}
	@GetMapping ("/consultar/(id)")
	public String consultar(@PathVariable (name="Id") Integer id, Model model) {
		
		Categorias categorias = categoriasServicio.consultar(id);
		model.addAttribute("categorias", categorias);
		model.addAttribute("mensaje","consultar");
		return "redirect:/categoriasListar";
	}
	@GetMapping("/eliminar/{id}")
	public String eliminar (@PathVariable(name="id") Integer id, Model model) {
		//Turista turista = turistaServicio.consultar(id);
		categoriasServicio.eliminar(id);
		return "redirect:/categoriasListar";
	}
	@GetMapping("/modificar/{id}")
	public String modificar (@PathVariable(name="id")Integer id,Model model) {
		Categorias categorias = categoriasServicio.consultar(id);
		model.addAttribute("turista", categorias);
		model.addAttribute("mensaje","editar");
		return "categoriasInsertar";
	}
}
