package collections.concept.employeelinkedlistdemo;

import java.util.*;

public class EmployeeLinkedListDemo {

    public static void main(String[] args) {

        // Create a LinkedList to store employee names
        LinkedList<String> employees = new LinkedList<>();

        // Add employees to the list
        employees.add("Arjun");
        employees.add("Bhavana");
        employees.add("Chirag");
        employees.add("Deepa");
        employees.add("Eshwar");
        employees.add("Farhan");

        System.out.println("Initial Employee List:\n" + employees);

        // Add an element at the beginning and end
        employees.addFirst("Aditi");
        employees.addLast("Gaurav");
        System.out.println("\nAfter adding first and last:\n" + employees);

        // Create another list and insert it into the middle of the main list
        List<String> newEmployees = Arrays.asList("Hari", "Indra", "Jaya");
        employees.addAll(4, newEmployees);
        System.out.println("\nAfter inserting new employees at index 4:\n" + employees);

        // Check if specific elements or collections exist in the list
        System.out.println("\nContains 'Chirag'? " + employees.contains("Chirag"));
        System.out.println("Contains all new employees? " + employees.containsAll(newEmployees));

        // Remove specific elements from the list
        employees.remove("Bhavana");
        employees.removeFirst(); // removes first element
        employees.removeLast();  // removes last element
        System.out.println("\nAfter removing some employees:\n" + employees);

        // Add a list of interns
        List<String> interns = Arrays.asList("Karan", "Leela", "Maya");
        employees.addAll(interns);
        System.out.println("\nAfter adding interns:\n" + employees);

        // Remove all interns
        employees.removeAll(interns);
        System.out.println("\nAfter removing interns:\n" + employees);

        // Retain only selected employees (others will be removed)
        employees.retainAll(Arrays.asList("Chirag", "Deepa", "Eshwar"));
        System.out.println("\nAfter retaining selected employees:\n" + employees);

        // Add more employees to the list
        employees.addAll(Arrays.asList("Neha", "Omkar", "Pooja", "Quincy", "Ravi"));
        System.out.println("\nUpdated Employee List:\n" + employees);

        // Access specific elements using get()
        System.out.println("\nFirst Employee: " + employees.getFirst());
        System.out.println("Last Employee: " + employees.getLast());
        System.out.println("Employee at index 3: " + employees.get(3));

        // Update element at a specific index using set()
        employees.set(2, "Chandana");
        System.out.println("\nAfter updating index 2:\n" + employees);

        // Find position (index) of elements
        System.out.println("\nIndex of Deepa: " + employees.indexOf("Deepa"));
        System.out.println("Last index of Deepa: " + employees.lastIndexOf("Deepa"));

        // Offer methods add elements at ends — queue-style operations
        employees.offer("Sahana");       // adds at end
        employees.offerFirst("Tara");    // adds at beginning
        employees.offerLast("Uday");     // adds at end
        System.out.println("\nAfter offering elements:\n" + employees);

        // Peek methods — retrieve elements without removing them
        System.out.println("\nPeek First: " + employees.peekFirst());
        System.out.println("Peek Last: " + employees.peekLast());

        // Poll methods — retrieve and remove elements
        System.out.println("\nPoll First: " + employees.pollFirst());
        System.out.println("Poll Last: " + employees.pollLast());
        System.out.println("\nAfter polling:\n" + employees);

        // Push and Pop — Stack-style operations
        employees.push("Varun"); // adds at head
        employees.push("Waseem");
        System.out.println("\nAfter pushing elements:\n" + employees);

        System.out.println("\nPopped element: " + employees.pop()); // removes from head
        System.out.println("\nAfter pop:\n" + employees);

        // Iterate through the list using an iterator
        Iterator<String> iterator = employees.iterator();
        System.out.println("\nIterating through employees:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Display list size and status
        System.out.println("\n\nSize: " + employees.size());
        System.out.println("Is Empty? " + employees.isEmpty());
        System.out.println("HashCode: " + employees.hashCode());

        // Remove elements conditionally using removeIf (Lambda Expression)
        employees.removeIf(e -> e.startsWith("D"));
        System.out.println("\nAfter removing names starting with D:\n" + employees);

        // Convert list to an array
        Object[] empArray = employees.toArray();
        System.out.println("\nConverted to Array: " + Arrays.toString(empArray));

        // Create a copy of the list
        LinkedList<String> copyList = new LinkedList<>(employees);
        System.out.println("\nCopied List:\n" + copyList);

        // Check if two lists are equal
        System.out.println("\nLists are equal? " + employees.equals(copyList));

        // Stream API — process and print each element
        System.out.println("\nFinal Stream Output:");
        employees.stream().forEach(System.out::println);

        // Clear all elements from the list
        employees.clear();
        System.out.println("\nAfter clearing all employees:\n" + employees);
    }
}

