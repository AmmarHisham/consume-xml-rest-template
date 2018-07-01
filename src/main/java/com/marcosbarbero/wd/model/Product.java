package com.marcosbarbero.wd.model;

import java.util.List;

public class Product {
    private String artnr;

    private String modifydate;

    private Restrictions restrictions;

    private String bulletpoints;

    private List<Prop> properties;

    private String date;

    private Material material;

    private String country;

    private String id;

    private List<String> pics;

    private String title;

    private Price price;

    private String description;

    private Battery battery;

    private List<Variant> variants;

    private Brand brand;

    private Categories categories;

    private Measures measures;

    private String hscode;

    private String popularity;

    public Product() {
    }

    public Product(String artnr, String modifydate, Restrictions restrictions, String bulletpoints, List<Prop> properties,
                   String date, Material material, String country, String id, List<String> pics, String title, Price price,
                   String description, Battery battery, List<Variant> variants, Brand brand, Categories categories,
                   Measures measures, String hscode, String popularity) {
        this.artnr = artnr;
        this.modifydate = modifydate;
        this.restrictions = restrictions;
        this.bulletpoints = bulletpoints;
        this.properties = properties;
        this.date = date;
        this.material = material;
        this.country = country;
        this.id = id;
        this.pics = pics;
        this.title = title;
        this.price = price;
        this.description = description;
        this.battery = battery;
        this.variants = variants;
        this.brand = brand;
        this.categories = categories;
        this.measures = measures;
        this.hscode = hscode;
        this.popularity = popularity;
    }

    public String getArtnr() {
        return artnr;
    }

    public void setArtnr(String artnr) {
        this.artnr = artnr;
    }

    public String getModifydate() {
        return modifydate;
    }

    public void setModifydate(String modifydate) {
        this.modifydate = modifydate;
    }

    public Restrictions getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    public String getBulletpoints() {
        return bulletpoints;
    }

    public void setBulletpoints(String bulletpoints) {
        this.bulletpoints = bulletpoints;
    }

    public List<Prop> getProperties() {
        return properties;
    }

    public void setProperties(List<Prop> properties) {
        this.properties = properties;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Measures getMeasures() {
        return measures;
    }

    public void setMeasures(Measures measures) {
        this.measures = measures;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public String getHscode() {
        return hscode;
    }

    public void setHscode(String hscode) {
        this.hscode = hscode;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "ClassPojo [artnr = " + artnr + ", modifydate = " + modifydate + ", restrictions = " + restrictions + ", bulletpoints = " + bulletpoints + ", properties = " + properties + ", date = " + date + ", material = " + material + ", country = " + country + ", id = " + id + ", pics = " + pics + ", title = " + title + ", price = " + price + ", description = " + description + ", battery = " + battery + ", variants = " + variants + ", brand = " + brand + ", categories = " + categories + ", measures = " + measures + ", hscode = " + hscode + ", popularity = " + popularity + "]";
    }
}
