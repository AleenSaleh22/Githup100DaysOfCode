package DaysFrom20To30;

import java.util.HashSet;
import java.util.Set;

public class Day20 {
    public static void main(String [] args){
        //set-HashSet
        /*Set is an interface within the Java Collections
         Framework that represents a collection of unique elements*/

        //Initialise a Set of String values and add items to it
        Set<String> setNames = new HashSet<>();

        setNames.add("Liam");
        setNames.add("Noah");
        setNames.add("Layla");
        setNames.add("Elias");
        setNames.add("Maya");
        setNames.add("Sofia");
        setNames.add("Amina");
        setNames.add("Zayn");
        setNames.add("Amir");

        //for check printing all elements in the set
        //setNames.forEach(System.out::println); -->this is a one way to print all the elements
        System.out.println(setNames);
        System.out.println("**************************************");

        //Check if a value exists in the Set
        System.out.println("Does your set contain that name? "+setNames.contains("Sofia"));
        System.out.println("**************************************");

        //Remove a value from the Set
        setNames.remove("Maya");
        System.out.println(setNames);
        System.out.println("**************************************");

        //Print the number of values(size) in the Set
        System.out.println("the size of this set is: "+setNames.size());
        System.out.println("**************************************");

        //Print all the values one-by-one by looping through the Set
        /*We use a for-each loop because a Set does not use indexes like a List does. */

        for(String name: setNames){
            System.out.println("element :"+name);
        }
        System.out.println("**************************************");

        //Remove all values from the Set
        setNames.clear();
        System.out.println("this is the final edition of our set: "+setNames);
        System.out.println("**************************************");

    }
}
