/****
 * /*
 * Sid Afzali
 *
 * Program Description: this program inherits some data from its parent
 * class(Plant) and assigns one more variable (part of the Plant which is being
 * used)
 * by both using constructor and setter & getter methods.
 * It overrides the two abstract methods, as well.
 * Spice class can compare the content of each two objects with the overriden
 * equals method.
 * Finally, by toString method it prints all the data.
 ****/

public class Spice extends Plant {
     private String partOfPlant;

     // default constructor
     public Spice() {
          super();
          partOfPlant = "undefined";
     }

     // parametarasied constructor
     public Spice(String type, String name, String originCountry, String howIsUed, String partOfPlant) {
          super(type, name, originCountry, howIsUed);
          this.partOfPlant = partOfPlant;
     }

     // setPartOfPlant method for the part of plant which is being used
     public void setPartOfPlant(String partOfPlant) {
          this.partOfPlant = partOfPlant;
     }

     // getPartOfPlant method for the part of plant which is being used
     public String getPartOfPlant() {
          return partOfPlant;
     }

     // abstract method in the parent class which has been overriden
     public String countryOfOrigin() {
          return this.getOrigin();
     }

     // abstract method in the parent class which has been overriden
     public String howUsed() {
          return this.getHowUsed();
     }

     @Override
     // equals method which has been overriden for the Spice class
     public boolean equals(Object obj) {

          if (super.equals(obj)) {

               Spice spice = (Spice) obj;
               return super.equals(spice) &&
                         this.partOfPlant.equals(spice.partOfPlant);

          } else
               return false;
     }

     // toString method for printing out all the data
     public String toString() {
          return super.toString() +
                    " and what part of the plant is used? " + partOfPlant;
     }
}