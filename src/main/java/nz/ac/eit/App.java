package nz.ac.eit;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    /** Random Number Generator found at : https://stackoverflow.com/questions/5271598/java-generate-random-number-between-two-given-values**/
    public void randomRoll(){
        Random r = new Random();
        int low = 1;
        int high = 10;
        int result = r.nextInt(high-low) + low;
    }


    /** Where The Main part starts**/
    public static void main( String[] args )
    {
        int playerTotal = 0;
        int computerTotal = 0;
        System.out.println( "Hello World!");



    }
}
