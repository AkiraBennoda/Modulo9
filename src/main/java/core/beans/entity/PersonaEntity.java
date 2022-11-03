package core.beans.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import core.beans.Persona;
import core.beans.Personas;
import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.Entity;

@SessionScoped
public class PersonaEntity implements Serializable{
	private static final long serialVersionUID = 7261229187771153310L;
	
	private String nombre;
    private Integer edad;
	private String genero;
	private String correoElectronico;
	private String nacionalidad;
	private String rfc;
	private String direccion;
	
	
	public PersonaEntity() {}



		public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getCorreoElectronico() {
		return correoElectronico;
	}



	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	public String getRfc() {
		return rfc;
	}



	public void setRfc(String rfc) {
		this.rfc = rfc;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "PersonaEntity [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", correoElectronico="
				+ correoElectronico + ", nacionalidad=" + nacionalidad + ", rfc=" + rfc + ", direccion=" + direccion
				+ "]";
	}



	

	
	
		
		
		
}
