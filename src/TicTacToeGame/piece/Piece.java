package TicTacToeGame.piece;

import TicTacToeGame.enums.PIECE_ENUM;

public class Piece {
    private PIECE_ENUM piece;
    public Piece(PIECE_ENUM piece){
        this.piece = piece;
    }
    public PIECE_ENUM getPiece() {
        return piece;
    }
}
