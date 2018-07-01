package com.marcosbarbero.wd.model;

public class Category
{
    private Cat[] cat;

    public Cat[] getCat ()
    {
        return cat;
    }

    public void setCat (Cat[] cat)
    {
        this.cat = cat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cat = "+cat+"]";
    }
}

