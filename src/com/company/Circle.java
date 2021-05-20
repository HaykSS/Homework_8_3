package com.company;

public class Circle extends Shape{

    @Override
    public void getArea(double radius) {

        double area = Math.pow(radius,2) * Math.PI;
        System.out.println("Sircle area is equal to: " + area);
    }

    @Override
    public void getPerimeter(double radius) {

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Sircle perimeter is equal to: " + perimeter);;
    }
}
