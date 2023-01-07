package SnakeAndLadderGame;

public class SnakeAndLadder {
    private String type;
    private int startPosition;
    private int endPosition;

    public SnakeAndLadder(String type, int startPosition, int endPosition){
        this.type = type;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartingPosition(){
        return this.startPosition;
    }

    public int getEndPosition(){
        return this.endPosition;
    }

    public String getType(){
        return this.type;
    }
}
