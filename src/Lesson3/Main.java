package Lesson3;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Apple");
        fruit.add("Grape");
        fruit.add("Grape");
        fruit.add("Grape");
        fruit.add("Grape");
        fruit.add("Lime");
        fruit.add("Lime");
        fruit.add("Lime");
        fruit.add("Plump");
        fruit.add("Orange");
        fruit.add("Orange");
        fruit.add("Orange");
        fruit.add("Orange");
        fruit.add("Pineapple");
        fruit.add("Pineapple");
        fruit.add("Pineapple");
        fruit.add("Pineapple");
        fruit.add("Pineapple");
        fruit.add("Pineapple");
        fruit.add("Apple");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Kiwi");
        fruit.add("Apple");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Apple");
        System.out.println(fruit);
        Map<String, Integer> fruitMap = new TreeMap<>();
        for (String f: fruit ) {
            int val = fruitMap.getOrDefault(f, 0);
            fruitMap.put(f, val + 1);
        }
        System.out.println(fruitMap);

        System.out.println("Task #2");
        RefBook phoneBook = new RefBook();
        phoneBook.addPhone("Ivanov","123456");
        phoneBook.addPhone("Ivanov","44556677");
        phoneBook.addPhone("Petrov","11111111");
        phoneBook.addPhone("Petrov","123456");
        phoneBook.addPhone("Sidorov","4499999");
        phoneBook.addPhone("Smit","1213141516");

        System.out.println("Ivanov, tel: "+ phoneBook.getPhones("Ivanov"));
        System.out.println("Petrov, tel: "+ phoneBook.getPhones("Petrov"));
    }
}
