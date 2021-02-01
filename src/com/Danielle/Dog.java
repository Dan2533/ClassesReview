package com.Danielle;

/* The text editor contains a Dog class.
   Play around with the code!
   Try to add and remove instance fields.
   Create instances with different values.
   Access and print different fields.
 */

public class Dog {
  //Instance field
    String breed;
    boolean hasOwner;
    int age;

    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
      //Constructor method
        System.out.println("Constructor invoked!");
      //Value of parameter dogBreed assigned to instance field breed
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
      //Create instance: use "new operator and invoke constructor
        Dog fido = new Dog("poodle", false, 4);
        Dog nunzio = new Dog("shiba inu", true, 12);
      //Fields are accessed using: the instance name, '.' operator and the field name.
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Main method finished");
    }
}