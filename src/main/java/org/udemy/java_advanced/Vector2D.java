package org.udemy.java_advanced;

public class Vector2D {
    private double x;
    private double y;

    /* to generate gettters/setters press ALT+INSERT :) */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double length(){
        return Math.sqrt(x*x + y*y);
    }
}
