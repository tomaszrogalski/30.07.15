package zadanie1;

public class WZ extends Dokument {

	private static int nr = 0;

	public WZ() {

		super(++nr + "/" + "WZ/" + dateFormat.format(data));

	}
}
