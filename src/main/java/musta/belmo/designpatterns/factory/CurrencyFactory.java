package musta.belmo.designpatterns.factory;

public class CurrencyFactory {
    private CurrencyFactory() {
    }

    public static Currency getCurrency(CurrencyType type) {
        Currency ret;

        switch (type) {
            case MAD:
                ret = new MAD();
                break;
            case EURO:
                ret = new Euro();
                break;
            case DOLLAR:
                ret = new Dollar();
                break;
            /**
             *  more as currencies go here
             */
            default:
                ret = null;
        }
        return ret;
    }
}
