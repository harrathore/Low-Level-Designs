package TicTacToeGame.board;

import TicTacToeGame.piece.Piece;

public class Board {
    private int boardSize;
    private Piece[][] board;
    public Board(int boardSize){
        this.boardSize = boardSize;
        this.board = new Piece[boardSize][boardSize];
    }

    public Piece[][] getBoard() {
        return board;
    }
}
