/**
 * Created by Jerome on 17-Nov-16.
 */
public class Beers {
    private String UPC, name, percentage, origin, type, size;
    private double price;
    private int quantity;

    public Beers (){
        UPC = "000000";
        name = "unknown";
        percentage = "0";
        origin = "unknown";
        type = "unknown";
        size = "0";
        price = 0;
        quantity = 0;
    }

    public Beers(String UPC, String name, String percentage, String origin, String type, String size, double price, int quantity) {
        this.UPC = UPC;
        this.name = name;
        this.percentage = percentage;
        this.origin = origin;
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "UPC='" + UPC + '\'' +
                ", name='" + name + '\'' +
                ", percentage='" + percentage + '\'' +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
