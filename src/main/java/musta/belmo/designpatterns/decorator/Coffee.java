package musta.belmo.designpatterns.decorator;

/**
 * An abstract coffee interface
 */
public interface Coffee {
    /**
     * returns the ingredients of the coffee.
     *
     * @return String
     */
    default String getIngredients() {
        return "";
    }

    /**
     * gets the price of the coffee;
     *
     * @return int
     */
    default int getPrice() {
        return 0;
    }
}
