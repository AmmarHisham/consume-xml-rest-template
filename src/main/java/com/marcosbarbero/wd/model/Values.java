package com.marcosbarbero.wd.model;

public class Values
{
    private Value value;

    public Value getValue ()
    {
        return value;
    }

    public void setValue (Value value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [value = "+value+"]";
    }
}
