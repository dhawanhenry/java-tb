package com.dhawan;

public class Wall {

    private double width;
    private double height;

    public Wall(){
        this(0.0, 0.0);
        System.out.println("No values provided for wall dimensions");
    }

    public Wall(double width, double height){
        if(height <= 0 && width > 0){
            this.height = 0;
            this.width = width;
        } else if (width <= 0 && height > 0){
            this.width = 0;
            this.height = height;
        } else if (height <= 0 && width <= 0){
            this.height = 0;
            this.width = 0;
        }
        else {
            this.height = height;
            this.width = width;
        }
    }

    public void setHeight(double height){
        if(height <= 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        if(width <= 0){
            this.width = 0;
        } else{
            this.width = width;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getArea(){
        double area = getHeight() * getWidth();
        return area;
    }


}
