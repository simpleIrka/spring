package com.tutorialspoint;

public class ClassForPrototype {
    private int  a;
    private int  b;

    public void setNumber(int a, int b){
        this.a  = a;
        this.b = b;
    }
    public void getSum(){
        System.out.println("Your sum : " + a+b);
    }
}
