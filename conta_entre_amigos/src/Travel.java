package conta_entre_amigos;

public class Travel extends Reservation{
    
    private String transportMode;
    private double transportCost;
    private String accomodation;
    private double accomodationCost;

    public String getTransportMode() {
        return transportMode;
    }
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public double getTransportCost() {
        return transportCost;
    }
    public void setTransportCost(double transportCost) {
        this.transportCost = transportCost;
    }

    public String getAccomodation() {
        return accomodation;
    }
    public void setAccomodation(String accomodation) {
        this.accomodation = accomodation;
    }

    public double getAccomodationCost() {
        return accomodationCost;
    }
    public void setAccomodationCost(double accomodationCost) {
        this.accomodationCost = accomodationCost;
    }
    
    
    public double sumPrices(){
        return 2.3;
    }
    
    public void calculateCarTravelPrice(double distance, double vehicle, double gasPrice){
        
    }
    
    @Override
    public void toPostpone() {
        
    }

    @Override
    public void antecipate() {
      
    }

    @Override
    public boolean cancel() {
        return true;
    }
    
}
