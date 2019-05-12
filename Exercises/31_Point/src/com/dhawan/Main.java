package com.dhawan;

public class Main {

    public static void main(String[] args) {

        Point pointFirst = new Point(6, 5);
        Point pointSecond = new Point(3, 1);

        System.out.println("distance(0,0) = " + pointFirst.distance());
        System.out.println("distance(second) = " + pointFirst.distance(pointSecond));
        System.out.println("distance(2,2) = " + pointFirst.distance(2,2 ));

        Point point = new Point();

        System.out.println("distance() = " + point.distance());

    }
}
