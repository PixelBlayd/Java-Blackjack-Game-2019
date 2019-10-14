package nz.ac.eit;

import java.util.Random;
import java.util.Scanner;

public class App 
{
    /* Random Number Generator found at : https://stackoverflow.com/questions/5271598/java-generate-random-number-between-two-given-values */
    public static int randomRoll(){
        Random r = new Random();
        int low = 1;
        int high = 6;
        return r.nextInt(high-low) + low;
    }

    /*this int needs to be global for the computer class to be able to use it */
    public static int playerTotal = 0;

    /* Where The Main part starts*/
    public static void main( String[] args ) {
        Computer compClass = new Computer();
        String input = "";
        playerTotal += 2 * randomRoll();

        /*Loop adding numbers until the player sticks or goes over 21 */
        while (!input.equals("STICK")) {
            System.out.println("Your Current Total is : " + playerTotal);
            System.out.println("Would you like to HIT or STICK (use any case for input)");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            /* Convert all string input into upper case */
            input = input.toUpperCase();

            if (input.equals("HIT")){
                playerTotal += randomRoll();
                if (playerTotal >= 21)
                {
                    break;
                }
            }
            else if (input.equals("STICK")){
                break;
            }
            else {
                System.out.println("Oops! you didn't input either HIT or STICK, let's try that again");
            }
        }
        /* After Breaking out of the loop, the players turn is considered complete*/

        if (playerTotal > 21){
            System.out.println("Your hand has exceeded 21. YOU BUST...");
            System.exit(0);
        }
        else if (playerTotal == 21){
            System.out.println("Your hand is 21. YOU WIN!!!");
            System.exit(0);
        }

        /* If the player is still beatable and hasn't busted, move onto the computer's turn*/
        compClass.ComputerTurn();
    }
}
