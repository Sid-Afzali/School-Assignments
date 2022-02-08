/*
 * Sid Afzali
 */

public class MedicinalPlant extends Plant {
     private String sold;

     // default constructor
     public MedicinalPlant() {
          super();
          sold = " undefined";
     }

     // parametarasied constructor
     public MedicinalPlant(String type, String name, String originCountry, String howIsUsed, String sold) {
          super(type, name, originCountry, howIsUsed);
          this.sold = sold;
     }

     // setSold method for the "how sold" attribute
     public void setSold(String sold) {
          this.sold = sold;
     }

     // getSold method for the "how sold" attribute
     public String getSold() {
          return sold;
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
     // equals method for checking the name of type of any two plants
     public boolean equals(Object obj) {

          if (super.equals(obj)) {

               MedicinalPlant mediplant = (MedicinalPlant) obj;
               return super.equals(mediplant) && this.sold.equals(mediplant.getSold());

          } else
               return false;

     }

     // toString method for printing out all the data
     public String toString() {
          return super.toString() + " , how is sold: " + sold;
     }
}