package zadanie1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dokument {

	private String Nr;
	protected static Date data = new Date();
	protected static DateFormat dateFormat = new SimpleDateFormat("yyyy");

	public Dokument(String nr) {
		Nr = nr;
	}

	public String getNr() {
		return Nr;
	}

	public void setNr(String nr) {
		Nr = nr;
	}
}
