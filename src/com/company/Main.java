package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();

        int radius = scanner.nextInt();

        circle.getArea(radius);
        circle.getPerimeter(radius);


        Square square = new Square();

        square.getArea(radius);
        square.getPerimeter(radius);

    }
}
