/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import javax.swing.JFrame;

/**
 *
 * @author Desarrollo
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana vent = new Ventana();
        
        vent.setSize(200, 200);
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vent.setVisible(true);
    }
    
}
