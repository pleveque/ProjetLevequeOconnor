import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pierre on 19/11/2016.
 */
public class Inventory {

    List<Product> products;


    public Inventory() {

        products = new ArrayList<>();
    }

    public void addProduct(String serialNumber, String description, double percentageAlcohol, double price, String typeAlcohol, ProductSpec productSpec){
        Product product = new Product(serialNumber, description, percentageAlcohol, price, typeAlcohol, productSpec);
        products.add(product);
        System.out.println("Product added : " + product.getSerialNumber());
    }

    public Product getProduct(String serialNumber){

        for (Iterator i = products.iterator(); i.hasNext();)
        {
            Product product = (Product) i.next();
            if (product.getSerialNumber().equals(serialNumber)) {
                System.out.println("Product found !");
                return product;
            }
        }
        return null;
    }

    public List<Product> searchProduct(ProductSpec searchProduct){

        List productFound = new LinkedList();

        for( Iterator ite = products.iterator(); ite.hasNext();){

            Product product = (Product)ite.next();

            if(product.getProductSpec().isEqual(searchProduct)){
                productFound.add(product);
            }
        }

        return productFound;
    }

}