package se.lexicon;

import se.lexicon.model.Person;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ex6();
    }

    public static void ex1() {
        ArrayList<Integer> numbers = new ArrayList<>(); // [100, 100, 400, 300, 200]
        numbers.add(100); // index 0
        numbers.add(100); // index 1
        numbers.add(400); // index 2
        numbers.add(300); // index 3
        numbers.add(200); // index 4
        //
        System.out.println(numbers.size()); // 5

        System.out.println(numbers.get(0)); // 100
        System.out.println(numbers.get(1)); // 100
        System.out.println(numbers.get(2)); // 400
        //System.out.println(numbers.get(5)); // IndexOutOfBoundsException -> Index 5 out of bounds for length 5

        System.out.println("------------------");

        Iterator<Integer> integerIterator = numbers.iterator();
        while (integerIterator.hasNext()) {
            Integer number = integerIterator.next();
            System.out.println(number);
            if (number.equals(100)) {
                integerIterator.remove();
            }
        }

        System.out.println(numbers.size()); // 3
        System.out.println(numbers); // [400, 300, 200]
        System.out.println("----------------------");
        for (Integer number : numbers) { //  [400, 300, 200]
            System.out.println(number);
            if (number.equals(400)) {
                //numbers.remove(number); // java.util.ConcurrentModificationException
            }
        }


    }

    public static void ex2() {
        ArrayList<Integer> numbers = new ArrayList<>(); // [100, 100, 400, 300, 200]
        numbers.add(100); // index 0
        numbers.add(100); // index 1
        numbers.add(400); // index 2
        numbers.add(300); // index 3
        numbers.add(200); // index 4
        System.out.println(numbers.size()); // 5
        Integer integer100 = new Integer(100);
        boolean isRemoveObject100 = numbers.remove(integer100);
        boolean isRemoveObject10 = numbers.remove(Integer.valueOf(10));
        System.out.println(isRemoveObject100); // true
        System.out.println(isRemoveObject10); // false
        System.out.println(numbers.size()); // 4

        //  // [100, 400, 300, 200]
        Integer removedIndexValue = numbers.remove(2);
        System.out.println(removedIndexValue); // 300
        System.out.println(numbers.size()); // 3

        System.out.println("-------------");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("-------------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


    }

    public static void ex3() {
        List<String> euCars = new ArrayList<>();
        euCars.add("Volvo");
        euCars.add("BMW");
        euCars.add("Volvo");

        System.out.println(euCars.size()); // 3

        List<String> usaCars = new ArrayList<>();
        usaCars.add("Tesla");

        euCars.addAll(usaCars); // add to the end of the list
        //euCars.addAll(1, usaCars);

        for (String car : euCars) {
            System.out.println(car);
        }

        System.out.println(euCars.lastIndexOf("Volvo")); // 2
        System.out.println(euCars.lastIndexOf("Tesla")); // 3
        System.out.println(euCars.lastIndexOf("Test")); // -1

    }

    public static void ex4() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        System.out.println("Original List: " + numbers);
        numbers.sort(null);
        //numbers.sort(Collections.reverseOrder());


        //Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        List<String> letters = Arrays.asList("D", "B", "A", "C", "a");
        //letters.sort(null); // [A, B, C, D, a]
        letters.sort(String.CASE_INSENSITIVE_ORDER); // [A, a, B, C, D]

    }

    public static void ex5(){
        String test1 = "TEST"; // abc123
        String test2 = "TEST"; // ddd333
        boolean isCompareString = test1.equals(test2);
        System.out.println(isCompareString);// true
        System.out.println(test1.hashCode()); // 1234567
        System.out.println(test2.hashCode()); // 1234567


        Person person1 = new Person(1, "Test1", "Test1", "test1@test.se");
        Person person2 = new Person(1, "Test1", "Test1", "test1@test.se");
        boolean isEqualPersons = person1.equals(person2); // true
        System.out.println(isEqualPersons);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println("----------");
        System.out.println(person1); //
        System.out.println(person2); //

    }

    public static void ex6(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(3, "John", "Doe", "jon@test.se"));
        people.add(new Person(1, "Alice", "Smith", "alice@test.se"));
        people.add(new Person(2, "Bob", "Johnson", "bob@test.se"));
        System.out.println("Original List: ");
        for (Person person: people){
            System.out.println(person);
        }
        System.out.println("--------------------");
        //Collections.sort(people);

        /*Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person param1, Person param2) {
                return param1.getFirstName().compareTo(param2.getFirstName());
            }
        });*/

        // How to sort the people by email?
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getEmail().compareTo(o1.getEmail());
            }
        });

        // Collections.sort(people, Comparator.comparing(Person::getEmail));


        System.out.println("Sorted List: ");
        for (Person person: people){
            System.out.println(person);
        }
        System.out.println("--------------------");

    }
}
