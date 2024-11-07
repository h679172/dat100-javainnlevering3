package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	private String tekst;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
	}
	// Setters and getters
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	@Override
	public String toString() {
		String str = "BILDE\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + url + "\n";
		return str;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		String str = "<h2>" + bruker + "@" + dato + " [" + likes + "]</h2>\n" + "<p>" + tekst + "</p>\n" + "<img src=\""
				+ url + "\" alt=\"Bilde\" width=\"500\">\n";
		return str;
	}
}
