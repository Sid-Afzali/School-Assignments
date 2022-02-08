/*
 * Sid Afzali
 */

public class Test {

     public static void main(String[] args) {

          // Testing the default constructor of the Spice class
          Spice spc1 = new Spice();
          Spice spc2 = new Spice("apple", "fruit", "Canada", "salad", "root");
          spc1.setPartOfPlant("root");
          System.out.println();
          System.out.println(
                    "Testing the set and get methods of the Spice class for the \"part of plant\" attribute: ");
          System.out.println("1st object of the Spice class=>" + spc1.getPartOfPlant());
          System.out.println("2nd object of the Spice class=>" + spc2.getPartOfPlant());
          System.out.println();

          // Testing the overriden countryOfOrigin method for the spice class
          System.out.println("Testing the overriden countryOfOrigin method for the spice class: ");
          spc1.setOrigin("Canada");
          System.out.println(spc1.getOrigin());
          System.out.println();

          // Testing the overriden howUsed method for the spice class
          System.out.println("Testing the overriden howUsed method for the spice class: ");
          spc1.setHowUsed("can be added to salad");
          System.out.println(spc1.getHowUsed());
          System.out.println();

          // Testing the toString method of the Spice class
          System.out.println("Testing the toString method of the Spice class: ");
          spc1.setName("carrot");
          spc1.getName();
          spc1.setType("vegetable");
          spc1.getType();
          System.out.println(spc1.toString());
          System.out.println();

          // Getting true value, because all the characteristics are the same.
          System.out.println("Getting true value, because all the characteristics are the same : ");
          Spice spc3 = new Spice("fruit", "grape", "Italy", "as a snack", "fruit");
          Spice spc4 = new Spice();
          spc4.setType("fruit");
          spc4.setName("grape");
          spc4.setOrigin("Italy");
          spc4.setHowUsed("as a snack");
          spc4.setPartOfPlant("fruit");
          spc4.getName();
          spc4.getType();
          spc4.getHowUsed();
          spc4.getPartOfPlant();
          spc4.getOrigin();
          System.out.println("3rd object of Spice class => " + spc3.toString());
          System.out.println("4th object of the Spice class => " + spc4.toString());
          System.out.println("----");
          System.out.println(spc3.equals(spc4));
          System.out.println();

          // Getting false, because the "howUsed" feature is different in each object.
          System.out.println("Getting false, because the \"howUsed\" feature is different in each object:");
          Spice spc5 = new Spice("fruit", "banana", "Brzil", "as a snack", "fruit");
          Spice spc6 = new Spice();
          spc6.setName("banana ");
          spc6.setType("fruit");
          spc6.setOrigin("Brazil");
          spc6.setHowUsed("with cereal");
          spc6.setPartOfPlant("fruit");
          spc6.getType();
          spc6.getName();
          spc6.getOrigin();
          spc6.getHowUsed();
          spc6.getPartOfPlant();
          spc6.setPartOfPlant("fruit");
          System.out.println("5th object of the Spice class=> " + spc5.toString());
          System.out.println("6th object of the Spice class=>" + spc6.toString());
          System.out.println("----");
          System.out.println(spc5.equals(spc6));
          System.out.println();

          // Getting false, because one of the variables of the parent class is different
          // in two objects.
          System.out
                    .println("Getting false, because one of the variables of the parent class (name) is different in two objects.");
          Spice spc7 = new Spice("fruit", "banana", "Brzil", "as a snack", "fruit");
          Spice spc8 = new Spice();
          spc8.setType("fruit");
          spc8.setName("Orange");
          spc8.setOrigin("Brazil");
          spc8.setHowUsed("as a snack");
          spc8.setPartOfPlant("fruit");
          spc8.getType();
          spc8.getName();
          spc8.getOrigin();
          spc8.getHowUsed();
          spc8.getPartOfPlant();
          System.out.println("7th object of the Spice class=> " + spc7.toString());
          System.out.println("8th object of the Spice class=>" + spc8.toString());
          System.out.println("----");
          System.out.println(spc7.equals(spc8));
          System.out.println();

          // Null check
          System.out.println("---------null check--------");
          Spice spc9 = null;
          System.out.println(spc7.equals(spc9) + " because one of the objects is null");
          System.out.println();

          // Testing the two abstract methods and the new toString of the MedicinalPlant
          // class
          System.out.println("Testing the two abstract methods and the new toString of the MedicinalPlant class ");
          MedicinalPlant mediplant1 = new MedicinalPlant("fruit", "cinammon", "Sri Lanka", "in cooking", "bulk powder");
          System.out.println("mediplant1=> " + mediplant1.toString());
          System.out.println();

          // Changing the country of Origin and \"how is used\" attribute of the mediplant
          // object by sette and getter
          System.out.println("Changing the country of Origin and \"how is used\" attribute "
                    + "of the mediplant object by setter and getters");
          mediplant1.setOrigin("South America");
          mediplant1.setHowUsed("used in baking");
          mediplant1.getOrigin();
          mediplant1.getHowUsed();
          System.out.println("new mediplant1 =>" + mediplant1.toString());
          System.out.println();

          // Testing the two abstract methods and the new toString of the Vegetable class
          System.out.println("Testing the two abstract methods and the new toString of the Vegetable class ");
          Vegetable veg1 = new Vegetable("vegetable", "carrot", "China", "can be eaten raw", 3.5);
          System.out.println("veg1=> " + veg1.toString());
          System.out.println();

          // Changing the country of Origin and \"how is used\" attribute of the veg1
          // object by sette and getter
          System.out.println("Changing the country of Origin and \"how is used\" attribute "
                    + "of the veg1 object by setter and getters");
          veg1.setOrigin("US");
          veg1.setHowUsed("can be prepared as a juice");
          veg1.getOrigin();
          veg1.getHowUsed();
          System.out.println("new veg1 =>" + veg1.toString());
          System.out.println();
     }
}