package com.example.projetfinal;

import android.widget.TextView;

import java.util.Random;

public class Game extends GameActivity{

    Game(int j){
        this.joueur = j;
    }

    private int joueur;
    private int de;

    /**
     *
     */
    public void roll(){
        int temp;

        Random rand = new Random();
        temp = rand.nextInt(6)+1;
        TextView tv1 = (TextView)findViewById(R.id.textView2);
        String s = null;
        s = Integer.toString(temp);
        tv1.setText(s);

        this.de = temp;
    }

    /**
     *
     * @return
     */
    public int getJoueur() {
        return joueur;
    }

    /**
     *
     * @param joueur
     */
    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }

    /**
     *
     * @return
     */
    public int getDe() {
        return de;
    }

    /**
     *
     * @param de
     */
    public void setDe(int de) {
        this.de = de;
    }
}
