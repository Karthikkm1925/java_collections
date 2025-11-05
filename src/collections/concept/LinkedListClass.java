package collections.concept;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

    public static void main(String[] args) {

        LinkedList<String> linkedList1 = new LinkedList<>();

        System.out.println("\nCheck if any elements are present:\n" +
                (linkedList1.isEmpty() ? "Yes, Empty" : "Not Empty"));

        linkedList1.add("First");
        linkedList1.add("Second");
        linkedList1.add("Third");

        System.out.println("\nInitially added elements:\n" + linkedList1);

        System.out.println("Now checking if the list is empty:\n" +
                (linkedList1.isEmpty() ? "Yes, Empty" : "Elements present"));

        System.out.println("First element: " + linkedList1.getFirst());
        System.out.println("Second element: " + linkedList1.getLast());

        List<String> linkedList2 = Arrays.asList("one", "two", "three");
        linkedList1.addAll(linkedList2);

        System.out.println("Check if list2 elements are added to list1:\n" +
                (linkedList1.containsAll(linkedList2) ? "Yes, added" : "No, not yet added"));

        System.out.println("\nAdded these to existing linkedList1:\n" + linkedList2);
        System.out.println("\nNow linkedList1 contains:\n" + linkedList1);

        System.out.println("\nFirst element in list1:\n" + linkedList1.getFirst());
        System.out.println("\nLast element in list1:\n" + linkedList1.getFirst());
        System.out.println("\nMiddle element in list1:\n" + linkedList1.get(linkedList1.size() / 2));

        linkedList1.addFirst("First number");
        linkedList1.addLast("Last number");

        System.out.println("\nAfter adding elements at first and last:\n" + linkedList1);

        List<String> insertList = Arrays.asList("A", "B", "C", "D", "E");
        linkedList1.addAll(linkedList1.size() / 2, insertList);

        System.out.println("\nAfter inserting a set of elements in the middle:\n" + linkedList1);

        linkedList1.add((linkedList1.size() / 2) / 2, "Quarter");
        System.out.println("\nAfter adding 'Quarter' at the first half middle position:\n" + linkedList1);
        System.out.println("\nMiddle element index in final list:\n" + linkedList1.size() / 2);

        linkedList2.set(linkedList2.size() - 1, "Mazaa");
        System.out.println("\nUpdated list2:\n" + linkedList2);
        System.out.println("Position of 'Mazaa' in list1: " + linkedList1.indexOf("Mazaa"));
        System.out.println("Let's add 'Mazaa' multiple times:");

        System.out.println("Last occurrence of 'Mazaa' in list1:\n" + linkedList1.lastIndexOf("Mazaa"));

        System.out.println("\nIterating through list1:\n");
        for (String element : linkedList1) {
            System.out.print(element + " ");
        }

        System.out.println("\n\nChecking first occurrence of 'Mazaa':\n");
        System.out.println("\nRemoving first and last elements from list1:\n");

        linkedList1.removeFirst();
        linkedList1.removeLast();

        System.out.println("Removing elements of list2 from list1: " + linkedList1.removeAll(linkedList2));
        System.out.println("Final list size and elements:\n" + linkedList1);
    }
}
