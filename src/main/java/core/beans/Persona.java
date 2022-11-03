/*
 * Copyright (c) 2014, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package core.beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import core.beans.entity.PersonaEntity;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Persona implements Serializable{

    private static final long serialVersionUID = -1220138313978339995L;
    private Integer idPersona;
    private String nombre;
    private Integer edad;
	private String genero;
	private String correoElectronico;
	private String nacionalidad;
	private String rfc;
	private String direccion;
    
    
    
   
   
    
    private Personas personas;
    
      public Persona() {
		personas = new Personas();
	}
    
    public List<PersonaEntity> getPersonas() {
    	return personas.getPersonas();
    }

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
  
	public void setPersonas(Personas personas) {
		this.personas = personas;
	}
	
	

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//porque nos indica a donde nos vamos a meter
    public void agregar(AjaxBehaviorEvent event) throws AbortProcessingException
    {
    	personas.agregar(this);
    	System.out.println(personas.getPersonas().size());
    	for (PersonaEntity entity : personas.getPersonas()) {
			System.out.println(entity);
			
		}
    	
    	//return "index";
    	
    }
    
    
    
  
}

