package zadanie1;

public class Przyjecie extends Dokument {

	private String Nr;

	public Przyjecie(String nr) {
		super();
		Nr = nr;
	}

	@Override
	public String getNr() {

		return Nr;
	}
}
