package DaysFrom20To30;

import java.util.HashMap;
import java.util.Map;

public class Day21 {
    public static void main(String [] args){
        //this day 21 from 100DaysOfCode
        //HashMap
        /*In Java, HashMap is part of the Java Collections Framework
         It provides the basic implementation of the Map interface in Java. HashMap
         stores data in (key, value) pairs. Each key is associated with a value,
         and you can access the value by using the corresponding key.
         */

        /*Initialise a HashMap named students with Integer key and String
        value to save roll-numbers and names of students
         */
        HashMap<Integer,String> students = new HashMap<>();

        //Add items to the HashMap students
        students.put(0001, "Ali");
        students.put(0002, "Omar");
        students.put(0003, "Fatima");

        /*Access items from the students HashMap using get() and print the students name*/
        System.out.println("the first student in the class: "+students.get(0001));
        System.out.println("**************************************");

        //Check if a key exists in the HashMap
        System.out.println("does key 0002 exists in our HashMap? "+students.containsKey(0002));
        System.out.println("**************************************");

        //Remove an item from the HashMap
        students.remove(0001);
        System.out.println("does the 0001 key still exists in the HashMap? " +students.containsKey(0001));
        System.out.println("**************************************");

        //Print the number of elements(size) in the HashMap
        System.out.println("the number of elements size in the HashMap is: "+ students.size());
        System.out.println("**************************************");

        //Print all the students names one-by-one by looping through the HashMap using keySet()
        for(Integer key: students.keySet()){
            String name = students.get(key);
            System.out.println("student name: "+name);
        }
        System.out.println("**************************************");

        //Print all the students names one by one by looping through the HashMap using entrySet()
        for (Map.Entry<Integer,String> entry: students.entrySet()){
            Integer rollNumber = entry.getKey();
            String name = entry.getValue();

            System.out.println("key: "+ rollNumber + " value: "+name);
        }
        System.out.println("**************************************");

    }
}
