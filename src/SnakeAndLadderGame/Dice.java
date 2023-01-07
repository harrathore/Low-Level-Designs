package SnakeAndLadderGame;

public class Dice {
    private int minimumNumber = 1;
    private int maximumNumber = 6;
    public int getADiceNumber(){
        int aDiceNumber = (int)(Math.random()*(maximumNumber-minimumNumber+1)+minimumNumber);
        return aDiceNumber;
    }
}
