package net.javaguides.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.hibernate.entity.Persona;
import net.javaguides.hibernate.util.HibernateUtil;

public class PersonaDao {

	public void savePersona(Persona persona) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// inizia la transazione
			transaction = session.beginTransaction();

			// salva l'oggetto persona
			session.save(persona);

			// consegna la transazione
			transaction.commit();
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

//	@SuppressWarnings("unchecked")
	public List<Persona> getPersona() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("Da Persona -> ", Persona.class).list();
		}
	}
}
