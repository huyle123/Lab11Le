/*
Project: Lab 11
Purpose Details: Java Command Line Inheritance
Course: IST 242
Author: Huy Le
Date Developed: 3-28-19
Last Date Changed: 3-31-19
Rev: 3
*/
package sample;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Point p1 = new Point(5,5);
        Circle c2 = new Circle(p1);

        Triangle t1 = new Triangle();
        Point p2 = new Point(5,10);
        Point p3 = new Point(10,5);
        Triangle t2 = new Triangle(p1, p2, p3);

        Rectangle r1 = new Rectangle();
        Point p4 = new Point(10,10);
        Rectangle r2 = new Rectangle(p1, p2, p3, p4);

    }

}