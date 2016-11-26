/**
 * Created by Pierre on 26/11/2016.
 */
public enum Origin {

    FRANCE,
    GERMANY,
    ITALIA,
    IRELAND,
    ESPANA,
    FINLAND,
    MEXICO,
    AMERICA,
    CANADA,
    RUSSIA,
    ENGLAND,
    NETHERLANDS,
    GREECE,
    PORTUGAL,
    SWEDEN,
    POLAND,
    UKRAINE,
    CZECH_REPUBLIC,
    DENMARK;


    private Origin(){}

    public String toString() {
        switch (this) {
            case FRANCE: return "France";
            case GERMANY: return "Germany";
            case ITALIA: return "Italia";
            case IRELAND: return "Ireland";
            case ESPANA: return "Espana";
            case FINLAND: return "Finland";
            case MEXICO: return "Mexico";
            case AMERICA: return "America";
            case CANADA: return "Canada";
            case RUSSIA: return "Russia";
            case ENGLAND: return "England";
            case NETHERLANDS: return "Netherlands";
            case GREECE: return "Greece";
            case PORTUGAL: return "Portugal";
            case SWEDEN: return "Sweden";
            case POLAND: return "Poland";
            case UKRAINE: return "Ukraine";
            case CZECH_REPUBLIC: return "Czech Republic";
            case DENMARK: return "Denmark";
            default : return "unspecified";
        }
    }
}
