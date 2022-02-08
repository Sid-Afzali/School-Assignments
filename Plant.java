/*
 * Sid Afzali
 */

public abstract class Plant implements PlantInfo {
     private String type;
     private String name;
     private String originCountry;
     private String howIsUsed;

     // default constructor
     public Plant() {
          name = " undefined";
          type = " undefined";
          originCountry = "undefined";
          howIsUsed = "undefined";
     }

     // parametarasied constructor
     public Plant(String type, String name, String originCountry, String howIsUsed) {
          this.name = name;
          this.type = type;
          this.originCountry = originCountry;
          this.howIsUsed = howIsUsed;
     }

     // setName method for the name attribute
     public void setName(String name) {
          this.name = name;
     }

     // getName method for the name attribute
     public String getName() {
          return name;
     }

     // setType method for the type attribute
     public void setType(String type) {
          this.type = type;
     }

     // getType method for the type attribute
     public String getType() {
          return type;
     }

     public boolean equals(Object obj) {

          if (this == obj) // self check
               return true;

          if (obj == null) // null check
               return false;

          if (!(obj instanceof Plant)) // type check and cast
               return false;

          Plant plant = (Plant) obj;

          return this.name.equals(plant.name)
                    && this.type.equals(plant.type)
                    && this.getOrigin().equals(plant.getOrigin())
                    && this.getHowUsed().equals(plant.getHowUsed());
     }

     // toString method for printing out all the data
     public String toString() {
          return "Type is: " + type + " , Name is: " + name +
                    ", country of origin: " + originCountry
                    + ", how is used? " + howIsUsed;
     }

     public String getOrigin() {
          return originCountry;
     }

     public void setOrigin(String originCountry) {
          this.originCountry = originCountry;
     }

     public String getHowUsed() {
          return howIsUsed;
     }

     public void setHowUsed(String howIsUsed) {
          this.howIsUsed = howIsUsed;
     }

}