/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

import javax.swing.JOptionPane;

/**
 *
 * @author VILLACORTA_COMP111
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle1 james=new Circle1();
          String input = JOptionPane.showInputDialog(null, "Enter the radius of the circle:");
          double A = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null,"Radius:"+ james.getRadius(A)+"\nCircumference:"+ james.Compute_Circumference(A)+"\nArea:"+james.Compute_Area(A)+"\nDiameter:"+ james.Compute_diameter(A)+"\nArc:"+james.Compute_Arc(A,10));
    }
    
}