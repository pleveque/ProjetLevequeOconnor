import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pc_Pierre on 05/10/2016.
 */
public class Inventory {
    private List<Beers> beers;
    private List<Wines> wines;
    private List<Ciders> ciders;
    private List<Spirits> spirits;

    public Inventory(){
        beers = new LinkedList<Beers>();
        wines = new LinkedList<Wines>();
        ciders = new LinkedList<Ciders>();
        spirits = new LinkedList<Spirits>();
    }
    /**addBeers,getBeers,searchBeer, buyBeer**/

    public void addBeer(String UPC, String name, String percentage, String origin, String type, String size, double price, int quantity){
        Beers beer = new Beers(UPC,name,percentage,origin,type,size,price,quantity);
        beers.add(beer);
    }
    public Beers getBeer(String UPC){
        for (Beers x : beers){
            if (x.getUPC().equals(UPC)){
                return x;
            }
        }
        return null;
    }
    public Beers searchBeerName(String name){
        for (Beers x : beers){
            if (x.getName().equals(name)){
                return x;
            }
        }
        return null;
    }
    public void buyBeer(String UPC, int quantity){
        for (Beers x : beers){
            if (x.getUPC().equals(UPC)){
                x.setQuantity(x.getQuantity()-quantity);
            }
        }
    }

    /**addWines,getWines,searchWines, buyWines**/

    public void addWine(String UPC, String name, String year, String percentage, String origin, String type, String size, double price, int quantity){
        Wines wine = new Wines(UPC,name,year,percentage,origin,type,size,price,quantity);
        wines.add(wine);
    }
    public Wines getWine(String UPC){
        for (Wines x : wines){
            if (x.getUPC().equals(UPC)){
                return x;
            }
        }
        return null;
    }
    public Wines searchWineName(String name){
        for (Wines x : wines){
            if (x.getName().equals(name)){
                return x;
            }
        }
        return null;
    }
    public void buyWine(String UPC, int quantity){
        for (Wines x : wines){
            if (x.getUPC().equals(UPC)){
                x.setQuantity(x.getQuantity()-quantity);
            }
        }
    }

    /**addCiders,getCiders,searchCiders, buyCiders**/

    public void addCider(String UPC, String name, String percentage, String origin, String size, double price, int quantity){
        Ciders cider = new Ciders(UPC,name,percentage,origin,size,price,quantity);
        ciders.add(cider);
    }
    public Ciders getCider(String UPC){
        for (Ciders x : ciders){
            if (x.getUPC().equals(UPC)){
                return x;
            }
        }
        return null;
    }
    public Ciders searchCiderName(String name){
        for (Ciders x : ciders){
            if (x.getName().equals(name)){
                return x;
            }
        }
        return null;
    }
    public void buyCider(String UPC, int quantity){
        for (Ciders x : ciders){
            if (x.getUPC().equals(UPC)){
                x.setQuantity(x.getQuantity()-quantity);
            }
        }
    }

    /**addSpirits,getSpirits,searchSpirits, buySpirits**/

    public void addSpirit(String UPC, String name, String percentage, String type, String size, double price, int quantity){
        Spirits spirit = new Spirits(UPC,name,percentage,type,size,price,quantity);
        spirits.add(spirit);
    }
    public Spirits getSpirit(String UPC){
        for (Spirits x : spirits){
            if (x.getUPC().equals(UPC)){
                return x;
            }
        }
        return null;
    }
    public Spirits searchSpiritName(String name){
        for (Spirits x : spirits){
            if (x.getName().equals(name)){
                return x;
            }
        }
        return null;
    }
    public void buySpirit(String UPC, int quantity){
        for (Spirits x : spirits){
            if (x.getUPC().equals(UPC)){
                x.setQuantity(x.getQuantity()-quantity);
            }
        }
    }



}
