package com.example.quizapp;

public class QuestionAnswer {

    public static String question[] ={

            "Who invented Java Programming? ",
            "Which component is used to compile,debug and execute java programs?",
            "Which one of the following is not a java features?",
            "What is the extension of java code files?",
            "Which of the following is not an OOPS concept in java"

    };
    public static String choices[][]={
            {"Guido  van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup"},
            {"JRE","JIT","JDK","JVM"},
            {"Object Oriented","Use of Pointer","Portable","Dynamic and Extensible"},
            {".js",".txt",".class",".java"},
            {"Polymorphism","Inheritance","Compilation","Encapsulation"}

    };

    public static String correctAnswers[]={
            "James Gosling",
            "JDK",
            "Use of Pointers",
            ".java",
            "Compilation"

    };
}
