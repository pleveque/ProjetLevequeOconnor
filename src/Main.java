/**
 * Created by Pierre on 19/11/2016.
 */
public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Product guiness = new Beer("0001", "Guiness", "Short description guiness", "Ireland", 3.6, 4.5, 0.33, "Blond");
        Product tariquet = new Wine("0002", "Chardonnay tête de cuvée", "Short description tariquet", "France", 10.2, 20.0, 0.75, "White");
        Product cider = new Cider("0003", "Orchard Thieves Cider", "Short description cider", "Ireland", 2.1, 8.5, 0.75, "Brut");
        Product vodka = new Spirit("0004", "Greygouse", "Short description vodka", "France", 40.0, 30.0, 1.0, "Vodka");

        inventory.addProduct(guiness);
        inventory.addProduct(tariquet);
        inventory.addProduct(cider);
        inventory.addProduct(vodka);
        System.out.println(inventory.getProduct("0003").getName());
    }

}
