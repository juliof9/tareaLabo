package ClasesAbstractas;

import OperacionAritmetica.Aritmetica;
import OperacionConversion.Conversion;

public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Conversion getConversion(String type);
}
