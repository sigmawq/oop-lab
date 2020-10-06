/*
Main for LAB 1 and LAB 2
*/

package com.oop;

import com.oop.lab1.*;
import com.oop.lab2.*;

public class Main {
    public static void main(String[] args) {
	// LAB 1 Code To Execture
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
        // LAB 2 Code To Exectute
        // 5 || 6
        // Without parameters
        Box firstBox = new Box();
        // With one parameter
        Box secondBox = new Box(5);
        // With 3 parameters
        Box thirdBox = new Box(5, 6, 7);

        // 8 || 9
        // Without parameters
        Queue q1 = new Queue();
        q1.Push(5); q1.Push(6); q1.Push(10);
        q1.Pop(); // Pop first
        q1.Pop(); // Pop second
        System.out.println("Last element of q1 " + q1.Pop()); // Pop third (and last)

        // With parameters
        Queue q2 = new Queue(10);
        q2.Push(33); q2.Push(66);
        q2.Pop(); // Pop first
        System.out.println("Last element of q2 " + q2.Pop()); // Pop second (and last)

        // 9 || 10
        // Box math
        System.out.println("Volume/Surface area for first box");
        System.out.println(firstBox.CalculateVolume());
        System.out.println(firstBox.CalculateSurfaceArea());

        System.out.println("Volume/Surface area for second box");
        System.out.println(secondBox.CalculateVolume());
        System.out.println(secondBox.CalculateSurfaceArea());

        System.out.println("Volume/Surface area for third box");
        System.out.println(thirdBox.CalculateVolume());
        System.out.println(thirdBox.CalculateSurfaceArea());

        // Queue statuses
        q1.Push(200);
        System.out.println("Is q1 empty? " + q1.IsEmpty());
        System.out.println("Is q1 full? " + q1.IsFull());
        System.out.println("Is q2 empty? " + q2.IsEmpty());
        System.out.println("Is q2 full? " + q2.IsFull());
    }
}
