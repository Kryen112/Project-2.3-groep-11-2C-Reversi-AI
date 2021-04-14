package application.games;

import javafx.scene.layout.Pane;


public class BoardUI {
    Pane[][] gameBoardUI;
    int height;

    public BoardUI(int h){
        setHeight(h);
        gameBoardUI = createBoardUI();
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

    public Pane[][] createBoardUI() {
        gameBoardUI = new Pane[height][height];

        int id = 0;
        for (int x = 0; x < height; x++)
        {
            for (int y = 0; y < height; y++)
            {
                gameBoardUI[x][y] = new Pane();
                Pane thisPane = gameBoardUI[x][y];
                thisPane.setId("" + id);
                id++;
            }
        }
        return gameBoardUI;
    }

    public Pane[][] getGameBoardUI() {
        return gameBoardUI;
    }
}
