package com.petrusandrey;

import java.util.TreeMap;

public class Tree_Map {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree_map = new TreeMap<>();
        TreeMap<Integer, String> tree_map1 = new TreeMap<>();
        TreeMap<Integer, String> tree_map2 = new TreeMap<>();

        tree_map.put(10, "Andrey");
        tree_map.put(15, "4");
        tree_map.put(20, "ROMA");
        tree_map.put(25, "Dima");
        tree_map.put(30, "Java");
        System.out.println("are: " + tree_map);
        System.out.println("Is the key '20' present? " + tree_map.containsKey(20));
        System.out.println("Is the key '5' present? " + tree_map.containsKey(5));
        System.out.println("====================================================== 1");

        tree_map.put(10, "Andrey");
        tree_map.put(15, "4");
        tree_map.put(20, "ROMA");
        tree_map.put(25, "Dima");
        tree_map.put(30, "Java");
        System.out.println("are: " + tree_map);
        System.out.println("Is the value 'ROMA' present? " + tree_map.containsValue("ROMA"));
        System.out.println("Is the value 'WORLD' present? " + tree_map.containsValue("WORLD"));
        System.out.println("====================================================== 2");

        tree_map.put(10, "Andrey");
        tree_map.put(15, "4");
        tree_map.put(20, "ROMA");
        tree_map.put(25, "Dima");
        tree_map.put(30, "Java");
        System.out.println("are: " + tree_map);
        tree_map.clear();
        System.out.println("Finally the map looks like: " + tree_map);
        System.out.println("====================================================== 3");

        tree_map.put(10, "Andrey");
        tree_map.put(15, "4");
        tree_map.put(20, "ROMA");
        tree_map.put(25, "Dima");
        tree_map.put(30, "Java");
        System.out.println("are: " + tree_map);
        System.out.println("The Value is: " + tree_map.get(10));
        System.out.println("The Value is: " + tree_map.get(30));
        System.out.println("====================================================== 4");

        tree_map.put(10, "Andrey");
        tree_map.put(15, "4");
        tree_map.put(20, "ROMA");
        tree_map.put(25, "Dima");
        tree_map.put(30, "Java");
        System.out.println("Initial Mapping are: " + tree_map);
        String returned_value = (String)tree_map.put(10, "BANANA");
        String returned_value1 = (String)tree_map.put(30, "02020202");
        System.out.println("Returned value is: " + returned_value);
        System.out.println("Returned value is: " + returned_value1);
        System.out.println("New map is: " + tree_map);
        System.out.println("====================================================== 5");

        tree_map2.put(10, "Andrey");
        tree_map2.put(15, "4");
        tree_map2.put(20, "ROMA");
        tree_map2.put(25, "Dima");
        tree_map2.put(30, "Java");
        System.out.println("Initial Mapping are: " + tree_map2);
        String returned_value2 = (String)tree_map2.remove(10);
        System.out.println("Returned value is: " + returned_value2);
        System.out.println("New map is: " + tree_map2);
        System.out.println("====================================================== 6");

        tree_map1.put(10, "Andrey");
        tree_map1.put(15, "4");
        tree_map1.put(20, "ROMA");
        System.out.println("Initial Mapping are: " + tree_map1);
        System.out.println("The size of the map is: " + tree_map1.size());
    }
}
