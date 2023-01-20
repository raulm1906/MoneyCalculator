package persistence;

import model.Currency;
import java.util.List;

/**
 *
 * @author Raul
 */

public interface CurrencyLoader {

    List<Currency> loadAllCurrencies();

}