package com.ntqsolution.controller;

import com.ntqsolution.controller.Calculation;

import java.util.Scanner;

public abstract class Shape implements Calculation {
    public Scanner scanner = new Scanner(System.in);

    public abstract void draw();

    public abstract void input();
}
