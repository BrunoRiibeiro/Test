package model;

public abstract class Arrangement {
	
	protected String id;
    protected String date;
    protected String locale;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
