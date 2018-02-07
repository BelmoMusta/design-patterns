package musta.belmo.designpatterns.factory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CurrencyFactoryTest {

    @Test
    public void getCurrency() throws Exception {
        Currency dollar = CurrencyFactory.getCurrency(CurrencyType.DOLLAR);
        Currency mad = CurrencyFactory.getCurrency(CurrencyType.MAD);
        Currency euro = CurrencyFactory.getCurrency(CurrencyType.EURO);
        assertEquals(dollar.getName(), "$");
        assertEquals(mad.getName(), "MAD");
        assertEquals(euro.getName(), "Euro");
    }

}