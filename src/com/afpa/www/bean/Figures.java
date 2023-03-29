package com.afpa.www.bean;

public abstract class Figures {
    protected double surface = 0;
    protected double perimetre = 0;

    public Figures() {
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(double perimetre) {
        this.perimetre = perimetre;
    }

    public abstract void surface();
    public abstract void perimetre();
    public abstract void doublerSurface();
    public abstract void doublerPerimetre();
}
