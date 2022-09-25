package com.myAnagram.polindrome;

public class VerifyPolindrome {
    public static void main(String[] args) {

        String x = "toO hot tO Hoot";
        //here I take out the spaces between the words
        x = x.replace(" ", "");
        //here I move the characters to lowercase
        x = x.toLowerCase();
        //I generate an array of char from my input stored in "x".
        char y[] = x.toCharArray();
        //I get the lenght using the char y[].
        int size = y.length;
        //I generate a new char array to verify  with the lengh of the input
        //  (if it is not the same, it is not a polindrome) using the length of the original array.
        char a[] = new char[size];

        int i = 0;

        while (i != size) {
            //here I declare the last postion of the array to be fulfilled the equivalent position of the original array
            //the size minus 1, minus i results last position
            a[size - 1 - i] = y[i];
            ++i;
        }

        i = 0;
        //here is the condition how many times to do the loop
        while (i != size) {
            //here if there is only one miss match it came out of the loop with a message
            if (a[i] != y[i]) {
                System.out.println("Not a Polindrome");
                //here I close the programme.
                System.exit(0);
            } else {
                //if not, I procced with the loop
                ++i;
                continue;
            }
        }
        System.out.println("It is a Polindrome");
    }
}
