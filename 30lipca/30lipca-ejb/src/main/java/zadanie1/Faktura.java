package zadanie1;

public class Faktura extends Dokument {

	private static int nr = 0;

	public Faktura() {
		super(++nr + "/" + dateFormatRok.format(data));
	}

	public Faktura(String x) {
		super(x);
	}
}
