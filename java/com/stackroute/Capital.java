package com.stackroute;

import java.util.Scanner;

public class Capital {
    String name="tejaswini";

    public String stringDemo()
    {
        String name1=name.toUpperCase();

        return name1;
    }

    public boolean checkNull()
    {
        if(name.equals(" "))
        {
            System.out.println("Enter Some Input: ");
            return false;
        }
        else
        {
            return true;
        }
    }

}