package OperacionAritmetica;

import ClasesAbstractas.AbstractFactory;
import OperacionConversion.Conversion;

public class FactoryAritmetica implements AbstractFactory{
    
    @Override
    public Conversion getConversion(String type){
        return null;
    }
    
    @Override
    public Aritmetica getAritmetica(String type){
        switch(type){
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Multiplicacion":
                return new Multiplicacion();
            case "Division":
                return new Division();
        }
        return null;
    }
}
