import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Pierre on 19/11/2016.
 */
public class Inventory {

    List<Product> products;


    public Inventory() {

        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product added : " + product.getName());
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

    public Product searchProduct(){
        return null;
    }

}