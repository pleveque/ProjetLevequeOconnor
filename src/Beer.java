/**
 * Created by Pierre on 19/11/2016.
 */
public class Beer {

    private int serialNumber;
    private String name, description, origin, typeBeer;
    private double percentageAlcohol, price, quantity; //by Liter

    public Beer(int serialNumber, String name, String description, String origin, String typeBeer, double percentageAlcohol, double price, double quantity) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.description = description;
        this.origin = origin;
        this.percentageAlcohol = percentageAlcohol;
        this.price = price;
        this.quantity = quantity;
        this.typeBeer = typeBeer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPercentageAlcohol() {
        return percentageAlcohol;
    }

    public void setPercentageAlcohol(double percentageAlcohol) {
        this.percentageAlcohol = percentageAlcohol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getTypeBeer() {
        return typeBeer;
    }

    public void setTypeBeer(String typeBeer) {
        this.typeBeer = typeBeer;
    }
}
