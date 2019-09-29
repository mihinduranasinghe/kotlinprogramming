package com.functions;
//function interoperability in kotlin
public class fun2java {
    public static void main(String[] args) {
       // System.out.println("Max Value of kotlin file function  is : " + com.functions.Fun2expressionsKt.maxVal(50,60));
        System.out.println("Max Value of kotlin file function  is : " + mycusomkotlinfile.maxVal(50,60));
    }

    public static int sumVall(int a, int b){
        return a+b;
    }
}
