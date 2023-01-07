package SnakeAndLadderGame;

public class Player {
    private String playerName;
    private String playerId;
    private int playerPositionInBoard;

    public Player(String playerName){
        this.playerId = playerName + "@123";
        this.playerName = playerName;
        this.playerPositionInBoard = 0;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public int getPlayerPositionInBoard(){
        return this.playerPositionInBoard;
    }

    public void setPlayerPositionInBoard(int position){
        this.playerPositionInBoard = position;
    }
}
