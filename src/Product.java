/**
 * Created by Pierre on 19/11/2016.
 */
public class Product {

    private String serialNumber, description;
    private double percentageAlcohol, price; //by Liter
    private String typeAlcohol;
    private ProductSpec productSpec;

    public Product(String serialNumber, String description, double percentageAlcohol, double price, String typeAlcohol, ProductSpec productSpec) {
        this.serialNumber = serialNumber;
        this.description = description;
        this.percentageAlcohol = percentageAlcohol;
        this.price = price;
        this.typeAlcohol = typeAlcohol;
        this.productSpec = productSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getTypeAlcohol() {
        return typeAlcohol;
    }

    public void setTypeAlcohol(String typeAlcohol) {
        this.typeAlcohol = typeAlcohol;
    }

    public ProductSpec getProductSpec() {
        return productSpec;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumber='" + serialNumber + '\'' +
                ", description='" + description + '\'' +
                ", percentageAlcohol=" + percentageAlcohol +
                ", price=" + price +
                ", typeAlcohol='" + typeAlcohol + '\'' +
                ", productSpec=" + productSpec +
                '}';
    }
}
