/**
 * Created by Pierre on 26/11/2016.
 * This class represent the possible quantity for a product. The quantity is in liter
 */
public enum Quantity {

    SMALL  /*(0.33)*/,
    MEDIUM  /*(0.75)*/,
    LITER   /*(1.0)*/,
    LARGE   /*(1.5)*/,
    LARGEST /*(2.0)*/;

    Quantity() { }

    public String toString() {
        switch (this) {
            case SMALL:
                return "0.33 L";
            case MEDIUM:
                return "0.75 L";
            case LITER:
                return "1.0 L";
            case LARGE:
                return "1.5 L";
            case LARGEST:
                return "2.0 L";
            default:
                return "unspecified";
        }
    }
}
