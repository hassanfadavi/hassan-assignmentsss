package week_3.day_2.activities;

public class PrecedenceExample {

    public static void main(String[] args) {


        /*
        *
        *  50 + 10 - 5
        *  60 - 5
        *  55
        *
        * */

        /*
         *
         *  50 + (10 - 5)
         *  55
         *
         * */

        /*
        *
        * ( 5 + 10 ) * 2 + ( 10 + 0 ) || 40
        *   15 * 2 + 10
        *   30 + 10
        *   40
        * */

        /*
        *
        * [ ( 20 + 10 ) * ( 5 * 200 ) + ( 200 * 10 ) + 55 ]
        * [  30 * 1000 + 2000 + 55 ]
        * [ 30000 + 2000 + 55 ]
        * [ 32000 + 55 ]
        * [ 32055 ]
        * */


        /*
         *
         *  ( 3 * 2 / 2 ) + 5 * ( 10 / 2 ) * 10 + ( 0 - 2 ) + ( 0 + 0 ) * 0
         *  3 + 5 * 5 * 10 - 2 + 0 * 0
         *  3 + 25 * 10 - 2 + 0 * 0
         *  3 + 250 - 2 + 0 * 0
         *  3 + 250 - 2 + 0
         *  253 - 2 + 0
         *  251
         *
         * */

        System.out.println( 50 + 10 - 5 );
        System.out.println( 50 + (10 - 5) );
        System.out.println( ( 5 + 10 ) * 2 + ( 10 + 0 )  );
        System.out.println( ( ( 20 + 10 ) * ( 5 * 200 ) + ( 200 * 10 ) + 55 )  );
        System.out.println( ( 3 * 2 / 2 ) + 5 * ( 10 / 2 ) * 10 + ( 0 - 2 ) + ( 0 + 0 ) * 0  );

    }

}
