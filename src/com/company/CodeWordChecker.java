package com.company;

public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String invalid;
    public CodeWordChecker(int min, int max, String invalid){
        this.min = min;
        this.max = max;
        this.invalid = invalid;
    }
    public boolean isValid(String str){
        if (str.length() < min || str.length() > max){
            return false;
        }
        if (str.contains(invalid)){
            return false;
        }
        else{
            return true;
        }
    }
    public CodeWordChecker(String invalid){
        this.min = 6;
        this.max = 20;
        this.invalid = invalid;
    }
}
