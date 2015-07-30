package zadanie1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Dokument {

	protected static Date data = new Date();
	protected static DateFormat dateFormatRok = new SimpleDateFormat("yyyy");
	protected static DateFormat dateFormatRokMiesiac = new SimpleDateFormat("MM/yyyy");

	public abstract String getNr();

}
