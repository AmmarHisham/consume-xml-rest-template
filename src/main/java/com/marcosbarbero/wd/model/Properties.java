package com.marcosbarbero.wd.model;

import java.util.List;

public class Properties
{
    private List<Prop> prop;

    public List<Prop> getProp ()
    {
        return prop;
    }

    public void setProp (List<Prop> prop)
    {
        this.prop = prop;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [prop = "+prop+"]";
    }
}
