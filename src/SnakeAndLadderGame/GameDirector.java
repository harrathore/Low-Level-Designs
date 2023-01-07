package SnakeAndLadderGame;

public class GameDirector {
    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
        Player winner = game.getGameWinner();
        System.out.println(winner);
        System.out.println(winner.getPlayerName());
    }
}
