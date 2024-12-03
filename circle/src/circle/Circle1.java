/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author VILLACORTA_COMP111
 */
class Circle1 {
    double Circumference;
 double Area;
 double diameter;
 double arc;
 double angle;
 private double radius;
 

 double Compute_Circumference (double r){
     return 2*Math.PI*r;
 }
  double Compute_Area (double r){
     return Math.PI*r*r;
 }
   double Compute_diameter  (double r){
     return 2*r;
 }
   double Compute_Arc (double r, double angle){
     double radians = Math.toRadians(angle);
     return radians*r;
 }
    public double getRadius(double r) {
        return r;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


}
