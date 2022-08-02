package conta_entre_amigos;

public abstract class Reservation {
    protected String id;
    protected String reservationHolder;
    protected String date;
    protected String locale;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

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
    
    public abstract void toPostpone();
    public abstract void antecipate();
    public abstract boolean cancel();
    
    
}
