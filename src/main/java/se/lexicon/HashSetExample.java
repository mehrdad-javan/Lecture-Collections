package se.lexicon;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> countries = new HashSet<>();
        countries.add("Sweden");
        countries.add("India");
        countries.add("USA");
        countries.add("Syria");
        countries.add("Iran");
        countries.add("Sweden");

        System.out.println(countries.size());// 5


    }

}
