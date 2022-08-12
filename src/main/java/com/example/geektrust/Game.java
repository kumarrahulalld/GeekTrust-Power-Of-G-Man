package com.example.geektrust;

public class Game {
    private   Point source;
    private   Point destination;
    private int Power;
    private Grid grid;

    public Point getSource() {
        return source;
    }

    public void setSource(Point source) {
        this.source = source;
    }

    public Point getDestination() {
        return destination;
    }

    public void setDestination(Point destination) {
        this.destination = destination;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public void getFinalPower()
    {
        int powerUsed=this.getGrid().calculateMinimumPower(this.getSource(),this.getDestination());
        System.out.println("POWER "+(this.getPower()-powerUsed));
    }
}
