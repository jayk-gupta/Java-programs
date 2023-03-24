package com.jay;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            if (i==11){
                break;
            }
            if (i==28){
                continue;
            }
            System.out.println(i);
        }
    }
}
