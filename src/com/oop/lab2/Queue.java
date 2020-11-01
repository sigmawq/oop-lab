package com.oop.lab2;

import java.lang.reflect.Type;
import java.util.*;

public class Queue {
    boolean ifHasLimit;
    private int maxElements;
    LinkedList<Integer> container;
    public Queue(){
        ifHasLimit = false;
        container = new LinkedList<>();
    }
    public Queue(int maxElements){
        ifHasLimit = true;
        this.maxElements = maxElements;
        container = new LinkedList<>();
    }
    public void Push(int element){
        if (container.size() == maxElements && ifHasLimit){
            System.out.println("Failed to add an element to queue");
            return;
        }
        container.addLast(element);
    }
    public int Pop(){
        Integer a = container.pop();
        return a.intValue();
    }
    public boolean IsEmpty(){
        if (container.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean IsFull(){
        if (ifHasLimit && container.size() == maxElements){
            return true;
        }
        else{
            return false;
        }
    }
}
