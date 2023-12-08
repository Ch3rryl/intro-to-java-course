package com.cbfacademy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;



public class CollectionsExercises {
    

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(8);
        list1.add(2);
        list1.add(9);
        list1.add(2);

        // Index + number to be added
        list1.add(2, 4);

        //  // invoke built-in element() method on the list and print the result
         System.out.print(list1.element());

        return list1;


        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        
    }
   

    public Stack<Integer> useStack() {

        // TODO: create an empty stack
        Stack<Integer>myStack = new Stack<>(); 

        //  - add 5, 6, 8, 9 to the stack
        myStack.push(5);
        myStack.push(6);
        myStack.push(8);
        myStack.push(9);

        //  - print the first element of the stack on the screen
        Integer firstIn = myStack.get(0);
        System.out.print(firstIn);

        //  - print the last element of the stack on the screen
        Integer lastIn = myStack.peek();
        System.out.print(lastIn);

        //  - invoke the method pop() on the stack and print the result on the screen
        Integer poppedOff = myStack.pop();
        System.out.print(poppedOff);
        

        //  - invoke the push(4) method on the stack
        myStack.push(4);

        //  - return the stack
        return myStack;

    }

    public ArrayDeque<Integer> useArrayDeque() {

        // TODO: create an empty arrayDeque
        ArrayDeque <Integer> myDeque = new ArrayDeque<>();

        //  - add 5, 6, 8, 9 to the queue
        myDeque.add(5);
        myDeque.add(6);
        myDeque.add(8);
        myDeque.add(9);

        //  - print the first element of the queue on the screen
        Integer firstDeq =  myDeque.getFirst();
        System.out.print(firstDeq);

        //  - print the last element of the queue on the screen

        Integer lastDeq = myDeque.getLast();
        System.out.print(lastDeq);

        //  - invoke the method poll() on the queue and print the result on the screen
        Integer pollReturn = myDeque.poll();
        System.out.print(pollReturn);

        //  - invoke the element() method on the queue and print the result on the screen
        Integer similarGetFirst = myDeque.element();
        System.out.print(similarGetFirst);

        //  - return the queue
        return myDeque;
    }

    public HashMap<Integer, String> useHashMap() {

        // TODO: create an empty hash map
        HashMap<Integer, String> myHashie = new HashMap<>(); 

        //  - add {1, TypeScript} entry to the map
        myHashie.put(1, "TypeScript");

        //  - add {2, Kotlin} entry to the map
        myHashie.put(2, "Kotlin"); 

        //  - add {3, Python} entry to the map
        myHashie.put(3, "Python");

        //  - add {4, Java} entry to the map
        myHashie.put(4, "Java");


        //  - add {5, JavaScript} entry to the map
        myHashie.put(5, "JavaScript");

        //  - add {6, Rust} entry to the map
        myHashie.put(6, "Rust"); 


        //  - determine the set of keys from the map and print it on the screen
        var findKeys = myHashie.keySet(); 
        System.out.print(findKeys);

  //  - determine the set of values from the map and print it on the screen
        var findValues = myHashie.values();
        System.out.print(findValues); 

      
        //  - determine whether the map contains "English" as a language and print the result on the screen
        var englishCheck = myHashie.containsValue("English"); 
        System.out.print(englishCheck);

        //  - return the map
      return myHashie;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
