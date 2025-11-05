package collections.concept.employeelinkedlistdemo;

import java.util.*;

public class EmployeeLinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> employees = new LinkedList<>();

        employees.add("Arjun");
        employees.add("Bhavana");
        employees.add("Chirag");
        employees.add("Deepa");
        employees.add("Eshwar");
        employees.add("Farhan");

        System.out.println("Initial Employee List:\n" + employees);

        employees.addFirst("Aditi");
        employees.addLast("Gaurav");
        System.out.println("\nAfter adding first and last:\n" + employees);

        List<String> newEmployees = Arrays.asList("Hari", "Indra", "Jaya");
        employees.addAll(4, newEmployees);
        System.out.println("\nAfter inserting new employees at index 4:\n" + employees);

        System.out.println("\nContains 'Chirag'? " + employees.contains("Chirag"));
        System.out.println("Contains all new employees? " + employees.containsAll(newEmployees));

        employees.remove("Bhavana");
        employees.removeFirst();
        employees.removeLast();
        System.out.println("\nAfter removing some employees:\n" + employees);

        List<String> interns = Arrays.asList("Karan", "Leela", "Maya");
        employees.addAll(interns);
        System.out.println("\nAfter adding interns:\n" + employees);

        employees.removeAll(interns);
        System.out.println("\nAfter removing interns:\n" + employees);

        employees.retainAll(Arrays.asList("Chirag", "Deepa", "Eshwar"));
        System.out.println("\nAfter retaining selected employees:\n" + employees);

        employees.addAll(Arrays.asList("Neha", "Omkar", "Pooja", "Quincy", "Ravi"));
        System.out.println("\nUpdated Employee List:\n" + employees);

        System.out.println("\nFirst Employee: " + employees.getFirst());
        System.out.println("Last Employee: " + employees.getLast());
        System.out.println("Employee at index 3: " + employees.get(3));

        employees.set(2, "Chandana");
        System.out.println("\nAfter updating index 2:\n" + employees);

        System.out.println("\nIndex of Deepa: " + employees.indexOf("Deepa"));
        System.out.println("Last index of Deepa: " + employees.lastIndexOf("Deepa"));

        employees.offer("Sahana");
        employees.offerFirst("Tara");
        employees.offerLast("Uday");
        System.out.println("\nAfter offering elements:\n" + employees);

        System.out.println("\nPeek First: " + employees.peekFirst());
        System.out.println("Peek Last: " + employees.peekLast());

        System.out.println("\nPoll First: " + employees.pollFirst());
        System.out.println("Poll Last: " + employees.pollLast());
        System.out.println("\nAfter polling:\n" + employees);

        employees.push("Varun");
        employees.push("Waseem");
        System.out.println("\nAfter pushing elements:\n" + employees);

        System.out.println("\nPopped element: " + employees.pop());
        System.out.println("\nAfter pop:\n" + employees);

        Iterator<String> iterator = employees.iterator();
        System.out.println("\nIterating through employees:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n\nSize: " + employees.size());
        System.out.println("Is Empty? " + employees.isEmpty());
        System.out.println("HashCode: " + employees.hashCode());

        employees.removeIf(e -> e.startsWith("D"));
        System.out.println("\nAfter removing names starting with D:\n" + employees);

        Object[] empArray = employees.toArray();
        System.out.println("\nConverted to Array: " + Arrays.toString(empArray));

        LinkedList<String> copyList = new LinkedList<>(employees);
        System.out.println("\nCopied List:\n" + copyList);

        System.out.println("\nLists are equal? " + employees.equals(copyList));

        System.out.println("\nFinal Stream Output:");
        employees.stream().forEach(System.out::println);

        employees.clear();
        System.out.println("\nAfter clearing all employees:\n" + employees);
    }
}

