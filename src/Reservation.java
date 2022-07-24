
public abstract class Reservation {

	private String reservationHolder;
	private String date;
	private String locale;
	
	
	public String getReservationHolder() {
		return reservationHolder;
	}
	public void setReservationHolder(String reservationHolder) {
		this.reservationHolder = reservationHolder;
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
	
	
}
