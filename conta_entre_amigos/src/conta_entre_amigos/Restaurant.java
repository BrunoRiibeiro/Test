package conta_entre_amigos;

public class Restaurant extends Reservation{
    
    private String name;
    private int stars;
    private String [] meal;
    private double [] mealPrice;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }

    public String[] getMeal() {
        return meal;
    }
    public void setMeal(String[] meal) {
        this.meal = meal;
    }

    public double[] getMealPrice() {
        return mealPrice;
    }
    public void setMealPrice(double[] mealPrice) {
        this.mealPrice = mealPrice;
    }
    
    
    
    
    public void sumPrices(){
        
    }
    
    public int toEvaluate(){
        return 2;
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
