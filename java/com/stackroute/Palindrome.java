package com.stackroute;
public class Palindrome
{
    public int checkPalindrome()
    {
        int num=146898641;
        int rem, res=0, temp, sum=0;

        temp=num;

        while(temp>0)
        {
            rem=temp%10;
            res=(res*10)+rem;
            temp=temp/10;
        }

        if(num==res)
        {
            System.out.println("Number is Palindrome");

            while (num > 0)
            {
                rem = num % 10;
                if (rem % 2 == 0)
                {
                    sum = sum + rem;
                }
                num = num / 10;
            }

            if (sum > 25)
            {
                System.out.println("and the sum of even numbers is greater than 25 ");
            }
            else
            {
                System.out.println("and the sum of even numbers is less than 25 ");
            }
        }
        return 1;
    }
}
