package com.bnp.dto;

import java.util.UUID;

public class account_dto {
    private UUID id;
    private String acct_num;
    private String acct_holder_name;
    private String acct_hoolder_Email;
    private String acct_hoolder_phonenumber;
    private String acct_type;
    private double acct_balance;
    private String minimumbalance;
    private String intrestrate;

    account_dto(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAcct_num() {
        return acct_num;
    }

    public void setAcct_num(String acct_num) {
        this.acct_num = acct_num;
    }

    public String getAcct_holder_name() {
        return acct_holder_name;
    }

    public void setAcct_holder_name(String acct_holder_name) {
        this.acct_holder_name = acct_holder_name;
    }

    public String getAcct_hoolder_Email() {
        return acct_hoolder_Email;
    }

    public void setAcct_hoolder_Email(String acct_hoolder_Email) {
        this.acct_hoolder_Email = acct_hoolder_Email;
    }

    public String getAcct_hoolder_phonenumber() {
        return acct_hoolder_phonenumber;
    }

    public void setAcct_hoolder_phonenumber(String acct_hoolder_phonenumber) {
        this.acct_hoolder_phonenumber = acct_hoolder_phonenumber;
    }

    public String getAcct_type() {
        return acct_type;
    }

    public void setAcct_type(String acct_type) {
        this.acct_type = acct_type;
    }

    public double getAcct_balance() {
        return acct_balance;
    }

    public void setAcct_balance(double acct_balance) {
        this.acct_balance = acct_balance;
    }

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
        return "account_dto{" +
                "id=" + id +
                ", acct_num='" + acct_num + '\'' +
                ", acct_holder_name='" + acct_holder_name + '\'' +
                ", acct_hoolder_Email='" + acct_hoolder_Email + '\'' +
                ", acct_hoolder_phonenumber='" + acct_hoolder_phonenumber + '\'' +
                ", acct_type='" + acct_type + '\'' +
                ", acct_balance=" + acct_balance +
                ", minimumbalance='" + minimumbalance + '\'' +
                ", intrestrate='" + intrestrate + '\'' +
                '}';
    }
}


