package com.practice12oopshape.model;

public abstract class Shape implements Shapeable
{
    @Override
    public String Draw()
    {
        return "Figure is being draw";
    }

    @Override
    public String ChangeColor()
    {
        return "Figure is being changed its color";
    }

    @Override
    public String Earse()
    {
        return "Figure is being earse";
    }

    @Override
    public double CalculateArea()
    {
        return 0;
    }

    @Override
    public double CalculatePerimeter()
    {
        return 0;
    }
}