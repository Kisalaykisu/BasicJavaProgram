package com.bridgelabz;

public class Practice_Problem_3 {
    public static void main(String args[]){
        String a = "KISALAY";
        String b = "kisalay";

        if(a.equals(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        if(a.equalsIgnoreCase(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
    }
}
