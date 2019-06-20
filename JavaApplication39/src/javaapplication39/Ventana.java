/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Desarrollo
 */
public class Ventana extends JFrame{
    private JTextField txtNombre;
    private JPasswordField txtPass;
    private JLabel lblText;
    private JButton btnEnviar;
    
    Ventana(){
        super("Esto es solo un ejemplo");
    }
    
}
