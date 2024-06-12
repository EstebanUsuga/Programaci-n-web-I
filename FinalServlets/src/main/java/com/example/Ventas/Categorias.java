package com.example.Ventas;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="categorias")
public class Categorias {
    @Id
    int id;
    String descripcion;
    String ubicacion;
    
    ///Relacion 1 a muchos
    @OneToMany (mappedBy="categorias", fetch = FetchType.LAZY,
    		cascade = CascadeType.ALL) 
     List<Producto> productos;

    
 public Categorias() {
	 productos= new ArrayList<>();
}


 public List<Producto> getProductos() {
	return productos;
}


public void setProductos(List<Producto> productos) {
	this.productos = productos;
}


public Categorias(int id, String descripcion, String ubicacion) {
    this.id = id;
    this.descripcion = descripcion;
    this.ubicacion = ubicacion;
    
    

}

@Override
	public String toString() {
		return "Categorias [id=" + id + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + "]";
	}

     // Getter for id
     public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for descripcion
    public String getDescripcion() {
        return descripcion;
    }

    // Setter for descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter for ubicacion
    public String getUbicacion() {
        return ubicacion;
    }

    // Setter for ubicacion
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}


