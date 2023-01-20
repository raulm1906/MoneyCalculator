package persistence;

import model.Currency;
import model.ExchangeRate;

/**
 *
 * @author Raúl Marrero Marichal
 */

import java.io.IOException;

public interface ExchangeRateLoader {

    ExchangeRate loadExchangeRate(Currency from, Currency to) 
            throws IOException;

}
