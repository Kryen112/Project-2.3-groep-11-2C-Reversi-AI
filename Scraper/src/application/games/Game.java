package application.games;

import application.games.players.Player;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    Random r = new Random();
    String gameTitle;
    BoardUI board;

    Player player1;
    Player player2;

    Player currentPlayer;
    Player winner;

    private char turn = 'x';
    Image emptyTile;

    public Game(){ }

    public Game(String title, BoardUI b, Player p1, Player p2){
        gameTitle = title;
        board = b;
        player1 = p1;
        player2 = p2;

        int i = r.nextInt(2);
        if (i == 0) {
            setTurn('x');
            p1.setIcon("application/images/x.png");
            currentPlayer = p1;
        } else {
            setTurn('o');
            p1.setIcon("application/images/o.png");
            currentPlayer = p2;
        }

        setEmptyTile();
        winner = null;
    }

    public String getGameTitle() { return gameTitle; }
    public BoardUI getGameBoard() { return board; }
    public Player getPlayer1() { return player1; }
    public Player getPlayer2() { return player2; }
    public Player getCurrentPlayer() { return currentPlayer; }

    public void setEmptyTile() {
        if (gameTitle.equals("Boter, Kaas en Eieren")) {
            emptyTile = new Image("application/images/emptyTileTTT.png");
        } else if (gameTitle.equals("Reversi")) {
            emptyTile = new Image("application/images/emptyTileREV.png");
        }
    }

    public void takeTurn() {

    }
    public Image getEmptyTile() {
        return emptyTile;
    }

    public char getTurn() {
        return turn;
    }

    public void setTurn(char turn) {
        this.turn = turn;
    }


    public void changeTurn() {
        if(getTurn() == 'x') {
            setTurn('o');
        }
        else if(getTurn() == 'o') {
            setTurn('x');
        }
    }

    public Boolean isGameOver() {
        return null;
    }

    public Boolean isWinner(Player p) {
        return null;
    }

    public Boolean isLoser(Player p) {
        return null;
    }

    public Boolean isGameTie() {
        return null;
    }

    public Player getWinner() {
        return null;
    }

    public ArrayList<ArrayList<String>> getWinningCombinations() {
        return null;
    }
}
