/**
 * Created by Pierre on 19/11/2016.
 */
public class Product {

    private String serialNumber /*protected ?*/, name, description, origin;
    private double percentageAlcohol, price, quantity; //by Liter

    public Product(String serialNumber, String name, String description, String origin, double percentageAlcohol, double price, double quantity) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.description = description;
        this.origin = origin;
        this.percentageAlcohol = percentageAlcohol;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
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

    public String toString() {
        return "Product{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", origin='" + origin + '\'' +
                ", percentageAlcohol=" + percentageAlcohol +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
