package com.example.project;
import java.lang.Math;

public class Triangle {

    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Triangle(double a,double b,double c,double d,double e, double f) {
        x0 = a;
        y0 = b;
        x1 = c;
        y1 = d;
        x2 = e;
        y2 = f;
    }
    public Triangle() {
        x0 = 0.0;
        y0 = 0.0;
        x1 = 0.0;
        y1 = 0.0;
        x2 = 0.0;
        y2 = 0.0;
    }
    public double perimeter() {
        double sideA = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        double sideB = Math.sqrt(Math.pow(x1-x0,2) + Math.pow(y1-y0,2));
        double sideC = Math.sqrt(Math.pow(x0-x2,2) + Math.pow(y0-y2,2));
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
    public double area() {
        double sideA = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        double sideB = Math.sqrt(Math.pow(x1-x0,2) + Math.pow(y1-y0,2));
        double sideC = Math.sqrt(Math.pow(x0-x2,2) + Math.pow(y0-y2,2));
        double s = (sideA + sideB + sideC)/2;
        double Area = Math.sqrt((s)*(s-sideA)*(s-sideB)*(s-sideC));
        return Area;
    }
    public void translateX(double translate) {
        x0 = x0 + translate;
        x1 = x1 + translate;
        x2 = x2 + translate;
    }
    public void translateY(double translate) {
        y0 = y0 + translate;
        y1 = y1 + translate;
        y2 = y2 + translate;
    }


    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }
}
