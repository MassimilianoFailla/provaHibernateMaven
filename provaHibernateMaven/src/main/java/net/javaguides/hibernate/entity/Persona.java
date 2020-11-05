package net.javaguides.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	// genero l'entità test
@Entity
@Table(name="persona")
public class Persona {
	
	// genero la colonna nome
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="nome")
	private String nome;
	
	// genero la colonna cognome
	@Column(name="cognome")
	private String cognome;

	// istanzio il costruttore generico
	public Persona() {
		
	}
	
	// istanzio il costruttore collegato a nome e cognome
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	// metodi get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	// metodo toString per la visualizzazione della persona
	public String toString() {
		return "Persona -> [ nome: " +nome+ ", cognome: " + cognome +"]";
	}
	
	
}
