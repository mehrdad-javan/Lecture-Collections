package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ex3();
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
}
