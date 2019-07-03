package com.timbuchalka;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this(
                "Customer Name",
                10000.00,
                "locutus1986@gmail.com"
        );
    }

    public VipCustomer(double creditLimit, String emailAddress){
        this(
                "customer name",
                creditLimit,
                emailAddress
        );
    }

    public VipCustomer(
            String name,
            double creditLimit,
            String emailAddress
    ){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
