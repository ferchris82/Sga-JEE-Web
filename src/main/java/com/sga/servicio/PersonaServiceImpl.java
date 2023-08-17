package com.sga.servicio;

import com.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juan","Perez","jperez@mail.com","33443424"));
        personas.add(new Persona(2, "Martha", "Suarez", "msuarez@mail.com", "4533536"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
