/**
 * Created by Pierre on 25/11/2016.
 * This class represent all the type of product available on the application
 */
public enum ProductType {

    WINE, BEER, CIDER, SPIRIT;


    private  ProductType(){ }

    public String toString() {
        switch (this){
            case WINE : return "Wine";
            case BEER : return "Beer";
            case CIDER : return "Cider";
            case SPIRIT : return "Spirit";
            default: return "unspecified";
        }
    }
}