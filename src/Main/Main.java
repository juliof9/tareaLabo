
package Main;

import GUI.Calculadora;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setContentPane(new Calculadora());
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setResizable(false);
        calculadora.pack();
        calculadora.setVisible(true);
    }
}
