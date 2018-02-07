package musta.belmo.designpatterns.factory;

public interface Currency {
    /**
     * gets the name of this currency
     *
     * @return String
     */
    String getName();

    /**
     * gets the land(s) where this currency is used
     *
     * @return String
     */
    String getLand();

    /**
     * gets the $ US equivalent of the currency;
     *
     * @return double
     */
    double toDollar();


}
