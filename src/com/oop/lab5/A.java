package com.oop.lab5;

public class A {
    protected String a;
    protected X x_inst;
    public A(String input_first, String input_x){
        a = new String(input_first);
        x_inst = new X(input_x);
    }
    String get(){
        return a;
    }
}
