package com.example.Ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("producto")
public class ProductoControl {
	
	@Autowired
	private ProductoInterface productoServicio;
	
	@Autowired
	private CategoriasInterface categoriaServicio;
	
	
	@GetMapping (value = "/productoInsertar")
	public String productoInsertar (Model model) {
		
		Producto producto = new Producto();
		model.addAttribute("producto", producto);
		model.addAttribute("mensaje", "Nuevo producto");

		return "productoInsertar";
	}
	
	@ModelAttribute("categorias")
	public List<Categorias> datosCategorias(){
		return categoriaServicio.listado();
	}
	
	@PostMapping("/insertarProducto")
	public String insertarProducto(@ModelAttribute(name="producto") Producto producto,
			Model model, SessionStatus status) {
		productoServicio.guardarProducto(producto);
		status.setComplete();
		
		return "productoInsertar";
	}
	@GetMapping (value = "/productoListar")
	public String productoListar(Model model) {
		List<Producto> producto = productoServicio.ListadoProducto();
		model.addAttribute("producto",producto);
		model.addAttribute("Mensaje", "Listado de productos");
		return "productoListar";
	}
	
}
