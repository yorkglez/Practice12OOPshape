package com.practice12oppshape.app;
import  java.lang.Math;
import java.util.Scanner;

import com.practice12oopshape.model.Circle;
import com.practice12oopshape.model.Shape;
import com.practice12oopshape.model.Square;
import com.practice12oopshape.model.Triangle;

public class ShapeApp
{
    public static void main(String[] args)
    {
        double radius = 0;

        Square square1 = new Square();
        Circle circle1 = new Circle();
        Triangle triangle = new Triangle();
        Shape myForma;
        myForma = new Triangle();

        Square square2 = new Square(10.2);
        Circle circle2 = new Circle(5.3);
        Triangle triangle2 = new Triangle(5.4,6.8);

        Scanner in = new Scanner(System.in);

        System.out.println("Input the radio of the circle:");
        radius = in.nextDouble();

        circle1.setRadius(radius);

        System.out.println("The area of the circle is: "+ circle1.CalculateArea(circle1.getRadius()));

    }
}
