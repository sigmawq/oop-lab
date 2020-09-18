package com.oop;

import com.oop.lab1.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("HW");

        // Base level 5 || 6
        Monitor testMonitor1 = new Monitor("testMonitor1", new float[] { 1.0f, 1.0f, 1.0f }, 1920, 1080 );
        testMonitor1.Summary();
        Monitor testMonitor2 = new Monitor("testMonitor2", new float[] { 1.0f, 1.0f, 1.0f }, 1366, 768 );
        testMonitor1.Comapre(testMonitor2);

        // Advanced level (7 || 8)
        Student a = new Student("Alex", (byte)20, (byte)7);
        Student b = new Student("Mark", (byte)18, (byte)10);
        University univ = new University("A good university", 1950);
        univ.AddStudent(a);
        univ.AddStudent(b);
        univ.Summary();

        // Advanced level (9 || 10)
        Student c = new Student("John", (byte)19, (byte)10);
        Student d = new Student("Ann", (byte)21, (byte)8);
        Student e = new Student("Victor", (byte)22, (byte)9);
        Student f = new Student("Jane", (byte)18, (byte)4);

        University univ1 = new University("Great University", 1962);
        univ1.AddStudent(c); univ1.AddStudent(d);

        University univ2 = new University("Just decent University", 1982);
        univ2.AddStudent(e); univ2.AddStudent(f);

        System.out.println("1st University media: " + univ.GetMediumMark());
        System.out.println("2nd University media: " + univ1.GetMediumMark());
        System.out.println("3rd University media: " + univ2.GetMediumMark());

    }
}
