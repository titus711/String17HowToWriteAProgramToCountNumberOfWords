package com.titoacademy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String x = "WE ARE PROUD AFRICANS, ARE";
        String word = "ARE";
        String [] myString = x.split(" ");

        int count = 0;

        for (int i = 0; i < myString.length;i++){
            if (word.equals(myString[i])){
                count++;
            }
        }

        System.out.println("The total count is " + count);


    }
}
