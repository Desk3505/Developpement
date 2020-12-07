package com.example.projetfinal;

/*
General game class:
    roll the dice;
    load the game;
    and play
 */

public class Game extends GameActivity {

    private GameLogic gl = new GameLogic();

    Game(int j) {
        this.joueur = j;
        this.loadGame();
    }

    private int joueur;
    private int de;
    private float touchX;
    private float touchY;
    private int tour = 0;

    /**
     * @param valDe
     * rolls the dice
     */
    public void roll(int valDe) {
        this.de = valDe;
        this.tour++;
        gl.setGameTurn(tour);
        gl.setDiceRes(valDe);
        gl.setMyTurn();
        this.play();
    }

    /**
     *loads the game for the first time
     */
    public void loadGame() {
        gl.setNumPlayer(this.getJoueur());
        if (this.getJoueur() == 4) {
            gl.initBoardBlue();
        }
        if (this.getJoueur() >= 3) {
            gl.initBoardRed();
        }
        gl.initBoardGreen();
        gl.initBoardYellow();
    }

    /**
     *games turn and animation
     */
    public void play() {
        int turn = gl.getMyTurn();
        int xc = (int) this.getTouchX();
        int yc = (int) this.getTouchY();
        switch (joueur) {
            case 2:
                if (turn == 0) {
                    gl.moveGreen(xc, yc);
                } else {
                    gl.moveYellow(xc, yc);
                }
                break;
            case 3:
                if (turn == 0) {
                    gl.moveGreen(xc, yc);
                } else if (turn == 1) {
                    gl.moveRed(xc, yc);
                } else {
                    gl.moveYellow(xc, yc);
                }
                break;
            case 4:
                if (turn == 0) {
                    gl.moveGreen(xc, yc);
                } else if (turn == 1) {
                    gl.moveRed(xc, yc);
                } else if (turn == 2) {
                    gl.moveBlue(xc, yc);
                } else {
                    gl.moveYellow(xc, yc);
                }
                break;
            default:
                break;
        }
    }

    /**
     * @return
     */
    public int getJoueur() {
        return joueur;
    }

    /**
     * @param joueur
     */
    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }

    /**
     * @return
     */
    public int getDe() {
        return de;
    }

    /**
     * @param de
     */
    public void setDe(int de) {
        this.de = de;
    }

    /**
     * @return
     */
    public float getTouchX() {
        return touchX;
    }

    /**
     * @param touchX
     */
    public void setTouchX(float touchX) {
        this.touchX = touchX;
    }

    /**
     * @return
     */
    public float getTouchY() {
        return touchY;
    }

    /**
     * @param touchY
     */
    public void setTouchY(float touchY) {
        this.touchY = touchY;
    }

    /**
     * @return
     */
    public int getTour() {
        return tour;
    }

    /**
     * @param tour
     */
    public void setTour(int tour) {
        this.tour = tour;
    }

}
