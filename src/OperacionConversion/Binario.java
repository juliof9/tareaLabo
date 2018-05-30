package OperacionConversion;

import java.util.ArrayList;

public class Binario implements Conversion{
    @Override
    public String conversiones(int a){
        ArrayList<String>binario = new ArrayList<String>();
        int c;
        String binarioString = "";
        
        do{
            c = a%2;
            a = a/2;
            binario.add(0,Integer.toString(c));
        }while(a > 2);
        
        binario.add(0, Integer.toString(a));
        
        for (int i = 0; i < binario.size(); i++){
            binarioString += binario.get(i);
        }
        return binarioString;
}    
