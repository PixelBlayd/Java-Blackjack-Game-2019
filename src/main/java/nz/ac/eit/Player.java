package nz.ac.eit;

public class Player {
    public static int playerTotal;
    int score = 0;
    public Player(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public void setScore(int score){
        this.score = score;
    }
}