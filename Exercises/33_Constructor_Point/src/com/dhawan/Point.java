package com.dhawan;

public class Point {

    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return this.y;
    }

    public double distance(){
        return Math.sqrt((getX() - 0) * (getX() - 0) + (getY() - 0) * (getY() - 0));
    }

    public double distance(int x, int y){
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }

    public double distance(Point point){
        return Math.sqrt((getX() - point.x) * (getX() - point.x) + (getY() - point.y) * (getY() - point.y));
    }
}
