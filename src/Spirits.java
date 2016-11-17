/**
 * Created by Jerome on 17-Nov-16.
 */
public class Spirits {
    private String UPC, name, percentage, type, size;
    private double price;
    private int quantity;

    public Spirits (){
        UPC = "000000";
        name = "unknown";
        percentage = "0";
        type = "unknown";
        size = "0";
        price = 0;
        quantity = 0;
    }

    public Spirits(String UPC, String name, String percentage, String type, String size, double price, int quantity) {
        this.UPC = UPC;
        this.name = name;
        this.percentage = percentage;
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
        return "Spirits{" +
                "UPC='" + UPC + '\'' +
                ", name='" + name + '\'' +
                ", percentage='" + percentage + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
