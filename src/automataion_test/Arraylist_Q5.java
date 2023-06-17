package automataion_test;

import java.util.ArrayList;

/**
 * 5.1 Create the class with tha name "ArrayList_Q5"
 * 5.2 Create the Main Method
 * 5.3 Declare the String type Arraylist and add the values "Scrum", "Java","Jira", "Selenium","Cucumber","Postman",
 *     "Rest Assured"
 * 5.4 Print the list using a forEach loop.
 */

public class Arraylist_Q5


{
    public static void main(String[] args)
    {
        ArrayList<String> list =new ArrayList<>();
        list.add("Scrum");
        list.add("Java");
        list.add("Jira");
        list.add("Selenium");
        list.add("Cucumber");
        list.add("Postman");
        list.add("Rest Assured");

        for(String List : list)
        {
            System.out.println(List);
        }
    }
}