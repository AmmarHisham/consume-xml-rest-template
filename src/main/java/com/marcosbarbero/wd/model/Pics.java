package com.marcosbarbero.wd.model;

public class Pics
{
    private String[] pic;

    public String[] getPic ()
    {
        return pic;
    }

    public void setPic (String[] pic)
    {
        this.pic = pic;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pic = "+pic+"]";
    }
}
