package com.dhawan;

public class Wall {
    private double width;
    private double height;
    private double area;

    public Wall(double width, double height) {
        System.out.println("Wall constructor with parameters called.");
        this.width = width;
        this.height = height;
    }

    public Wall(){
        this(0, 0);
        System.out.println("Empty constructor called.");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width <= 0){
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if(height <= 0){
            height = 0;
        }
        this.height = height;
    }

    public double getArea() {
        area = this.height * this.width;
        return area;
    }
}
