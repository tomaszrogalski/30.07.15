package zadanie1;

public class Faktura extends Dokument {

	private static int nr = 0;

	public Faktura() {
		super(++nr + "/" + dateFormat.format(data));

	}
}
