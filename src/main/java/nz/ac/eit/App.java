package nz.ac.eit;

import java.util.Random;
import java.util.Scanner;

public class App {
    /* Random Number Generator found at : https://stackoverflow.com/questions/5271598/java-generate-random-number-between-two-given-values */
    /*this int needs to be global for the computer class to be able to use it */
    /* Where The Main part starts*/

    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player(2 * game.randomRoll());
        Computer computer = new Computer(2 * game.randomRoll());
        Scanner scan = new Scanner(System.in);
        String input = "";

        /*Loop adding numbers until the player sticks or goes over 21 */
        while (!input.equals("STICK")) {
            System.out.println("Your Current Total is : " + player.getScore());
            System.out.println("Would you like to HIT or STICK (use any case for input)");
            input = scan.nextLine();
            /* Convert all string input into upper case */
            input = input.toUpperCase();

            if (input.equals("HIT")) {
                player.setScore(player.getScore()+game.randomRoll());
                if (player.getScore() >= 21) {
                    break;
                }
            } else if (input.equals("STICK")) {
                break;
            } else {
                System.out.println("Oops! you didn't input either HIT or STICK, let's try that again");
            }
        }
        /* After Breaking out of the loop, the players turn is considered complete*/
        System.out.println(game.blackJackCheck(player.getScore()));
        computer.ComputerTurn();
    }
}