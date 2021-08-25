import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.*;

public class KissZsoltNorbertHomeWorkWeek2 {
    public static void main(String[] args) {

        System.out.println("Exercise 1");
        exercise1();
        System.out.println("------");

        System.out.println("Exercise 2");
        exercise2();
        System.out.println("-----");

        System.out.println("Exercise 3");
        exercise3();
        System.out.println("-----");

        System.out.println("Exercise 4");
        exercise4();
        System.out.println("-----");

    }

    //Exercise 1
    public static void exercise1() {
        String a = "integration";
        String b = "automation";

        //Solution 1
        System.out.println("Strings are equal? Answer: " + a.equals(b));

        //Solution 2
        int l1 = a.length();
        int l2 = b.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int a_ch = a.charAt(i);
            int b_ch = b.charAt(i);

            if (a_ch != b_ch) {
                System.out.println("The strings are not equal");
                break;
            } else
                System.out.println("The strings are equal: " + a + b);


        }
    }

    //Exercise 2
    public static void exercise2() {
        String c = "madam";
        String d = "";
//        System.out.println(c.length());

        for (int i = c.length() - 1; i >= 0; i--) {
            d = d + c.charAt(i);
//            System.out.println(d);
        }
        if (c.equals(d)) {
            System.out.println("The string is a PALINDROME!");
        } else {
            System.out.println("The string is NOT a palindrome!");
        }
    }
    //Exercise 3

    public static void exercise3() {
        String e = "";
        String f[] = {};
        List<String> g = new ArrayList<String>();
        g.add("Elena");
        g.add("leO");
        g.add("Ionut");
        g.add("xAvIeR");
        g.add("Ada");
        g.add("kAiTlyN");


        for (int i = 0; i < g.size(); i++) {
            String name = g.get(i);
            char x = name.charAt(0);
            // If the word starts with a vowel, make it all lowercase and append it to the empty string
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {

                e = e + g.get(i).toLowerCase();
            } else {
                //If the word starts with a consonant, make it all uppercase and add it to the empty array
                f = Arrays.copyOf(f, f.length + 1);
                f[f.length - 1] = g.get(i).toUpperCase();
            }
        }
        System.out.println("The Words starts with Vowels are: " + e);
        System.out.println("The Words starts with consonant are: " + Arrays.toString(f));

        //If the word contains letter x or X or has less than 3 letters, replace the word with "skipped" and print into the console the current word and the replaced word
        for (int i = 0; i < g.size(); i++) {
            for (int j = 0; j < g.get(i).length(); j++) {
                String name = g.get(i);
                char y = name.charAt(j);
                if (y == 'x' || y == 'X' || g.get(i).length() < 3) {
                    System.out.println("Word that contains X or has less than 3 characters is : " + g.get(i));
                    g.set(i, "Skipped");
                    System.out.println("New word: " + g.get(i));
                    continue;
                }

            }
        }
    }

    public static void exercise4() {
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("Zsolt", "zsolt@email.com");
        myMap.put("Alex", "alex@gmail.com");
        myMap.put("Andy", "andy@gmail.com");
        myMap.put("Thomas", "thomas@gmail.com");
        myMap.put("Leo", "leo@email.com");

        //Size of the MAP
        System.out.println("The size of the map is " + myMap.size());

        // Check that map contains a specific name
        System.out.println("Is the key 'Zsolt' present? : " + myMap.containsKey("Zsolt"));

        //Get the email that contains that specific name
        System.out.println("The email for that specific name is: " + myMap.get("Zsolt"));

        // Remove an entry
        System.out.println("The removed entry is: " + myMap.remove("Thomas"));
        System.out.println("The NEW size of the map is " + myMap.size());

        //Sort by key
        Map<String, String> sortedMap = new TreeMap<>(myMap);
        sortedMap.entrySet().forEach(System.out::println);

    }

}


