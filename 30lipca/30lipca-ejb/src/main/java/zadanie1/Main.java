package zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Dokument> listaDokumentow = new ArrayList<>();

		for (int i = 1; i < 6; i++) {
			listaDokumentow.add(new Przyjecie(Integer.toString(i)));
			listaDokumentow.add(new Faktura());
			listaDokumentow.add(new FakturaProForma());
			listaDokumentow.add(new WZ());
		}
		int i = 0;
		for (Dokument dokument : listaDokumentow) {

			if (i++ % 4 == 0) {
				System.out.println("-----------------------");
			}
			System.out.println(dokument.getNr());

		}

	}

}
