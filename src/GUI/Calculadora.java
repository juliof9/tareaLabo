package GUI;

import ClasesAbstractas.AbstractFactory;
import ClasesAbstractas.FactoryProducer;
import OperacionAritmetica.Aritmetica;
import OperacionConversion.Conversion;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JPanel{
    public int WIDTH = 300, widthTF = 120, widthB = 80;
    public int HEIGTH= 300, heightTF = 30, heightB = 30;
    public JTextField textF1,textF2,textF3;
    public JButton Binario,sumar,restar,multiplicar,dividir,binario;
    
    public Calculadora() {
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(20,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(100,200,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(165, 40,widthTF,heightTF));
        
        restar = new JButton("Restar");
        restar.setBounds(new Rectangle(200,80,widthB,heightB));
        
        dividir = new JButton("Dividir");
        dividir.setBounds(new Rectangle(50,80,widthB,heightB));
        
        sumar = new JButton("Sumar");
        sumar.setBounds(new Rectangle(50,155,widthB,heightB));
        
        multiplicar = new JButton("Multiplicar");
        multiplicar.setBounds(new Rectangle(200,155,widthB,heightB));
        
        Binario = new JButton("Binario");
        Binario.setBounds(new Rectangle(120,115,widthB,heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(false);
        
        sumar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int a,b,resultado;
                a=Integer.parseInt(textF1.getText());
                b=Integer.parseInt(textF3.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetica Suma = factory.getAritmetica("Suma");
                resultado = Suma.calculo(a,b);
                textF2.setText(String.valueOf(resultado));
            }
        });
        
        restar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                int a,b,resultado;
                a=Integer.parseInt(textF1.getText());
                b=Integer.parseInt(textF3.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetica Resta = factory.getAritmetica("Resta");
                resultado = Resta.calculo(a,b);
                textF2.setText(String.valueOf(resultado));
            }
        });
        
        multiplicar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                int a,b,resultado;
                a=Integer.parseInt(textF1.getText());
                b=Integer.parseInt(textF3.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetica multiplicar = factory.getAritmetica("Multiplicacion");
                resultado = multiplicar.calculo(a,b);
                textF2.setText(String.valueOf(resultado));
            }
        });
        
        dividir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                int a,b,resultado;
                a=Integer.parseInt(textF1.getText());
                b=Integer.parseInt(textF3.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetica dividir = factory.getAritmetica("Division");
                resultado = dividir.calculo(a,b);
                textF2.setText(String.valueOf(resultado));
            }
        });
        
        Binario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                int a,resultado;
                a=Integer.parseInt(textF1.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetica");
                Conversion binario = factory.getConversion("Binario");
                resultado = binario.conversiones(a);
                textF2.setText(String.valueOf(resultado));
            }
        });
        
        add(textF1);
        add(textF3);
        add(Binario);
        add(restar);
        add(dividir);
        add(multiplicar);
        add(sumar);
        add(textF2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGTH));
    }
}
