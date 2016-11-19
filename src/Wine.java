/**
 * Created by Pierre on 19/11/2016.
 */
public class Wine extends Product{

        private String typeWine;


    public Wine(String serialNumber, String name, String description, String origin, double percentageAlcohol, double price, double quantity, String typeWine) {
        super(serialNumber, name, description, origin, percentageAlcohol, price, quantity);
        this.typeWine = typeWine;
    }

    public String getTypeWine() {
        return typeWine;
    }

    public void setTypeWine(String typeWine) {
        this.typeWine = typeWine;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "typeWine='" + typeWine + '\'' +
                '}';
    }
}