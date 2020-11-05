package net.javaguides.hibernate;

import java.util.List;

import net.javaguides.hibernate.dao.PersonaDao;
import net.javaguides.hibernate.entity.Persona;

public class App {

	public static void main(String[] args) {

		PersonaDao personaDao = new PersonaDao();
		Persona persona = new Persona("massimiliano", "failla");
		personaDao.savePersona(persona);
		List<Persona> persone = personaDao.getPersona();
		persone.forEach(s -> System.out.println(s.getNome() + s.getCognome()));
	}
}
