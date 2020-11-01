package com.oop.lab1;

public class Student{
    private String name;
    private byte age;
    private byte mark;
    public Student(String studentName, byte studentAge, byte studentMark){
        name = studentName;
        age = studentAge;
        mark = studentMark;
    }
    // Setters
    public void SetName(String studentName){
        name = studentName;

    }
    public void SetAge(byte studentAge){
        age = studentAge;
    }
    public void SetMark(byte studentMark){
        mark = studentMark;
    }
    // Getters
    public String GetName(){
        return name;
    }
    public byte GetAge(){
        return age;
    }
    public byte GetMark(){
        return mark;
    }
    // This function print out students info
    public void Summary(){
        System.out.println("=================");
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student mark: " + mark);
        System.out.println("=================");

    }
}
