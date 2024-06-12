package com.example.Ventas;

import java.util.List;

public interface CategoriasInterface {

	public void guardar (Categorias categorias);
	public List<Categorias> listado();
	public Categorias consultar(Integer id);
	public void eliminar(Integer id);
	
}
