import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Pierre on 19/11/2016.
 * This class allows to test all methods
 */
public class FindProductTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map productSpec = new HashMap();
        //productSpec.put("name", Name.PAIXDIEU);
        //productSpec.put("origin", Origin.RUSSIA);
        productSpec.put("quantity", Quantity.MEDIUM);

        ProductSpec search = new ProductSpec(productSpec);

        List searchFound = inventory.searchProduct(search);

        if (!searchFound.isEmpty()) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("We have these products which corresponding to your research :");

            /*We go through the inventory*/
            for (Iterator i = searchFound.iterator(); i.hasNext(); ) {

                /*We stock address of next product in a product*/
                Product product = (Product) i.next();
                /*We retrieve the characteristics and we store in object type of productSpec*/
                ProductSpec spec = product.getProductSpec();

                System.out.println("We have a " +
                        spec.getMapSpec("productType") +
                        " with the following specificities:");

                /*We go through the map to find a similar product*/
                for (Iterator j = spec.getMapSpecs().keySet().iterator(); j.hasNext(); ) {

                    String propertyName = (String) j.next();
                    //System.out.println("productType : " + propertyName.eq);

                    if (!propertyName.equals("productType"))

                    System.out.println("    " + propertyName + ": " +
                            spec.getMapSpec(propertyName));

                }
                System.out.println("    percentage of alcohol : " + product.getPercentageAlcohol() + "%");
                System.out.println("    type : : " + product.getTypeAlcohol());


                System.out.println(" This " +
                        spec.getMapSpec("productType") + " is at only " +
                        product.getPrice() + "€" + "\n---");
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    /**
     * This methods allow to construct and fill the inventory with products
     * @param inventory
     */
    private static void initializeInventory(Inventory inventory) {

        HashMap productsSpec = new HashMap();

        productsSpec.put("productType", ProductType.BEER);
        productsSpec.put("name", Name.GUINNESS);
        productsSpec.put("origin", Origin.IRELAND);
        productsSpec.put("quantity", Quantity.SMALL);
        inventory.addProduct("AAA0001", "description of guinness", 3.2, 4.50, "BROWN", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.BEER);
        productsSpec.put("name", Name.HEINEKEN);
        productsSpec.put("origin", Origin.FINLAND);
        productsSpec.put("quantity", Quantity.SMALL);
        inventory.addProduct("AAA0002", "description of heineken", 4.6, 5.3, "BLOND", new ProductSpec(productsSpec));


        productsSpec.put("productType", ProductType.WINE);
        productsSpec.put("name", Name.POMEROL);
        productsSpec.put("origin", Origin.FRANCE);
        productsSpec.put("quantity", Quantity.LITER);
        inventory.addProduct("AAA0003", "description of wine wine pomerol", 10.2, 15.0, "RED", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.CIDER);
        productsSpec.put("name", Name.FALLING_APPLE);
        productsSpec.put("origin", Origin.AMERICA);
        productsSpec.put("quantity", Quantity.LARGE);
        inventory.addProduct("AAA0004", "description of Cider falling apple", 4.6, 8.0, "BRUT", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.SPIRIT);
        productsSpec.put("name", Name.VODKA);
        productsSpec.put("origin", Origin.RUSSIA);
        productsSpec.put("quantity", Quantity.LARGEST);
        inventory.addProduct("AAA0005", "description of spirit", 40.5, 15.0, "ABSOLUT", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.SPIRIT);
        productsSpec.put("name", Name.COGNAC);
        productsSpec.put("origin", Origin.FRANCE);
        productsSpec.put("quantity", Quantity.MEDIUM);
        inventory.addProduct("AAA0006", "description of cognac", 42.2, 50.0, "XO", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.WINE);
        productsSpec.put("name", Name.BLAYE);
        productsSpec.put("origin", Origin.FRANCE);
        productsSpec.put("quantity", Quantity.MEDIUM);
        inventory.addProduct("AAA0007", "description of wine blaye", 12.3, 20.0, "RED", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.CIDER);
        productsSpec.put("name", Name.BULMERS);
        productsSpec.put("origin", Origin.IRELAND);
        productsSpec.put("quantity", Quantity.LITER);
        inventory.addProduct("AAA0007", "description of cider bulmers", 12.3, 20.0, "RED", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.BEER);
        productsSpec.put("name", Name.PAIXDIEU);
        productsSpec.put("origin", Origin.BELGIUM);
        productsSpec.put("quantity", Quantity.MEDIUM);
        inventory.addProduct("AAA0008", "description of beer paix dieu", 10.2, 8, "TRIPLE", new ProductSpec(productsSpec));

    }

}
