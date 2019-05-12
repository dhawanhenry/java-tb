package com.dhawan;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        if(this.age < 0 || this.age > 100){
            return this.age;
        }
        return 0;
    }

    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        if(this.firstName.isEmpty() == true){
            return this.lastName;
        } else if(this.lastName.isEmpty() == true){
            return this.firstName;
        } else if(this.firstName.isEmpty() == false && this.lastName.isEmpty() == false){
            return this.firstName + " " + this.lastName;
        }
        return "";
    }

}
