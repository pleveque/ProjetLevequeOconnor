/**
 * Created by Jerome on 01-Dec-16.
 */
public abstract class Alcohol {
    public String UPC, name, percentage, size;
    public double price;
    public int quantity;



    abstract public String getUPC();
    abstract public void setUPC(String UPC);
    abstract public String getName();
    abstract public void setName(String name);
    abstract public String getPercentage();
    abstract public void setPercentage(String percentage);
    abstract public String getSize();
    abstract public void setSize(String size);
    abstract public double getPrice();
    abstract public void setPrice(double price);
    abstract public int getQuantity();
    abstract public void setQuantity(int quantity);
}
