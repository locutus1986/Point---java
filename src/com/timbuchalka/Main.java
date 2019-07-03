package com.timbuchalka;


public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(6,5);
        Point point = new Point(3,1);
        System.out.println(point1.distance());

        System.out.println(point1.distance(point));

        System.out.println(point1.distance(2,2));

        Point point2 = new Point();
        System.out.println(point2.distance());
    }
}
