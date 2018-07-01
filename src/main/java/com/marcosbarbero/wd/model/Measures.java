package com.marcosbarbero.wd.model;

public class Measures
{
    private String weight;

    private String packing;

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    public String getPacking ()
    {
        return packing;
    }

    public void setPacking (String packing)
    {
        this.packing = packing;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [weight = "+weight+", packing = "+packing+"]";
    }
}
