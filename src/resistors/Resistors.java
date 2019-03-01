/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resistors;

import javax.swing.JOptionPane;

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
        int[] colours = new int[9];
        int a1, a2, resistance;
        String c1, c2, c3, finalmix;
        String[] mix = new String[]{};
        String[] Text = new String[]{"BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET", "GREY", "WHITE"};

        String window = JOptionPane.showInputDialog("What is your resistors colour code?" + "\n" + "Separate each colour by hyphens" + "\n" + "Ex. Red-Orange-Black");

        c1 = window.substring(0, window.indexOf("-"));
        c2 = window.substring(window.indexOf("-") + 1, window.lastIndexOf("-"));
        c3 = window.substring(window.lastIndexOf("-") + 1);
        String[] inputs = new String[]{c1, c2, c3};
        boolean input = true;
        
        if(input == true){
        for (int i = 0; i <= 2; i++) {
            for (int x = 0; x < colours.length; x++) {
                if (inputs[0].equalsIgnoreCase(Text[x])) {
                    mix[0] = Integer.toString(colours[x]);
                } else if (inputs[1].equalsIgnoreCase(Text[x])) {
                    mix[1] = Integer.toString(colours[x]);
                } else if (inputs[2].equalsIgnoreCase(Text[x])) {
                    a2 = (int) Math.pow(10, colours[x]);
                }
            }
        }
        finalmix = mix[0] + mix[1];
        a1 = Integer.parseInt(finalmix);
       // resistance = a1 * a2;
        }
       
        System.out.print(mix[0]);
    }
}
