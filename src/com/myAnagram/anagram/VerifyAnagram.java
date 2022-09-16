package com.myAnagram.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class VerifyAnagram {
    public static void main(String[] args) {

      analizeAnagram();

    }
    public static void analizeAnagram(){
        //Here I get the data with the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first word");
        String x = sc.nextLine();

        System.out.println("Write the second word to analize weather it is an anagram or not");
        String y = sc.nextLine();

        // Now, I replace the spaces for no gaps.
        x = x.replace(" ","");
        y = y.replace(" ","");

        //here I change all characters to lowerCase
        x = x.toLowerCase();
        y = y.toLowerCase();

        //Now I create a new array for each variable
        char a[] = x.toCharArray();
        char b[] = y.toCharArray();

        //I sort the arrays here
        Arrays.sort(a);
        Arrays.sort(b);

        //Here I find out wheather the data are anagram or not and finally print the result
        Boolean result = Arrays.equals(a,b);

        if (result == true){
            System.out.println("These Strings ARE anagram");
        }else {
            System.out.println("These are NOT anagram");
        }

    }
}
