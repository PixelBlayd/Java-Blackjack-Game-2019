package nz.ac.eit;

public class Computer {
    App appClass = new App();

    public void ComputerTurn() {
        int computerTotal = 0;

        computerTotal += 2 * App.randomRoll();

        while((computerTotal < App.playerTotal) || (computerTotal < 21)){
            System.out.println("Computer Total: " + computerTotal);
            computerTotal +=  App.randomRoll();
        }

        if (computerTotal > 21){
            System.out.println("The Computer has exceeded 21, YOU WIN!!! ");
            System.exit(0);
        }
        else if (computerTotal > App.playerTotal){
            System.out.println("The Computer's hand is higher, YOU LOSE :(");
            System.exit(0);
        }
    }
}
