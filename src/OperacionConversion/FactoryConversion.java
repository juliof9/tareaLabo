package OperacionConversion;

import ClasesAbstractas.AbstractFactory;
import OperacionAritmetica.Aritmetica;

public class FactoryConversion implements AbstractFactory{
    
    @Override
    public Conversion getConversion(String type){
        switch(type){
            case "Binario":
                return new Binario();
        }
        return null;
    }
    
    @Override
    public Aritmetica getAritmetica(String type){
        return null;
    }
}
