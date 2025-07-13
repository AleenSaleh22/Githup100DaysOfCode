package DaysFrom20To30;

import java.util.LinkedList;
import java.util.Queue;

public class Day23 {
    public static void main(String[] args) {
        //this is the Day 23 from 100DaysOfCode
        //Queue
        /*Queue is an interface within the Java Collections Framework that
        represents a collection designed for holding elements prior to processing.
         It typically follows the First-In, First-Out (FIFO) principle,
         meaning the element added first is the first one to be retrieved.
         * */

        //Initialise a Queue of String values and add items to it
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("Ali");
        myQueue.add("Islam");
        myQueue.add("Omar");
        myQueue.add("Osama");
        myQueue.add("Salam");
        myQueue.add("Nana");

        //Remove the head element from the Queue
        System.out.println("Remove the first element in the Queue: "+myQueue.remove());
        System.out.println("**************************************");

        //Print the first element of the Queue without removing from it
        System.out.println("this is the first element in my current queue without removing it: "+myQueue.element());
        System.out.println("**************************************");

        //Check if a value exists in the Queue
        System.out.println("Is Salam as a name exists in myQueue? "+myQueue.contains("Salam"));
        System.out.println("**************************************");

        //Print the number of values(size) in the Queue
        System.out.println("the size of this queue is: "+myQueue.size());
        System.out.println("**************************************");

        //Remove all values from the Queue
        System.out.println("Remove all elements from the queue");
        myQueue.clear();
        System.out.println("Does my queue is empty? "+myQueue.isEmpty());
        System.out.println("**************************************");





    }
}
