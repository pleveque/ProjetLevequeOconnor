import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Pierre on 19/11/2016.
 */
public class FindProductTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map productSpec = new HashMap();
        productSpec.put("name", Name.GUINNESS);
        productSpec.put("origin", Origin.IRELAND);
        ProductSpec search = new ProductSpec(productSpec);

        List searchFound = inventory.searchProduct(search);

        if (!searchFound.isEmpty()) {

            System.out.println("You might like these products:");

            for (Iterator i = searchFound.iterator(); i.hasNext(); ) {

                Product product = (Product)i.next();
                ProductSpec spec = product.getProductSpec();

                System.out.println("We have a " + spec.getMapSpec("productType") +
                        " with the following productSpec:");

                for (Iterator j = spec.getMapSpecs().keySet().iterator();
                     j.hasNext(); ) {

                    String propertyName = (String)j.next();

                    if (propertyName.equals("productType"))
                        continue;
                    System.out.println("    " + propertyName + ": " +
                            spec.getMapSpec(propertyName));
                }
                System.out.println("  You can have this " +
                        spec.getMapSpec("productType") + " for $" +
                        product.getPrice() + "\n---");
            }
        } else {
            System.out.println("Sorry, we have nothing for you.");
        }

    }

    private static void initializeInventory(Inventory inventory){

        HashMap productsSpec = new HashMap();

        productsSpec.put("productType", ProductType.BEER);
        productsSpec.put("name", Name.GUINNESS);
        productsSpec.put("origin", Origin.IRELAND);
        productsSpec.put("quantity", Quantity.SMALL);
        inventory.addProduct("0001", "description of guiness", 3.2, 4.50, "BROWN", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.BEER);
        productsSpec.put("name", Name.HEINEKEN);
        productsSpec.put("origin", Origin.FINLAND);
        productsSpec.put("quantity", Quantity.SMALL);
        inventory.addProduct("0005", "description of heineken", 4.6, 5.3, "BLOND", new ProductSpec(productsSpec));


        productsSpec.put("productType", ProductType.WINE);
        productsSpec.put("name", Name.POMEROL);
        productsSpec.put("origin", Origin.FRANCE);
        productsSpec.put("quantity", Quantity.LITER);
        inventory.addProduct("0002", "description of wine", 10.2, 15.0, "RED", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.CIDER);
        productsSpec.put("name", Name.FALLING_APPLE);
        productsSpec.put("origin", Origin.AMERICA);
        productsSpec.put("quantity", Quantity.LARGE);
        inventory.addProduct("0003", "description of Cider", 4.6, 8.0, "BRUT", new ProductSpec(productsSpec));

        productsSpec.put("productType", ProductType.SPIRIT);
        productsSpec.put("name", Name.VODKA);
        productsSpec.put("origin", Origin.RUSSIA);
        productsSpec.put("quantity", Quantity.LARGEST);
        inventory.addProduct("0004", "description of spirit", 40.5, 15.0, "Absolut", new ProductSpec(productsSpec));




    }

}
