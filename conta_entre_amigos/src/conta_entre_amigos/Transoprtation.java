package conta_entre_amigos;

public class Transoprtation extends Arrangement {
	
	private String transportMode;
    private double transportCost;

    
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