package com.ntqsolution.model;

import com.ntqsolution.controller.Shape;

public class Triangle extends Shape {
    private double firstEdge, secondEdge, thirdEdge;

    public Triangle() {
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }


    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }


    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public void draw() {
        if (isTriangleValid(firstEdge, secondEdge, thirdEdge)) {
            System.out.println("Area: " + Area());
            System.out.println("Perimeter: " + Perimeter());
        } else {
            System.out.println("This is not triangle!!!");
        }

    }

    @Override
    public void input() {
        double edge1, edge2, edge3;
        try {
            System.out.println("Please input first edge: ");
            edge1 = Double.parseDouble(scanner.nextLine().trim());
            System.out.println("Please input second edge: ");
            edge2 = Double.parseDouble(scanner.nextLine().trim());
            System.out.println("Please input third edge: ");
            edge3 = Double.parseDouble(scanner.nextLine().trim());
            this.setFirstEdge(edge1);
            this.setSecondEdge(edge2);
            this.setThirdEdge(edge3);
        } catch (NumberFormatException e) {
            System.err.println("Invalid!!!");
            System.exit(0);
        }
    }

    @Override
    public double Area() {
        double p = (firstEdge + secondEdge + thirdEdge) / 2; //nua chu vi
        return Math.sqrt(p * (p - firstEdge) * (p - secondEdge) * (p - thirdEdge));
    }

    @Override
    public double Perimeter() {
        return firstEdge + secondEdge + thirdEdge;
    }

    private boolean isTriangleValid(double a, double b, double c) {
        return (a + b) > c && (b + c) > a && (a + c) > b;
    }
}
