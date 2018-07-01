package com.marcosbarbero.wd.model;

public class Variant {
    private String id;

    private String subartnr;

    private String ean;

    private String title;

    private String stock;

    private String stockestimate;

    private String type;

    public Variant() {
    }

    public Variant(String id, String subartnr, String ean, String title, String stock, String stockestimate, String type) {
        this.id = id;
        this.subartnr = subartnr;
        this.ean = ean;
        this.title = title;
        this.stock = stock;
        this.stockestimate = stockestimate;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubartnr() {
        return subartnr;
    }

    public void setSubartnr(String subartnr) {
        this.subartnr = subartnr;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStockestimate() {
        return stockestimate;
    }

    public void setStockestimate(String stockestimate) {
        this.stockestimate = stockestimate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", subartnr = " + subartnr + ", ean = " + ean + ", title = " + title + ", stock = " + stock + ", stockestimate = " + stockestimate + ", type = " + type + "]";
    }
}
