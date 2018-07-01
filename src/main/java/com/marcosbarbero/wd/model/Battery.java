package com.marcosbarbero.wd.model;

public class Battery
{
    private String required;

    public String getRequired ()
    {
        return required;
    }

    public void setRequired (String required)
    {
        this.required = required;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [required = "+required+"]";
    }
}
