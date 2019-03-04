/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resistors;

import javax.swing.JOptionPane;
import java.math.*;

/**
 *
 * @author kyluk1259
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] colours = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String c1, c2, c3, finalmix, power;
        String[] mix = new String[]{"", "", ""};
        String[] Text = new String[]{"BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET", "GREY", "WHITE"};

        String window = JOptionPane.showInputDialog("What is your resistors colour code?" + "\n" + "Separate each colour by hyphens" + "\n" + "Ex. Red-Orange-Black");

        c1 = window.substring(0, window.indexOf("-"));
        c2 = window.substring(window.indexOf("-") + 1, window.lastIndexOf("-"));
        c3 = window.substring(window.lastIndexOf("-") + 1);
        String[] inputs = new String[]{c1, c2, c3};
        boolean input = true;

        try {
            if (input == true) {
                int a1, a2, resistance;
                for (int i = 0; i <= 2; i++) {
                    for (int x = 0; x < 9; x++) {
                        if (inputs[i].equalsIgnoreCase(Text[x])) {
                            mix[i] = Integer.toString(colours[x]);
                            //System.out.print(mix[i]);
                        }
                    }
                }
                finalmix = mix[0] + mix[1];
                a1 = Integer.parseInt(finalmix);
                a2 = (int)(Math.pow(10, Integer.parseInt(mix[2])));
                resistance = (a1*a2);
                JOptionPane.showMessageDialog(null,"You entered: " + window + "\nThe value of the resistor is: " + resistance + "Ω");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
