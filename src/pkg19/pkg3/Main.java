/*
 * Project: Java 2 Programming exercise 19.3 
 * Name: Lauren Smith
 * Date: 3/2/21
 * Description: Makes a method to return an arrayList that removed duplicates from passed list 
 */
package pkg19.pkg3;

import java.util.ArrayList;
public class Main {
    //method to remove duplicates from an arrayList and return simplified array list
    public static <E> ArrayList <E> removeDuplicates(ArrayList <E> list) 
    {
        //makes new ArrayList to return 
        ArrayList <E> nonDup=new ArrayList(); 
        //loops through passed ArrayList with duplicates 
        for(int i=0; i<list.size(); i++) 
        {
            //if the non duplicate list doesn't already contain the element add it to the list 
            if(!(nonDup.contains(list.get(i)))) 
            {
                nonDup.add(list.get(i)); 
            }
            //if it does it's a duplicate so just move on to the next index 
        } 
        //return the new array without duplicates 
        return nonDup; 
    } 
    
}
