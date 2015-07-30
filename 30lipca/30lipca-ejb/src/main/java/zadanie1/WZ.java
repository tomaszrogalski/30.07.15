package zadanie1;

public class WZ extends Dokument {

	private String Nr;

	private static int nr = 0;

	public WZ() {
		Nr = ++nr + "/" + "WZ/" + dateFormatRok.format(data);
	}

	@Override
	public String getNr() {
		return Nr;
	}
}
