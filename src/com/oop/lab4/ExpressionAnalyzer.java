package com.oop.lab4;
//import java.util.Stack;

public class ExpressionAnalyzer {
    private String _data;
    public ExpressionAnalyzer(String data){
        _data = data;
    }
    public boolean isRight(){
        int p_counter = 0;
        for (int i = 0; i < _data.length(); i++){
            if (_data.charAt(i) == '('){
                p_counter++;
            }
            else if (_data.charAt(i) == ')'){
                p_counter--;
            }
            // ')' met at a point where there were no opening '(', abort.
            if (p_counter < 0) return false;
        }
        if (p_counter != 0) return false;
        return true;
    }
}
