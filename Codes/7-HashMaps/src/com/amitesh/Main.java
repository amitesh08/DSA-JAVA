package com.amitesh;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("HashMaps");

        //syntax -->  <key, value>
        HashMap<Integer,Integer> name = new HashMap<>();

        //add elements
        name.put(2,10);
        name.put(3,20);
        name.put(4,30);
        name.put(5,40);
        name.put(6,50);
        name.put(7,60);

        //get elements -> just put key to get value.
        name.get(3);

        //check if key exists
        name.containsKey(4);   //it returns boolean value

        //check if value exists
        name.containsValue(30);  //also returns boolean value

        //remove elements
        name.remove(3);

        //print hashmaps value
        for (int key : name.keySet()){
            System.out.print(key+ " "); //to get keys
            System.out.println(name.get(key));  //to get keys value
        }
    }
}