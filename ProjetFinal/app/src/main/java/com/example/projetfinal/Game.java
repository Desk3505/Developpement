package com.example.projetfinal;

import android.widget.TextView;

import java.util.Random;

public class Game extends GameActivity {

    Game(int j) {
        this.joueur = j;
    }

    private int joueur;
    private int de;
    private float touchX;
    private float touchY;
    private int tour = 0;

    /**
     * @param valDe
     */
    public void roll(int valDe) {
        this.de = valDe;
        this.tour++;
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
