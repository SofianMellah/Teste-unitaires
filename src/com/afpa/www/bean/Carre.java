package com.afpa.www.bean;

public class Carre extends Figures {
    private double tailleCote = 0;
    public Carre(double tailleCote) {
        super();
        this.tailleCote = tailleCote;
    }
    public void surface() {
        super.surface = this.tailleCote * this.tailleCote;
    }

    public void perimetre() {
        super.perimetre = this.tailleCote * 4;
    }
    public void doublerSurface(){
        super.surface = this.tailleCote * this.tailleCote * 2;
    }

    public void doublerPerimetre() {

    }
}