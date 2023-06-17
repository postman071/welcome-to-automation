package automataion_test;


import java.util.Scanner;

/**
 * 4.1 Create the class with the name "ForLoop_Q4"
 * 4.2 Create a method with the "printMyName" with no return type and two parameters with the type string and
 *     "name" and int type name 'howManyTime'.
 * 4.3 Write the for loop into the "printMyName" method which prints your name depending upon howManyTime's Value.
 * 4.4 Create the main method
 * 4.5 Create the object and call the 'printMyName' method into tbe main method.
 *
 * output
 * howManyTime= 10 it will print your name 10 times
 * howManyTime= 15 it will print your name 15 times
 */
public class ForLoop_Q4
{
    public void printMyname(String name,int howManyTime)
    {
        for (int i=0; i<howManyTime; i++){
        System.out.println(name);
    }
    }


    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");

        int n=sc.nextInt();
        ForLoop_Q4 i1=new ForLoop_Q4();
        i1.printMyname("Janak",n);
    }
}