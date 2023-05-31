package Basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamsExample {
    public static void main(String[] args) throws IOException {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Alice", 35),
                new Person("Dave", 40)
        );

        // Filter persons whose age is less than or equal to 30
        List<Person> filteredPersons = persons.stream()
                .filter(person -> person.getAge() <= 30)
                .collect(Collectors.toList());
        System.out.println("Filtered Persons: " + filteredPersons);

        // Map person names to uppercase
        List<String> upperCaseNames = persons.stream()
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // Get the count of persons
        long count = persons.stream()
                .count();
        System.out.println("Person Count: " + count);

        // Sort persons by age in ascending order
        List<Person> sortedPersons = persons.stream()
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .collect(Collectors.toList());
        System.out.println("Sorted Persons: " + sortedPersons);

        // Get the first person in the list
        Optional<Person> firstPerson = persons.stream()
                .findFirst();
        System.out.println("First Person: " + firstPerson.orElse(null));

        // Check if any person's age is greater than 30
        boolean anyMatch = persons.stream()
                .anyMatch(person -> person.getAge() > 30);
        System.out.println("Any Match: " + anyMatch);

        // Combine filtering, mapping, and sorting
        List<String> namesStartingWithA = persons.stream()
                .filter(person -> person.getName().startsWith("A"))
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + namesStartingWithA);

        // Distinct names
        List<String> distinctNames = persons.stream()
                .map(Person::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Names: " + distinctNames);

        // Limit to first 2 persons
        List<Person> limitedPersons = persons.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Limited Persons: " + limitedPersons);

        // Skip first 2 persons
        List<Person> skippedPersons = persons.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("Skipped Persons: " + skippedPersons);

        // Minimum age
        Optional<Person> minAgePerson = persons.stream()
                .min((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("Minimum Age Person: " + minAgePerson.orElse(null));

        // Maximum age
        Optional<Person> maxAgePerson = persons.stream()
                .max((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("Maximum Age Person: " + maxAgePerson.orElse(null));

        // Reduce ages to get the sum
        int sumOfAges = persons.stream()
                .mapToInt(Person::getAge)
                .reduce(0, Integer::sum);
        System.out.println("Sum of Ages: " + sumOfAges);

        // Count of distinct names
        long distinctNameCount = persons.stream()
                .map(Person::getName)
                .distinct()
                .count();
        System.out.println("Distinct Name Count: " + distinctNameCount);

        // Check if all persons are older than 20
        boolean allMatch = persons.stream()
                .allMatch(person -> person.getAge() > 20);
        System.out.println("All Match: " + allMatch);
        
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> streamFromCollection = numbers.stream();
        
        String[] names = {"Alice", "Bob", "Charlie"};
        Stream<String> streamFromArray = Arrays.stream(names);
        Stream<String> streamUsingOf = Stream.of("Apple", "Banana", "Orange");
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1).limit(5);
        Stream<Double> infiniteStreamUsingGenerate = Stream.generate(Math::random);
        IntStream streamFromRange = IntStream.range(1, 10);
        String input = "Hello, World! How are you?";
        Pattern pattern = Pattern.compile("\\W");
        Stream<String> streamFromPattern = pattern.splitAsStream(input);
        Path filePath = Paths.get("file.txt");
        Stream<String> streamFromFile = Files.lines(filePath);
    }
}