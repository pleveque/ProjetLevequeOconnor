/**
 * Created by Pierre on 19/11/2016.
 */
public class Spirit extends Product{

    private String typeSpirit;

    public Spirit(String serialNumber, String name, String description, String origin, double percentageAlcohol, double price, double quantity, String typeSpirit) {
        super(serialNumber, name, description, origin, percentageAlcohol, price, quantity);
        this.typeSpirit = typeSpirit;
    }

    public String getTypeSpirit() {
        return typeSpirit;
    }

    public void setTypeSpirit(String typeSpirit) {
        this.typeSpirit = typeSpirit;
    }

    public String toString() {
        return "Spirit{" +
                "typeSpirit='" + typeSpirit + '\'' +
                '}';
    }
}
