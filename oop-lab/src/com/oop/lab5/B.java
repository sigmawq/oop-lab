package com.oop.lab5;

public class B extends A {
    protected String b = "b";
    public B(){
        super("first-from-B", "x-from-B");
    }
    String get(){
        return b;
    }
}