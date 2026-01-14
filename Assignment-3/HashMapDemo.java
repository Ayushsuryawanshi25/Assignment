// Write a program to demonstrate all constructors and 15 methods of HashMap.

import java.util.*;

public class HashMapDemo{
 public static void main(String [] args){
	System.out.println("=========================Hashmap constructor and method demonstration==========================");
 // Default constructor
  HashMap<Integer,String>map1 = new HashMap<>(); 
  System.out.println("Default Constructor"+map1);
  
 // parameterized constructor
   HashMap<Integer,String>map2 = new HashMap<>(20);
   System.out.println("Another Constructor with Initial capacity" +map2);
   
 // HashMap for method demonstration
    HashMap<Integer,String> fruitchain = new HashMap <>(20);
	fruitchain.put(100,"orange");
	fruitchain.put(400,"banana");
	fruitchain.put(200,"kiwi");
	System.out.println(fruitchain);
	String oldvalue = fruitchain.put(100,"Red Grapes");
	System.out.println("updated map" + fruitchain);
	
 // get (key)
  String fruit = fruitchain.get(400);
  System.out.println("value at key 400:" + fruit);
  
 // keySet()
   System.out.println("Keys: " + map1.keySet());

 // values()
    System.out.println("Values: " + map1.values());

 // entrySet()
    System.out.println("entries" );
    Set<Map.Entry<Integer, String>> entries = fruitchain.entrySet();
        System.out.println("All entries:");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("  Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
  
    }
  }
 