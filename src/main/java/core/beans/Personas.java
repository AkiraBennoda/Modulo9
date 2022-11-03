package core.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import core.beans.entity.PersonaEntity;
import jakarta.enterprise.context.SessionScoped;

@SessionScoped
public class Personas implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<PersonaEntity> personas = new ArrayList<>(); //Entity 
	
	public Personas()
	{
		personas = new ArrayList<>();
	}
	
	
	
	public void agregar(Persona persona)
	{
		PersonaEntity p = new PersonaEntity();   //Entity
		p.setNombre(persona.getNombre());
		p.setEdad(persona.getEdad());
		p.setGenero(persona.getGenero());
		p.setCorreoElectronico(persona.getCorreoElectronico());
		p.setNacionalidad(persona.getNacionalidad());
		p.setRfc(persona.getRfc());
		p.setDireccion(persona.getDireccion());
		
		personas.add(p);
	}
	
	
	public List<PersonaEntity> getPersonas()   //Candidato Entity
	{
		return personas;
	}
}
