package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		Boolean skrevet = false;
		try {
			PrintWriter skriver = new PrintWriter(mappe + filnavn);
			for (Innlegg innlegg : samling.getSamling()) {
				if (innlegg instanceof Tekst) {
					skriver.println("TEKST");
					skriver.println(innlegg.getId());
					skriver.println(innlegg.getBruker());
					skriver.println(innlegg.getDato());
					skriver.println(((Tekst) innlegg).getTekst());
				} else if (innlegg instanceof Bilde) {
					skriver.println("BILDE");
					skriver.println(innlegg.getId());
					skriver.println(innlegg.getBruker());
					skriver.println(innlegg.getDato());
					skriver.println(((Bilde) innlegg).getTekst());
					skriver.println(((Bilde) innlegg).getUrl());
				}
			}
			skriver.close();
			skrevet = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return skrevet;
	}
}
