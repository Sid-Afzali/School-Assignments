/****
 * Name: Sid Afzali
 * Program Description: this program inherits some data from its parent
 * class(Plant) and assigns a price to the Vegetable.
 * by both using constructor and setter & getter methods.
 * it overrides the two abstract methods, as well.
 * Finally, by toString method it prints all the data.
 ****/

public class Vegetable extends Plant {
     private double price;

     // default constructor
     public Vegetable() {
          super();
          price = 0.00;
     }

     // parametarasied constructor
     public Vegetable(String type, String name, String countryOrigin, String howIsUsed, double price) {
          super(type, name, countryOrigin, howIsUsed);
          this.price = price;
     }

     // setPrice method for the price attribute
     public void setPrice(double price) {
          this.price = price;
     }

     // getPrice method for the price attribute
     public double getPrice() {
          return price;
     }

     // abstract method in the parent class which has been overriden
     public String countryOfOrigin() {
          return this.getOrigin();
     }

     // abstract method in the parent class which has been overriden
     public String howUsed() {
          return this.getHowUsed();
     }

     // toString method for printing out all the data
     public String toString() {
          return super.toString() + " and price is: $" + price;
     }
}