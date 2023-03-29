package com.afpa.www.bean;

public class Rectangle extends Figures {
    protected double longueur = 0;
    protected double largueur = 0;

    public Rectangle(double longueur, double largueur) {
        super();
        this.longueur = longueur;
        this.largueur = largueur;
    }

    @Override
    public void surface() {
        super.surface = this.longueur * this.largueur;
    }

    @Override
    public void perimetre() {
        super.perimetre = (longueur + largueur) * 2;
    }
    public void doublerSurface(){
        super.surface = (this.longueur * this.largueur) * 2;
    }

    @Override
    public void doublerPerimetre() {

    }
}
