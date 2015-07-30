package zadanie1;

public class Faktura extends Dokument {

	private String Nr;

	private static int nr = 0;

	public Faktura() {
		Nr = ++nr + "/" + dateFormatRok.format(data);
	}

	protected Faktura(String x) {
		Nr = x;
	}

	@Override
	public String getNr() {

		return Nr;
	}
}
