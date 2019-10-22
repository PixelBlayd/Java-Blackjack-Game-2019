package nz.ac.eit;

public class Computer {
    public static int computerTotal;
    int score = 0;
    public Computer(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public void setScore(int score){
        this.score = score;
    }

    public void ComputerTurn() {
        int computerTotal = 0;
        computerTotal += 2 * Game.randomRoll();
        while((computerTotal < Player.playerTotal) || (computerTotal < 21)){
            System.out.println("Computer Total: " + computerTotal);
            computerTotal +=  Game.randomRoll();
        }
        if (computerTotal > 21){
            System.out.println("The Computer has exceeded 21, YOU WIN!!! ");
            System.exit(0);
        }
        else if (computerTotal > Player.playerTotal){
            System.out.println("The Computer's hand is higher, YOU LOSE :(");
            System.exit(0);
        }
    }
}