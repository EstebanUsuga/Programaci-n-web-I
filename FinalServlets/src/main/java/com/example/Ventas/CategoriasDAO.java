package com.example.Ventas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasDAO extends JpaRepository<Categorias, Integer>{

}