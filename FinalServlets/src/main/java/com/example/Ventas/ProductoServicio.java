package com.example.Ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProductoServicio implements ProductoInterface{

	@Autowired
	private ProductoDAO productoDAO;
	
	@Autowired
	private CategoriasDAO categoriaDAO;
	
	@Override
	@Transactional
	public void guardarProducto(Producto producto) {
		productoDAO.save(producto);
	}

	@Override
	@Transactional
	public List<Producto> ListadoProducto() {
		
		return productoDAO.findAll();
	}
	

}
