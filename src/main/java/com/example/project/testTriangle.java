package com.example.project;

public class testTriangle {
    public static void main(String[] args){

    Triangle myTriangle = new Triangle(5, 3, 5, 6, 3, 8);
    System.out.println(myTriangle.perimeter());
   System.out.println(myTriangle.area());
    myTriangle.translateX(3);
    myTriangle.translateY(6);

    Triangle myOtherTriangle = new Triangle();
    System.out.println(myOtherTriangle.perimeter());
    System.out.println(myOtherTriangle.area());
}
}
