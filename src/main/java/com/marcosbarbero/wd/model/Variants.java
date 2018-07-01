package com.marcosbarbero.wd.model;

import java.util.List;

public class Variants {
    private List<Variant> variant;

    public Variants() {
    }

    public Variants(List<Variant> variant) {
        this.variant = variant;
    }

    public List<Variant> getVariant() {
        return variant;
    }

    public void setVariant(List<Variant> variant) {
        this.variant = variant;
    }

    @Override
    public String toString() {
        return "ClassPojo [variant = " + variant + "]";
    }
}
