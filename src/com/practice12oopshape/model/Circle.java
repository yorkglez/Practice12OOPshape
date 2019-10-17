package com.practice12oopshape.model;

public class Circle extends Shape{
    private double radius;

    //Constructors
    public  Circle(){}

    public Circle(double radius)
    {
       this.radius = radius;
    }

    public double CalculaePerimeter(double radius){
        return radius * (radius * radius);
    }

    public double CalculateArea(double radius)
    {
        return Math.PI * (radius * radius);

    }

    //Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
