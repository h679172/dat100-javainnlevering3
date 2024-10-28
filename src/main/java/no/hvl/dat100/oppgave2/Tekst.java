package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	private String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
	}
	// Setters and getters
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBruker() {
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void doLike() {
		likes++;
	}

	public boolean erLik(Innlegg innlegg) {
		int id = this.getId();
		if (id == innlegg.getId()) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "TEKST\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		return "<h2>" + bruker + "@" + dato + " [" + likes + "]" + "</h2>\n" + "<p>" + tekst + "</p>\n";
	}
}
