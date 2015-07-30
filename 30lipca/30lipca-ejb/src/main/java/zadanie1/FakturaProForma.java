package zadanie1;

public class FakturaProForma extends Faktura {

	private static int nr = 0;

	public FakturaProForma() {
		super(++nr + "/" + dateFormatRokMiesiac.format(data) + "/ProForma");

	}
}
