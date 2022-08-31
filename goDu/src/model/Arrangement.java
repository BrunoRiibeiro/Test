package model;

public abstract class Arrangement {

	protected String date;
	protected String locale;

	public Arrangement(String date, String locale) {
		super();
		this.date = date;
		this.locale = locale;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public abstract void toPostpone();

	public abstract void antecipate();

	public abstract boolean cancel();

}
