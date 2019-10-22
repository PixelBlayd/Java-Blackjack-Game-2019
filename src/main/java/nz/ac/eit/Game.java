package nz.ac.eit;

import java.util.Random;

public class Game {
    //Constructor
    public Game(){

    }
    //Methods
    public int randomRoll() {
        Random r = new Random();
        int low = 1;
        int high = 6;
        return r.nextInt(high - low) + low;
    }
    public String blackJackCheck(int score){
        if (score > 21) {
            return "Your hand has exceeded 21. YOU BUST...";
        } else if (score == 21) {
            return "Your hand is 21. YOU WIN!!!";
        }else{
            return "";
        }
    }
}