package com.example.Ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CategoriasServicio implements CategoriasInterface{

	@Autowired
	private CategoriasDAO categoriasDAO;
	
	@Override
	@Transactional
	public void guardar(Categorias categorias) {
		categoriasDAO.save(categorias);
		
	}

	@Override
	
	public List<Categorias> listado() {
		
		return categoriasDAO.findAll();
	}

	@Override
	
	public Categorias consultar(Integer id) {
		return categoriasDAO.findById(id).orElse(null);
		
	}

	@Override
	@Transactional
	public void eliminar(Integer id) {
		categoriasDAO.deleteById(id);
		
	}

}

