package com.timbuchalka;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(){
        System.out.println("empty con");
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age >=0 && age <= 100) {
            this.age = age;
        }else {
            this.age = 0;
        }
    }

    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        String fullName;
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }else if(this.firstName.isEmpty()){
            return this.lastName;
        }
        else if(this.lastName.isEmpty()){
            return this.firstName;
        }else {
            fullName =this.firstName + " " + this.lastName;
        }

        return fullName;
    }
}
