package TicTacToeGame;

import TicTacToeGame.board.ScoreBoard;
import TicTacToeGame.game.Game;
import TicTacToeGame.users.Player;

public class GameDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to tic toe game");

        Game game = new Game(10);
        ScoreBoard scoreBoard = new ScoreBoard();
        game.startGame();

        Player winner = scoreBoard.getTheWinnerOfGame();

        System.out.println("The winner of game is : " + winner.getName());
    }
}
