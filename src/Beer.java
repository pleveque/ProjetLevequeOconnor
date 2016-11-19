/**
 * Created by Pierre on 19/11/2016.
 */
public class Beer extends Product{

    private String typeBeer;


    public Beer(String serialNumber, String name, String description, String origin, double percentageAlcohol, double price, double quantity, String typeBeer) {
        super(serialNumber, name, description, origin, percentageAlcohol, price, quantity);
        this.typeBeer = typeBeer;
    }

    public String getTypeBeer() {
        return typeBeer;
    }

    public void setTypeBeer(String typeBeer) {
        this.typeBeer = typeBeer;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "typeBeer='" + typeBeer + '\'' +
                '}';
    }
}
