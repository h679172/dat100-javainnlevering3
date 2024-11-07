package no.hvl.dat100.oppgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

public class LesBlogg {
	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		Blogg blogg = new Blogg();
        String linje = "";
        String type = "";
        String id = "";
        String bruker = "";
        String dato = "";
        String tekst = "";
        String url = "";
        int idInt = 0;
        String fil = mappe + filnavn;
		try {
			Scanner scanner = new Scanner(new File(fil));
			while (scanner.hasNextLine()) {
				linje = scanner.nextLine();
				if (linje.equals(TEKST)) {
					type = TEKST;
					id = scanner.nextLine();
					bruker = scanner.nextLine();
					dato = scanner.nextLine();
					tekst = scanner.nextLine();
					idInt = Integer.parseInt(id);
					blogg.leggTil(new Tekst(idInt, bruker, dato, tekst));
				} else if (linje.equals(BILDE)) {
					type = BILDE;
					id = scanner.nextLine();
					bruker = scanner.nextLine();
					dato = scanner.nextLine();
					tekst = scanner.nextLine();
					url = scanner.nextLine();
					idInt = Integer.parseInt(id);
					blogg.leggTil(new Bilde(idInt, bruker, dato, tekst, url));
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Filen ble ikke funnet");
		}
		return blogg;
	}
}
