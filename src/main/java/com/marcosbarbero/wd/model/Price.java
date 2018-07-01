package com.marcosbarbero.wd.model;

public class Price
{
    private String vatde;

    private String b2c;

    private String b2b;

    private String currency;

    private String vatnl;

    private String discount;

    public String getVatde ()
    {
        return vatde;
    }

    public void setVatde (String vatde)
    {
        this.vatde = vatde;
    }

    public String getB2c ()
    {
        return b2c;
    }

    public void setB2c (String b2c)
    {
        this.b2c = b2c;
    }

    public String getB2b ()
    {
        return b2b;
    }

    public void setB2b (String b2b)
    {
        this.b2b = b2b;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    public String getVatnl ()
    {
        return vatnl;
    }

    public void setVatnl (String vatnl)
    {
        this.vatnl = vatnl;
    }

    public String getDiscount ()
    {
        return discount;
    }

    public void setDiscount (String discount)
    {
        this.discount = discount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [vatde = "+vatde+", b2c = "+b2c+", b2b = "+b2b+", currency = "+currency+", vatnl = "+vatnl+", discount = "+discount+"]";
    }
}
