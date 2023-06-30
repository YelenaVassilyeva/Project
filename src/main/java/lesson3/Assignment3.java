package lesson3;

public class Assignment3 {
    //1.) print if one string is part of another:
    //for example:
    //String a = Category
    //String b = Cat
    //compareStrings(a, b)
    //output
    //"Cat is the part of Category"
    //2.) If Strings are equal, the expected print is:
    //"The Strings are the same"
    //3.) If one of the strings is a null -  print:
    //"Cannot compare Strings"
    //method:
    //public void compareStrings(){
    public String string1 ="AsS";
    public String string2 = null;
    String word = "fghg";
    String word1 = "";
    char ch;

    public static void main(String[] args) {
        Assignment3 assignment3 = new Assignment3();
        assignment3.compareStrings(assignment3.string1, assignment3.string2);
        Assignment3 pal = new Assignment3();
        boolean palindrome= pal.isPalindrome("fghg") ;
        System.out.println("Palindrome status: " + palindrome);

    }

    public void compareStrings(String string1, String string2) {

        if (string1==null ||string2 == null) {
            System.out.println("cannot compare strings");
       }
else {

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        if ( string1.equals(string2)) {
            System.out.println("the strings are equal");
        } else if (string1.contains(string2)) {
            System.out.println(string2 + " is a part of " + string1);
        } else if (string2.contains(string1)) {
            System.out.println(string1 + "is a part of " + string2);
        } else System.out.println(string1 + " and " + string2 + " are completely different strings");


    }}
//Given a string, write a program to check if it is palindrome or not (return boolean).
//A string is said to be palindrome if the reverse of the string is the same as string. For example, “racecar”
// is a palindrome, but “carrace” is not a palindrome. Return boolean true or false.
    public boolean isPalindrome(String word) {
             word1 = "";
        for (int i = 0; i <= word.length()-1; i++) {
            char ch = word.charAt(i);
             word1 = ch + word1;}
        System.out.println("original word: " + word);
        System.out.println("Reversed word: " + word1);
          boolean palindrome = true;
        if (word.equals(word1)) {
             return palindrome;
        }
         else
         return false;

    }
}




