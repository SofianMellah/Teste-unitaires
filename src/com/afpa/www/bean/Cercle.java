package com.afpa.www.bean;

public class Cercle extends Figures {
    static double rayon = 0;
    public Cercle(double rayon) {
        super();
        this.rayon = rayon;
    }
    public void surface(){
        super.surface = rayon * rayon * 3.14;
    }

    public void perimetre() {
        super.perimetre = rayon * 2 * 3.14;
    }

    public void doublerSurface() {

    }
    public void doublerPerimetre() {

    }
}