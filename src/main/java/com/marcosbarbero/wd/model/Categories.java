package com.marcosbarbero.wd.model;

import java.util.List;

public class Categories {
    private List<Cat> category;

    public List<Cat> getCategory() {
        return category;
    }

    public void setCategory(List<Cat> category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ClassPojo [category = " + category + "]";
    }
}
