/**
 * Created by Pierre on 19/11/2016.
 */
public class Cider extends Product{

    private String typeCider;

    public Cider(String serialNumber, String name, String description, String origin, double percentageAlcohol, double price, double quantity, String typeCider) {
        super(serialNumber, name, description, origin, percentageAlcohol, price, quantity);
        this.typeCider = typeCider;
    }

    public String getTypeCider() {
        return typeCider;
    }

    public void setTypeCider(String typeCider) {
        this.typeCider = typeCider;
    }

    public String toString() {
        return "Cider{" +
                "typeCider='" + typeCider + '\'' +
                '}';
    }
}
