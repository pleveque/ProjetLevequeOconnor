import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Pierre on 23/11/2016.
 */
public class ProductSpec {

    private Map mapSpec;

    public ProductSpec(Map mapSpec) {

        this.mapSpec = new HashMap();
    }

    public Object getMapSpec(String spec){
        return this.mapSpec.get(spec);
    }

    public Map getMapSpecs() {
        return this.mapSpec;
    }

    /**
     * This method allow to search if a spec of product searched correspond to another in the map
     * @param productSpec
     * @return true if the spec of product correspond to another in the map
     *         false if the spec of product is none productspec is found
     */
    public boolean isEqual(ProductSpec productSpec){

        //We create an iterator to browse each key in a map
        Iterator it = productSpec.getMapSpecs().keySet().iterator();

        String value;

        do{
            if(!(it.hasNext())){
                return true;
            }

            value = (String)it.next();

        }while(this.mapSpec.get(value).equals(productSpec.getMapSpec(value)));

        return false;
    }
}
