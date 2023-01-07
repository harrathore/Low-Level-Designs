package SnakeAndLadderGame;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;

    private List<SnakeAndLadder> snakeAndLadderList;

    public Board(int size){
        snakeAndLadderList = new ArrayList<>();
        this.size = size;
    }

    public int getMaximumPositionInBoard(){
        return this.size*this.size;
    }

    public void addSnakeOrLadder(SnakeAndLadder snakeAndLadder){
        this.snakeAndLadderList.add(snakeAndLadder);
    }

    public int returnMyFinalPosition(int prevPosition){
        int finalPosition = prevPosition;
        for (SnakeAndLadder snakeAndLadder : snakeAndLadderList){
            if(snakeAndLadder.getStartingPosition() == prevPosition){
                finalPosition = snakeAndLadder.getEndPosition();
            }
        }
        return finalPosition;
    }
}
