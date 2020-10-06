package com.oop.lab3;

import java.awt.*;
import java.lang.reflect.Array;
import java.lang.Character;
import java.util.*;
import java.util.Map;
import java.lang.*;

public class TextManipulation {
    public String text;
    private String lastWord;
    private char lastChar;
    private SortedMap<String, Integer> mostCommonWordsListMap;
    public TextManipulation(String inputText){
        text = inputText;
        mostCommonWordsListMap = new TreeMap<String, Integer>();
    }
    private void AppendWordToWordList(String word){
        if (word == "") return;
        Integer value = mostCommonWordsListMap.get(word);
        if (value == null){
            mostCommonWordsListMap.put(word, 1);
        }
        else{
            int val = mostCommonWordsListMap.get(word);
            val++;
            mostCommonWordsListMap.replace(word, val);
        }
    }
    private boolean isLetter(char chr) {
        if (chr >= 65 && chr <= 122){
            return true;
        }
        return false;
    }
    private char toUpperCase(char chr){
        if (chr < 97){
            return chr;
        }
        return chr -= 32;
    }
    private boolean isInCharArray(char[] arr, char value){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }
    private boolean lastWordIsEndOfSentence(){
        if (lastWord == "." || lastWord == "!" || lastWord == "?"){
            return true;
        }
        return false;
    }
    private boolean lastCharIsEndOfSentence(){
        if (lastChar == '.' || lastChar == '?' || lastChar == '!'){
            return true;
        }
        return false;
    }
    private int GetWord(int startAt){
        lastWord = "";
        int pos = startAt;
        boolean toEnd = false;
        while (!toEnd
                && text.charAt(pos) != '.'
                && text.charAt(pos) != '!'
                && text.charAt(pos) != '?'
                && text.charAt(pos) != ' '
                && text.charAt(pos) != '\n') {
            if (pos == text.length() - 1) {
                toEnd = true;
            }
            lastWord += text.charAt(pos);
            pos++;
        }
        if (lastWord.length() == 0){
            lastChar = ' ';
        }
        else{
            lastChar = lastWord.charAt(lastWord.length() - 1);
        }
        AppendWordToWordList(lastWord);
        return pos + 1;
    }

    void IntroduceText(String textToProcess) {
        text = textToProcess;
    }
    public int GetWordAmount(){
        int wordCount = 0;
        int pos = 0;
        while (pos < text.length()){
            if (text.charAt(pos) != ' ' && text.charAt(pos) != '!' &&
                    text.charAt(pos) != '?' && text.charAt(pos) != '.'){
                pos = GetWord(pos);
                wordCount++;
            }
            else{
                pos++;
            }
        }
        return wordCount;
    }
    public int GetSentenceAmount(){
        char lastCharacher = ' ';
        int sentenceAmount = 0;
        for (int i = 0; i < text.length(); i++){
            char currentCharacher = text.charAt(i);
            // Continue if last char is the same
            if (currentCharacher == '.' || currentCharacher == '?' || currentCharacher == '!' ||
                i == text.length() - 1){
                if (lastCharacher != '.' && lastCharacher != '?' && lastCharacher != '!'){
                    sentenceAmount++;
                    lastCharacher = currentCharacher;
                    continue;
                }
                continue;
            }
            lastCharacher = ' ';
        }
        return sentenceAmount;
    }
    public int GetAmountOfLetters(){
        int chars = 0;
        for (int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
            if (currentChar >= 65 && currentChar <= 122){
                chars++;
            }
        }
        return chars;
    }
    public int GetVowelsAmount(){
        int vowelsAmount = 0;
        char vowelsList[]  = {65, 69, 73, 79, 85, 89};
        for (int i = 0; i < text.length(); i++){
            char currChr = this.toUpperCase(text.charAt(i));
            if (isLetter(currChr) && isInCharArray(vowelsList, currChr)){
                vowelsAmount++;
            }
        }
        return vowelsAmount;
    }
    public int GetConsonantsAmount(){
        int vowelsConsonants = 0;
        char vowelsList[]  = {65, 69, 73, 79, 85, 89};
        for (int i = 0; i < text.length(); i++){
            char currChr = this.toUpperCase(text.charAt(i));
            if (isLetter(currChr) && !isInCharArray(vowelsList, currChr)){
                vowelsConsonants++;
            }
        }
        return vowelsConsonants;
    }
    public void PrintMostCommonWordsAndTheLongestWord(){
        Object[] words = mostCommonWordsListMap.keySet().toArray();
        System.out.println(
                "Five most common words: "
        );

        for (int i = 0; i < 5; i++){
            System.out.println(words[i]);
            }
        int bestIndex = -1;
        int bestValue = -1;
        for (int i = 0; i < words.length; i++){
            if (words[i].toString().length() > bestValue){
                bestValue = words[i].toString().length();
                bestIndex = i;
            }
        }
        System.out.println(
                "Longest word: " + words[bestIndex]
        );
    }
}
