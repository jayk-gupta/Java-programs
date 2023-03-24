package com.jay;

public class Control_statements {
    public static void main(String[] args) {
/*
   1.IF Statement:
     syntax:
     if(boolean expression( T or F)){
     //body
     }
     else {
     // do this
     }
 */
        int salary = 25400;
        if (salary > 10000) {
            salary += 2000;
        }
        else if (salary > 20000) {
            salary += 3000;
        }
        else {
            salary+=1000;
        }
            System.out.println(salary);



    }
}