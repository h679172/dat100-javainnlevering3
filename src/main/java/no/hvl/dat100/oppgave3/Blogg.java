package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}
	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int index = -1;
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                index = i;
            }
        }
        return index;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		if (finnInnlegg(innlegg) >= 0) {
			finnes = true;
		} else {
			finnes = false;
		}
		return finnes;
	}

	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;
		if (ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagtTil = true;
		} else {
			lagtTil = false;
		}
	return lagtTil;
	}
	
	public String toString() {
		String ut = nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++) {
			ut += innleggtabell[i].toString();
		}
		return ut;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nyTabell = new Innlegg[innleggtabell.length * 2];
		for (int i = 0; i < innleggtabell.length; i++) {
			nyTabell[i] = innleggtabell[i];
		}
		innleggtabell = nyTabell;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		boolean lagtTil = false;
		if (!ledigPlass()) {
			utvid();
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagtTil = true;
		} else {
			lagtTil = false;
		}
		return lagtTil;
	}
	
	public boolean slett(Innlegg innlegg) {
		boolean slettet = false;
		int index = finnInnlegg(innlegg);
		if (index >= 0) {
			nesteledig--;
			innleggtabell[index] = innleggtabell[nesteledig];
			innleggtabell[nesteledig] = null;
			slettet = true;
		} else {
			slettet = false;
		}
		return slettet;
	}
	
	public int[] search(String keyword) {
		int[] idTabell = new int[innleggtabell.length];
        int j = 0;
        for (int i = 0; i < innleggtabell.length; i++) {
            if (innleggtabell[i].toString().contains(keyword)) {
                idTabell[j] = innleggtabell[i].getId();
                j++;
            }
        }
        return idTabell;
	}
}