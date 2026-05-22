package com.bnp.model;

import java.util.UUID;

public class account {
    private  UUID id;
    private String acct_num;
    private String acct_holder_name;
    private String acct_hoolder_Email;
    private String acct_hoolder_phonenumber;
    private String acct_type;
    private double acct_balance;

    account() {

    }
    public void setUUID(String UUID) {
        this.id=id;
    }
    public String getUUID(String UUID){
        return UUID;
    }
    public void Setacct_num(String acct_num){
        this.acct_num=acct_num;
    }
    public String getacct_num(String acct_num){
        return acct_num;
    }
    public void setacct_holder_name(String acct_holder_name){
        this.acct_holder_name=acct_holder_name;
    }
    public String getacct_holder_name(String acct_holder_name){
        return acct_holder_name;
    }
    public void setacct_hoolder_Email(String acct_hoolder_Email){
        this.acct_hoolder_Email=acct_hoolder_Email;
    }
    public String getacct_hoolder_Email(String acct_hoolder_Email){
        return acct_hoolder_Email;
    }
    public void setacct_hoolder_phonenumber(String acct_hoolder_phonenumber){
        this.acct_hoolder_phonenumber=acct_hoolder_phonenumber;
    }

    public void setAcct_type(String acct_type) {
            this.acct_type = acct_type;
    }
    public String getacct_type(String acct_type){
        return acct_type;
    }
    public void setacct_balance(double acct_balance) {
        this.acct_balance = acct_balance;
    }
    public double getacct_balance(double acct_balance) {
        return acct_balance;
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", acct_num='" + acct_num + '\'' +
                ", acct_holder_name='" + acct_holder_name + '\'' +
                ", acct_hoolder_Email='" + acct_hoolder_Email + '\'' +
                ", acct_hoolder_phonenumber='" + acct_hoolder_phonenumber + '\'' +
                ", acct_type='" + acct_type + '\'' +
                ", acct_balance=" + acct_balance +
                '}';
    }
}
