package org.example;
import java.util.*;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation


            String[] fruits = new String[size];

        Arrays.fill(fruits, "apple");

            return fruits;

    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        if (fruits.length < 1)
            return null;
        else {
            String[] topThreeFruits = new String[3];
            topThreeFruits[0] = fruits[0];
            topThreeFruits[1] = fruits[1];
            topThreeFruits[2] = fruits[2];

            return topThreeFruits;
        }
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");
        fruitList.add("date");
        fruitList.add("elderberry");

        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> three_fruits_array = new ArrayList<String>();
        three_fruits_array.add(fruit1);
        three_fruits_array.add(fruit2);
        three_fruits_array.add(fruit3);
        return three_fruits_array;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> fruit_map = new HashMap<String, String>();
        fruit_map.put("apple","red");
        fruit_map.put("banana","yellow");
        fruit_map.put("cherry","red");
        fruit_map.put("date","brown");
        fruit_map.put("elderberry","black");
        return fruit_map;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        return fruitMap.get("apple");
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruit_set = new HashSet<String>();
        fruit_set.add(fruit1);
        fruit_set.add(fruit2);
        fruit_set.add(fruit3);
        return fruit_set;
    }
}
