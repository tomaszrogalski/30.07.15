package zadanie1;

public class FakturaProForma extends Dokument {

	private static int nr = 0;

	public FakturaProForma() {

		super(++nr + "/" + dateFormat.format(data) + "/ProForma");

	}
}
