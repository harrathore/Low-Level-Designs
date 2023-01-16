package TicTacToeGame.board;

import TicTacToeGame.users.Player;

import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {
    private Map<Player, Integer> scoreMap;
    public ScoreBoard(){
        scoreMap = new HashMap<Player, Integer>();
    }

    public void addScore(Player player){
        int playersPrevScore = this.scoreMap.get(player);
        this.scoreMap.put(player, 1+playersPrevScore);
    }

    public Player getTheWinnerOfGame(){
        Player winnerPlayer = null;
        Integer winnerPlayerScore = 0;
        return winnerPlayer;
    }
}
