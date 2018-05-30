package ClasesAbstractas;

import OperacionAritmetica.FactoryAritmetica;
import OperacionConversion.FactoryConversion;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Aritmetica":
                return new FactoryAritmetica();
            case "Conversion":
                return new FactoryConversion();
        }
        return null;
    }
}
