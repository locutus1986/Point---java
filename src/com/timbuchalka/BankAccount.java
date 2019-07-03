package com.timbuchalka;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(
                878978,
                0.0,
                "valued customer",
                "enter Email",
                "enter phone number"
        );
    }

    public BankAccount(
            int accountNumber,
            double balance,
            String customerName,
            String email,
            String phoneNumber
    ){
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999, 0.0, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void getAccountNumber(){
        System.out.println(this.accountNumber);
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void getBalance(){
        System.out.println(this.balance);
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void getCustomerName(){
        System.out.println(this.customerName);
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void getEmail(){
        System.out.println(this.email);
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void getPhoneNumber(){
        System.out.println(this.phoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        double test = this.balance-withdrawAmount;
        if(test >= 0) {
            this.balance -= withdrawAmount;
            System.out.println("Your new balance is: " + this.balance);
        }else{
            System.out.println("Insufficient funds. Your balance is: " + this.balance);
        }
    }
}
