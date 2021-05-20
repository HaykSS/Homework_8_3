package com.company;

public class Square extends Shape{

    @Override
    public void getArea(double radius) {
        double area = Math.pow(2 * radius,2) / 2;
        System.out.println("Square area is equal to: " + area);
    }

    @Override
    public void getPerimeter(double radius) {
        double perimeter = 4 * Math.sqrt(Math.pow(2 * radius,2) / 2);
        System.out.println("Square perimeter is equal to: " + perimeter);
    }
}
