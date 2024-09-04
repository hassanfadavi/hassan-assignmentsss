package hassan2.Activities;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int a, b;


        System.out.print("enter value of a:");
        a = input.nextInt();

        System.out.print("enter the value of b:");
        b = input.nextInt();


        if (a < b) {
            System.out.println(  " a is smaller than " + b);
        } else if (a == b) {
            System.out.println(a + "is the same value as "+ b);
        } else {
            System.out.println(b + "is smaller than " + a);

        }
    }
}



