package hassan2.HASSAN.ASSIGNMENT;

import java.util.Scanner;

public class Q45_Scanner_Multiplying_Two_Numbers {
    public static void main(String[] args) {
//        Question 45:  Multiplying Two Numbers
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter two double values and store them in variables named num1 and num2.
//    Calculate the product of the two numbers.
//    Print the product.

        var input=new Scanner(System.in);

        double num1,num2,calculate;

        System.out.print("please enter your 1st   number: ");
        num1=input.nextDouble();

        System.out.print("please enter your 2nd  number: ");
        num2=input.nextDouble();


        System.out.println("the product of "+num1+" and "+num2+" is: "+(int)(calculate=num1*num2));





    }
}
