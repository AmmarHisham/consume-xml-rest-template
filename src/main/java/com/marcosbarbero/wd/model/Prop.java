package com.marcosbarbero.wd.model;

public class Prop
{
    private String valueid;

    private Values values;

    private String value;

    private String propid;

    private String property;

    public String getValueid ()
    {
        return valueid;
    }

    public void setValueid (String valueid)
    {
        this.valueid = valueid;
    }

    public Values getValues ()
    {
        return values;
    }

    public void setValues (Values values)
    {
        this.values = values;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getPropid ()
    {
        return propid;
    }

    public void setPropid (String propid)
    {
        this.propid = propid;
    }

    public String getProperty ()
    {
        return property;
    }

    public void setProperty (String property)
    {
        this.property = property;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [valueid = "+valueid+", values = "+values+", value = "+value+", propid = "+propid+", property = "+property+"]";
    }
}