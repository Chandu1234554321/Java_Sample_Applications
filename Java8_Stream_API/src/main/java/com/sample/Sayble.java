package com.sample;

interface sayable{  
    void say(String msg);   // abstract method  
}  
@FunctionalInterface  
interface Doable {  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  
