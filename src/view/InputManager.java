package view;

import model.Result;
import persistence.ExchangeRateLoader;
/**
 *
 * @author Raúl Marrero Marichal
 */


public interface InputManager {
    Result buildResult(ExchangeRateLoader erl);
}
