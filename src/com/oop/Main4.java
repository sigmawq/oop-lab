/*
Main file to run LAB 4
 */

package com.oop;
import com.oop.lab4.ExpressionAnalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        // Advanced Level (mark 7 || 8) AND Advanced Level (mark 9 || 10)
        try {
            // Change to your path
            File myObj = new File("/home/sigmawq/IdeaProjects/oop-lab/src/com/oop/lab4/three_expressions.txt");
            Scanner myReader = new Scanner(myObj);
            int line = 1;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ExpressionAnalyzer expressionAnalyzer = new ExpressionAnalyzer(data);
                System.out.println("Expression at line " + line + " is " + (expressionAnalyzer.isRight() ? "correct" : "incorrect"));
                System.out.println(data);
                line++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        ExpressionAnalyzer x = new ExpressionAnalyzer(")))x + x(((");
        System.out.println(x.isRight());
    }
}
