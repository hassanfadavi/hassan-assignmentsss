package HASSAN.ACTIVITIES;

import java.rmi.UnexpectedException;
import java.util.Scanner;

public class ACTIVITY_4 {

    public static void main(String[] args) {

           /*
    Question 1: Weather Decisions

    1. Declare three boolean variables: isRaining, hasUmbrella, and isWindy.
    Assign any values of your choice to these variables.
    Write a condition to determine if you should go out or stay indoors. What is the result based on your values?
    Using the same variables, determine if you should take an umbrella when going out. Which conditions
    influenced your decision?
    Finally, decide if you should wear a windbreaker based on the given conditions.
*/


        //??????????????

        var input = new Scanner(System.in);


        boolean isRaining;
//        boolean hasUmberella;
//        boolean isWindy;

        System.out.println("is raining");
        isRaining = input.nextBoolean();
//
//        System.out.println("iswindy");
//        isWindy = input.nextBoolean();

        if (isRaining = true) {
            System.out.println("you should go out");
            if (isRaining = false) {
                System.out.println("has an umberrella");
            } else {
                System.out.println("you should stay indoors.");
            }
        }
             else {
            System.out.println("c");
        }














    }

}



