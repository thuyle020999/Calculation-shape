package com.ntqsolution.model;

import com.ntqsolution.controller.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }

    @Override
    public void input() {
        double radius;
        try {
            System.out.println("Please input radius: ");
            radius = Double.parseDouble(scanner.nextLine().trim());
            this.setRadius(radius);
        } catch (NumberFormatException e) {
            System.err.println("Invalid");
            System.exit(0);
        }
    }

    @Override
    public double Area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double Perimeter() {
        return (radius * 2) * Math.PI;
    }
}
