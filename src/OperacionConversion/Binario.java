package OperacionConversion;

public class Binario implements Conversion{
    @Override
    public String conversiones(int a){
         return Integer.toBinaryString(a);
    }
}