package DaysFrom20To30;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Stack;

public class Day22 {
    public static void main(String [] args){
        //this is the Day 22 from 100DaysOfCode
        //Stack

        /*This is a legacy class within the Java Collections Framework that represents a Last-In,
         First-Out (LIFO) data structure. It extends the Vector class and provides
         methods like push() to add elements to the top, pop() to remove and return the
          top element, peek() to view the top element without removing it,
         and empty() to check if the stack is empty.
        * */

        //Initialise a Stack of String values and push items to it
        Stack<String> names = new Stack<>();

        names.push("Alaaa");
        names.push("Islam");
        names.push("Areej");
        names.push("Mohammad");
        names.push("Amer");

        //Remove the top element from the Stack: the top element hare is Amer
        System.out.println("this is the last elements in the stack and after this line it would not be exists: "+names.pop());
        System.out.println("**************************************");


        //Print the top element of the Stack without removing from it
        System.out.println("this is the last current elements in the stack: "+names.peek());
        System.out.println("**************************************");

        //Check if a value exists in the Stack
        System.out.println("is Islam exists in the stack? "+ names.contains("Islam"));
        System.out.println("**************************************");

        //Print the number of values(size) in the Stack
        System.out.println("this is the size of our stack: "+names.size());
        System.out.println("**************************************");

        //Remove all values from the Stack
        names.clear();
        System.out.println("check is the stack is empty: "+names.empty());
        System.out.println("**************************************");


    }
}
