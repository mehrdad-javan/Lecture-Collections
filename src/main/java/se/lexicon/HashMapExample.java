package se.lexicon;

import se.lexicon.model.Person;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Simon", "simon@lexicon.se");
        contacts.put("Ulf", "ulf@lexicon.se");
        contacts.put("Mehrdad", "mehrdad@lexicon.se");

        System.out.println(contacts.get("Ulf"));

        HashMap<Integer, Person> people = new HashMap<>();


    }

}
