package com.bnp.model;

public class currentaccount extends account{
    currentaccount(){
        super();
    }
    private String minimumbalance;
    private String intrestrate;

    public String getMinimumbalance() {
        return minimumbalance;
    }

    public void setMinimumbalance(String minimumbalance) {
        this.minimumbalance = minimumbalance;
    }

    public String getIntrestrate() {
        return intrestrate;
    }

    public void setIntrestrate(String intrestrate) {
        this.intrestrate = intrestrate;
    }

    @Override
    public String toString() {
        return "currentaccount{" +
                "minimumbalance='" + minimumbalance + '\'' +
                ", intrestrate='" + intrestrate + '\'' +
                '}';
    }
}
