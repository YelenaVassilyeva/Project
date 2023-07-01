package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment4 {
    int d;
    public static void main(String[] args) {
        Assignment4 assignment4 = new Assignment4();
         String s = assignment4.getDay(1);
         System.out.println(s);
        assignment4.removeDuplicates();
        String name = assignment4.getToyById();
        System.out.println("The toy name: " + name);

    }

    //Create a method with an array list of days of the week from Sunday to Saturday.
    // The method can receive a number and return/print the day of the week.
    //example:
    //public String getDay(int day){
    //}
    public String getDay(int day) {

        ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.add("Sunday");
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        int i = day;
        if (i <= 7) {
            String string = weekDays.get(i-1);
            return string;
        } else return "error";

    }

    //The program should receive an ArrayList of Strings and print all the words with no duplicates.for example:
//input[Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
//output:[Steve, Tim, Lucy, Pat, Angela, Tom, Anna]
    public void removeDuplicates() {

        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        arrayList.add("Steve");
        arrayList.add("Tim");
        arrayList.add("Lucy");
        arrayList.add("Lucy");
        arrayList.add("Pat");
        arrayList.add("Angela");
        arrayList.add("Tom");
        arrayList.add("Tim");
        arrayList.add("Pat");
        arrayList.add("Steve");
        arrayList.add("Steve");

        Collections.sort(arrayList);

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) != arrayList.get(i + 1)) {
                result.add(arrayList.get(i));
            }
        }

        result.add(arrayList.get(arrayList.size() - 1));
        System.out.println("List without duplicates: " + result);
    }
    //The online Toys store has 5 different products
    // – Batmobile (ID12), Light Saber(ID45), Wonder Woman (ID6), Hello Kitty Bag(ID201),
    // and Junior QA Analyst Doll (ID56). Each product has its own unique ID.
    // Please create a Method “public String getToyById(int id)” which will build
    // the hashmap of ids/products described above (Hashmap<Integer, String>)
    // and return the name of the toy by ID.
    // For example, calling getToyById(6) from the main method will return and print “Wonder Woman”.
    //Additional requirement:If there is no product with an id specified in the call,
    // return “No such Toy” String instead.

    public String getToyById() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(12, "Batmobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Woman");
        hashMap.put(201, "Helo Kitty");
        hashMap.put(56, "QA Doll");
        Scanner scanner = new Scanner(System.in);
// ask the question in console
        System.out.print("Enter the Toy ID: ");
// get  input as a String
        int id = Integer.parseInt(scanner.next());
        if (hashMap.containsKey(id)){
            String name = hashMap.get(id);

            return name;
        }

        return "no such toy";


    }
}




