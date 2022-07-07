/*
La sentencia if es :

if(condicion){
instruccion
}
else{
instruccion2
}
*/
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author richa
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int numero1,numero2,resultado,opcion;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Escoge una opcion:\n 1:Suma \n 2:Resta\n 3:Multiplicacion\n 4:Division"));
        
        switch(opcion){
            case 1: JOptionPane.showMessageDialog(null, "Has escogido suma");;
                
                
           numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
           numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro numero"));
        
           resultado=numero1+numero2;
        
         JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
         break;
            case 2: JOptionPane.showMessageDialog(null, "Has escogido resta");
            numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
           numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro numero"));
        
           resultado=numero1-numero2;
        
         JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
         break;
         
         case 3: JOptionPane.showMessageDialog(null, "Has escogido multiplicacion");
            numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un numero"));
           numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa otro numero"));
        
           resultado=numero1*numero2;
        
         JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
         break;
         
         case 4: JOptionPane.showMessageDialog(null, "Has escogido division");
            numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
           numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro numero"));
        
           resultado=numero1/numero2;
        
         JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
         break;
         
         default:JOptionPane.showMessageDialog(null, "No has seleccionado una opcion correspondiente");
         
            
        
        
        }
        
    }
    
    
    
    
}
