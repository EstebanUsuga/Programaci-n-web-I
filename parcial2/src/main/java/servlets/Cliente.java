package servlets;

import java.util.Date;

public class Cliente {
	
	private String tipoIdent;
	private String identificacion;
	private String nombre;
	private String direccion;
	private String telefono;
	private String correo;
	private Date fecha;
	private Boolean clienteAct;
	private Double capaciCredi;
	private String categoria;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cliente(String tipoIdent, String identificacion, String nombre, String direccion, String telefono,
			String correo, Date fecha, Boolean clienteAct, Double capaciCredi, String categoria) {
		super();
		this.tipoIdent = tipoIdent;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.fecha = fecha;
		this.clienteAct = clienteAct;
		this.capaciCredi = capaciCredi;
		this.categoria = categoria;
	}


	public String getTipoIdent() {
		return tipoIdent;
	}


	public void setTipoIdent(String tipoIdent) {
		this.tipoIdent = tipoIdent;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Boolean getClienteAct() {
		return clienteAct;
	}


	public void setClienteAct(Boolean clienteAct) {
		this.clienteAct = clienteAct;
	}


	public Double getCapaciCredi() {
		return capaciCredi;
	}


	public void setCapaciCredi(Double capaciCredi) {
		this.capaciCredi = capaciCredi;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Cliente [tipoIdent=" + tipoIdent + ", identificacion=" + identificacion + ", nombre=" + nombre
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", fecha=" + fecha
				+ ", clienteAct=" + clienteAct + ", capaciCredi=" + capaciCredi + ", categoria=" + categoria + "]";
	}
	
	
	
	
}



