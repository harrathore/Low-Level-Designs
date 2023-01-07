package SnakeAndLadderGame;

import SnakeAndLadderGame.Board;

import java.util.*;

public class Game {
    private Dice dice;
    private Board board;
    private Queue<Player> playersQueue;
    private Player gameWinner;

    public Game(){
        this.gameWinner = null;
        this.dice = new Dice();
        this.playersQueue = new LinkedList<>();
        this.board = new Board(10);

        SnakeAndLadder snake = new SnakeAndLadder("Snake", 98, 17);
        SnakeAndLadder ladder = new SnakeAndLadder("Ladder", 22, 99);

        this.board.addSnakeOrLadder(snake);
        this.board.addSnakeOrLadder(ladder);

        Player player1 = new Player("Java");
        Player player2 = new Player("C++");

        this.playersQueue.add(player1);
        this.playersQueue.add(player2);
    }

    public void playGame(){
         while(playersQueue.size() > 1){
             Player currPlayer = playersQueue.peek();
             playersQueue.remove();
             int rollDiceNumber = dice.getADiceNumber();
             int playerPrevPosition = currPlayer.getPlayerPositionInBoard();
             int playerNewPosition = rollDiceNumber + playerPrevPosition;
             if(playerNewPosition == board.getMaximumPositionInBoard()){
                 this.gameWinner = currPlayer;
                 break;
             }
             if(!(playerNewPosition > 100)){
                 int playerFinalPosition = board.returnMyFinalPosition(playerNewPosition);
                 currPlayer.setPlayerPositionInBoard(playerFinalPosition);
             }
             playersQueue.add(currPlayer);
         }
    }

    public Player getGameWinner(){
        if(this.gameWinner == null){
            System.out.println("SnakeAndLadderGame.Game is not started yest, please start the game....");
        }
        return this.gameWinner;
    }
}
