package com.ntqsolution.model;

import com.ntqsolution.controller.Shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {

    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }

    @Override
    public void input() {
        double length, width;
        try {
            System.out.println("Please input length: ");
            length = Double.parseDouble(scanner.nextLine().trim());
            System.out.println("Please input width: ");
            width = Double.parseDouble(scanner.nextLine().trim());
            this.setLength(length);
            this.setWidth(width);
        } catch (NumberFormatException e) {
            System.err.println("Invalid");
            System.exit(0);
        }

    }

    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public double Perimeter() {
        return (length + width) * 2;
    }
}
