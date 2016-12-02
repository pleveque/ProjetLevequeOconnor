/**
 * Created by Pierre on 26/11/2016.
 * This class represent all name for all type of product. You can retrieve names for beer, wine, cider an spirit.
 * The name is a brand of product
 */
public enum Name {

    /**Name of beer*/
    GUINNESS,
    HEINEKEN,
    SMITHWICKS,
    PAIXDIEU,
    DEBAUCHE,
    LEFFE,
    KRONENBOURG,
    DESPERADOS,
    PELFORTH,
    CORONA,
    GRIMBERGEN,
    BAVARIA,
    TSINGTAO,
    SKOLL,

    /*Name of Wine*/
    MEDOC,
    BARSAC,
    COTE_DE_BORDEAUX,
    BLAYE,
    POMEROL,
    MARGAUX,
    SAINT_EMILION,
    COTE_DE_BLAYE,

    /*Name of Cider*/
    BULMERS,
    ORCHARD_THIEVES,
    MAGNERS,
    FALLING_APPLE,

    /*Name of spirit*/
    VODKA,
    MALIBU,
    WHISKY,
    RHUM,
    COGNAC,
    CHAMPAGNE,
    JET27,
    RICARD;


    private Name(){ }

    public String toString() {
        switch (this) {
            case GUINNESS:
                return "Guiness";
            case HEINEKEN:
                return "Heineken";
            case SMITHWICKS:
                return "Smithwicks";
            case PAIXDIEU:
                return "La Paix Dieu";
            case DEBAUCHE:
                return "La débauche";
            case LEFFE:
                return "Leffe";
            case KRONENBOURG:
                return "Kronenbourg";
            case DESPERADOS:
                return "Desperados";
            case PELFORTH:
                return "Perforth";
            case CORONA:
                return "Corona";
            case GRIMBERGEN:
                return "Grimbergen";
            case BAVARIA:
                return "Bavaria";
            case TSINGTAO:
                return "Tsingtao";
            case SKOLL:
                return "Skoll";
            case MEDOC:
                return "Medoc";
            case BARSAC:
                return "Marsac";
            case COTE_DE_BORDEAUX:
                return "Côte de Bordeaux";
            case BLAYE:
                return "Blaye";
            case POMEROL:
                return "Pomerol";
            case MARGAUX:
                return "Margaux";
            case SAINT_EMILION:
                return "Saint-Emilion";
            case COTE_DE_BLAYE:
                return "Côte de Blaye";
            case BULMERS:
                return "Bulmers";
            case ORCHARD_THIEVES:
                return "Orchaud thieves";
            case MAGNERS:
                return "Magners";
            case FALLING_APPLE:
                return "Falling Apple";
            case VODKA:
                return "Vodka";
            case MALIBU:
                return "Malibu";
            case WHISKY:
                return "Whisky";
            case RHUM:
                return "Rhum";
            case COGNAC:
                return "Cognac";
            case CHAMPAGNE:
                return "Champagne";
            case JET27:
                return "Jet 27";
            case RICARD:
                return "Ricard";
            default:
                return "unspecified";
        }
    }


}
