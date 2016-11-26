/**
 * Created by Pierre on 26/11/2016.
 */
public enum Quantity {
/*Quantity is by liter*/

    SMALL  /*(0.33)*/,
    MEDIUM  /*(0.75)*/,
    LITER   /*(1.0)*/,
    LARGE   /*(1.5)*/,
    LARGEST /*(2.0)*/;

    Quantity() { }

    public String toString() {
        switch (this) {
            case SMALL:
                return "0.33";
            case MEDIUM:
                return "0.75";
            case LITER:
                return "1.0";
            case LARGE:
                return "1.5";
            case LARGEST:
                return "2.0";
            default:
                return "unspecified";
        }
    }
}
