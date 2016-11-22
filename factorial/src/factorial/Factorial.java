/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javax.swing.JOptionPane;
import m_factorial.m_factorial;

/**
 *
 * @author usuario
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lim;
        
        lim=Integer.parseInt(JOptionPane.showInputDialog("ingres un limite"));
        
        m_factorial ob1=new m_factorial(lim);
        
        ob1.fac();
        
        
        
        
        // TODO code application logic here
    }
    
}
