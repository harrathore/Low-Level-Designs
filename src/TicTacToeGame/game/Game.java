package TicTacToeGame.game;

import TicTacToeGame.board.Board;
import TicTacToeGame.board.ScoreBoard;
import TicTacToeGame.piece.CirclePiece;
import TicTacToeGame.piece.CrossPiece;
import TicTacToeGame.piece.Piece;
import TicTacToeGame.users.Player;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private int numberOfRounds;
    private Queue<Player> players;
    private Board board;
    private ScoreBoard scoreBoard;

    public Game(int numberOfRounds){
        this.numberOfRounds = numberOfRounds;
        this.players = new LinkedList<>();
        this.board = new Board(3);
        initializeGame();
    }

    private void initializeGame(){
        Player p1 = new Player("Harvendra", new CrossPiece());
        Player p2 = new Player("Shubham", new CirclePiece());
        players.add(p1);
        players.add(p2);
    }

    public void startGame(){
        for(int i=0; i<numberOfRounds; i++){
             playGameForRound(i);
        }
    }

    private void playGameForRound(int round){
        Piece[][] currBoard = board.getBoard();
        Player winner = null;
        System.out.println("Playing game for round : " + round);
        while (players.size() > 1){
            Player currPlayer = players.peek();
            players.poll();
            //all logic about making move and checking if it is winner
            int r = 0;
            int c = 1;
            makeMoveOnBoardAndCheckIsWinner(r, c, currBoard, currPlayer);
            players.add(currPlayer);
        }
        scoreBoard.addScore(winner);
        System.out.println("This round is completed and winner is : " + winner);
    }

    private boolean makeMoveOnBoardAndCheckIsWinner(int r, int c, Piece[][] currBoard, Player currPlayer){
        currBoard[r][c] = currPlayer.getPlayingPiece();
        return true;
    }
}
