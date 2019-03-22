/*
   Matt Ludwig
   22 March 2019
   The class for the car tester program; This covers the attributes of various cars
 */
package cartester;

/**
 *
 * @author User
 */
public class Car {
   //variables for the attributes
   private String carBrand, carModel, year;
   private double maxSpeed, price, height;   // maxSpeed, height in metric units
    
   //constructors
   public Car() {
       carBrand = "Toyota";
       carModel = "Corolla";
       year = "2017";
       maxSpeed = 175;
       price = 19500;
       height = 1.45;
   }
   
   public void honk () {
       System.out.println("HONKKKK");
   }
    
    // method to display the constructor attributes of the car
    public String toString() {
        String attributes = "Manufacturer: " + carBrand + "\n";
        attributes += "Model: " + carModel + "\n";
        attributes += "Year: " + year + "\n";
        attributes += "Maximum Speed" + maxSpeed + "km/h"+ "\n" ;
        attributes += "Price: " +"$"+ price + "\n";
        attributes += "Height (tires to roof):" + height + "m" + "\n";
        // return the printing variable, attributes
        return attributes;
    }
}
