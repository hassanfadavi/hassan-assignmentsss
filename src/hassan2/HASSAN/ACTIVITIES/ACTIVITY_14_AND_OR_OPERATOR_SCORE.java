package HASSAN.ACTIVITIES;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ACTIVITY_14_AND_OR_OPERATOR_SCORE {
    public static void main(String[] args) {


        /*
         *
         * 90 -- 100 --> A
         * 80 -- 89 --> B
         * 70 -- 79 --> C
         *  F
         *
         * */


        var input = new Scanner(System.in);

        int score;
        char grade=0;

        System.out.print("please enter the score:");
        score = input.nextInt();

        if ((score >= 90) && (score <= 100)) {
            grade='A';
        } else if ((score >= 80) && (score <= 89)) {
            grade='B';
        } else if ((score >= 70) && (score <= 79)) {
            grade='C';
        } else if ((score >= 0) && (score <= 69))
            grade='F';

        System.out.println("the grade is: "+ grade);


        //or
        if ((score<0)||(score>100)) System.out.println("invalid score");
         else if ((score >= 90) && (score <= 100)) {
            grade='A';
        } else if (score >= 80){
            grade='B';
        } else if (score >= 70) {
            grade='C';
        } else
            grade='F';

        System.out.println("the grade is: "+ grade);

    }

}
