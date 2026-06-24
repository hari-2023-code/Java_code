public class car {
    String brandName;
    String model;
    int price;

    // Using constructor
    public car(String brandName, String model, int price) {
        this.brandName = brandName;
        this.model = model;
        this.price = price;
    }
    public String getDetail(){
        return this.brandName + " " + this.model + " $" + this.price;

    }
    
}
