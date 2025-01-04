package com.amitesh;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        //hashset is just like hashmap, but it only contains key part of hashmaps.
        //Syntax
        HashSet<Integer> hs = new HashSet<>();

        //add elements
        hs.add(10);
        hs.add(20);
        hs.add(30);
//        hs.add(10);   --> it will do nothing but replace the value

        //remove elements
        hs.remove(20);

        //contains element or not
//        hs.contains(30);    true
//        hs.contains(40);    false

        //size
        int s = hs.size();
        System.out.println(s);
    }
}
