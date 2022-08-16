package com.election;

public class Voter {
    private int name;
    private int age;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getVOTER_ELIGIBLE_AGE() {
        return VOTER_ELIGIBLE_AGE;
    }

    public void setVOTER_ELIGIBLE_AGE(int VOTER_ELIGIBLE_AGE) {
        this.VOTER_ELIGIBLE_AGE = VOTER_ELIGIBLE_AGE;
    }

    int VOTER_ELIGIBLE_AGE=18;

    public void getAgeCreteria(){
    if(age>=18){
        System.out.println("Name+Is Eligible to Vote");
    }else if(age<18){
        System.out.println("Name+Is Not Eligible to Vote");
    }else{
        System.out.println("Age cant be Negative or Zero");
    }
  }
}

