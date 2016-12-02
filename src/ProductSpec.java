import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Pierre on 23/11/2016.
 * This class allow to store products in a map and retrieve a product thank's to this specificities
 */
public class ProductSpec {

    private Map mapSpec;

    public ProductSpec(Map mapSpec) {

        if (mapSpec == null) {
            this.mapSpec = new HashMap();
        } else {
            this.mapSpec = new HashMap(mapSpec);
        }
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
     *         false if the spec of product if any productspec is not found
     */
    public boolean isEqual(ProductSpec productSpec){

        //We create an iterator to browse each key in a map
        Iterator it = productSpec.getMapSpecs().keySet().iterator();

        String spec;

        do{
            if(!(it.hasNext())){
                return true;
            }

            spec = (String)it.next();

        }while(this.mapSpec.get(spec).equals(productSpec.getMapSpec(spec)));

        return false;
    }
}
