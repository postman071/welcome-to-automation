package automataion_test;

import java.util.Scanner;

public class IfThenElse_Q3
{
    public boolean isTeen(int age) {
        if
        (age<=18)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age");

        int age=sc.nextInt();

        IfThenElse_Q3 i=new IfThenElse_Q3();
        System.out.println(i.isTeen(age));


    }
}
