package no.hvl.dat100.oppgave6;

import no.hvl.dat100.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {
	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";
	
	@Override
	public String toString() {
		String html = HTMLPREFIX;
		for (int i = 0; i < getAntall(); i++) {
			html += getSamling()[i].toHTML();
		}
		html += HTMLPOSTFIX;
		return html;
	}
}
