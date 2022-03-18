package com.harman.tapan;

public class Calculator {
    public static void main(String[] args) {
        Addition ob_add= new Addition();
        int x=10,y=20,result;
        result= ob_add.AddOperation(x,y);
        System.out.println(result);
    }
}
