package TicTacToeGame.users;

import TicTacToeGame.piece.Piece;

public class Player {
    private String name;
    private String userId;
    private Piece playingPiece;

    public Player(String name, Piece playingPiece){
        this.name = name;
        this.userId = name+"@123";
        this.playingPiece = playingPiece;
    }

    public String getName(){
        return  this.name;
    }

    public Piece getPlayingPiece() {
        return playingPiece;
    }
}
