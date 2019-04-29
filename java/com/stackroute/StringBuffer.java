package com.stackroute;
import java.util.Scanner;

public class StringBuffer {

    public String reverseStr()
    {
        String str = "Tejaswini";
        String rev = "";

        int len = str.length();


        for (int i = len - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        return rev;
    }
}