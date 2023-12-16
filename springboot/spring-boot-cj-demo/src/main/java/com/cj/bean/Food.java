package com.cj.bean;

public class Food {

    private String rice;
    private String meat;

    @Override
    public String toString() {
        return "Food{" +
                "rice='" + rice + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public Food(String rice, String meat) {
        this.rice = rice;
        this.meat = meat;
    }

    public Food() {
    }
}
