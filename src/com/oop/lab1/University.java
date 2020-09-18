package com.oop.lab1;

import java.util.ArrayList;

public class University{
    private String name;
    private int foundationYear;
    private ArrayList<Student> studentList;
    public University(String universityName, int universityFoundationYear){
        name = universityName;
        foundationYear = universityFoundationYear;
        studentList = new ArrayList<Student>();
    }
    // Setters
    public void AddStudent(Student student){
        studentList.add(student);
    }
    public void RemoveStudent(String name){
        studentList.removeIf(Student -> (Student.GetName() == name));
    }
    public void ChangeFoundationYear(int year) {
        foundationYear = year;
    }
    // This function returns mark media
    public float GetMediumMark(){
        if (studentList.size() == 0){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < studentList.size(); i++){
            sum += studentList.get(i).GetMark();
        }
        return sum / (float)studentList.size();
    }
    // This function prints summary of university
    public void Summary(){
        System.out.println("University name: " + name);
        System.out.println(" Foundation year: " + foundationYear);
        System.out.println(" Students amount: " + studentList.size());
        System.out.println("--- Student summary ---");
        for (int i = 0; i < studentList.size(); i++){
            studentList.get(i).Summary();
        }
        System.out.println("--- Student summary ---");
    }
}
