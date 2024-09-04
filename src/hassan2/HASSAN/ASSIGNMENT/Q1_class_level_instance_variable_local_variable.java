package HASSAN.ASSIGNMENT;

public class Q1_class_level_instance_variable_local_variable {

   static int one=10;

   String word="Hello";

    public static void main(String[] args) {

//
//        Question 1: Understanding Variables in Java
//
//        Step 1: Creating a Class and Main Method
//
//        Create a new Java class named VariableDemo.
//        Inside the VariableDemo class, create a main method.
//
//        Step 2: Declaring and Initializing Class-Level (Static) Variables
//
//        Inside the VariableDemo class but outside the main method, declare a static variable classLevelVar of type int and initialize it with the value 10.
//
//        Step 3: Declaring and Initializing Instance Variables
//
//        Inside the VariableDemo class but outside the main method, declare an instance variable instanceVar of type String and initialize it with the value "Hello".
//
//                Step 4: Declaring and Initializing Local Variables
//
//        Inside the main method, declare a local variable localVar of type double and initialize it with the value 20.5.
//
//                Step 5: Modifying and Printing Variables
//
//        Inside the main method, modify the value of localVar to 30.5.
//                Print the value of localVar using System.out.println.
//                Print the value of classLevelVar using System.out.println.
//                To access the instance variable instanceVar, create an object of the VariableDemo class and print instanceVar using System.out.println.
//


        System.out.println(one);//Class-Level (Static) Variables

        Q1_class_level_instance_variable_local_variable obj=new Q1_class_level_instance_variable_local_variable();
        System.out.println(obj.word);  //Instance Variables

        double num=20.5;
        System.out.println(num); // Local Variables


    }
}
