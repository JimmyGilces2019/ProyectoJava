/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.FlowLayout;
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
    private JLabel lblText, lblText2;
    private JButton btnEnviar;
    private FlowLayout esquema;
    
    Ventana(){
        super("Esto es solo un ejemplo");
        
        //CREACION DEL ESQUEMA
        esquema = new FlowLayout();
        
        this.setLayout(esquema);
        //INICIALIZAION DE LOS COMPONENETES
        txtNombre = new JTextField(20);
        txtPass = new JPasswordField(20);
        lblText = new JLabel("Ingresa su nombre");
        lblText2 = new JLabel("Ingresa su clave");
        btnEnviar = new JButton("Enviar");
        
        add(lblText);
        add(txtNombre);
        add(lblText2);
        add(txtPass);
        add(btnEnviar);
    }
    
}
