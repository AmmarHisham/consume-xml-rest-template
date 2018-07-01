package com.marcosbarbero.wd.model;

public class Restrictions
{
    private String platform;

    private String germany;

    public String getPlatform ()
    {
        return platform;
    }

    public void setPlatform (String platform)
    {
        this.platform = platform;
    }

    public String getGermany ()
    {
        return germany;
    }

    public void setGermany (String germany)
    {
        this.germany = germany;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [platform = "+platform+", germany = "+germany+"]";
    }
}
