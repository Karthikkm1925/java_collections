package collections.studentmangementsystem;

import java.util.*;

public class StudentRegistration {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        // Add students
        students.add("Karthik");
        students.add("Aisha");
        students.add("Rahul");
        System.out.println("After add(): " + students);

        // Add multiple students
        List<String> newBatch = Arrays.asList("Priya", "Arun", "Karan");
        students.addAll(newBatch);
        System.out.println("After addAll(): " + students);

        // Check if a student exists
        System.out.println("Is 'Priya' registered? " + students.contains("Priya"));

        // Remove a student
        students.remove("Aisha");
        System.out.println("After remove('Aisha'): " + students);

        // Iterate over list
        System.out.println("\nIterating through students:");
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(" - " + it.next());
        }

        // Clear all after semester ends
        students.clear();
        System.out.println("\nAfter clear(): " + students);
        System.out.println("Is student list empty? " + students.isEmpty());
    }
}
