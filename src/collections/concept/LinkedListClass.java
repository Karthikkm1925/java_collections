package collections.concept;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist1 = new LinkedList<String>();
		
		System.out.println("\nCheck is there any Elements present : \n"+
					(linkedlist1.isEmpty() ? "Yes Empty":"Not Empty"));
		linkedlist1.add("First");
		linkedlist1.add("Second");
		linkedlist1.add("Third");
		
		System.out.println("\nFirst added these elements :\n"+linkedlist1);
		
		System.out.println("Now checking list is empty or not :\n"+
				(linkedlist1.isEmpty() ? "Yes Empty":"Elements present"));
		
		System.out.println("First Element is : "+linkedlist1.getFirst());
		System.out.println("second Element is : "+linkedlist1.getLast());

		List<String> linkedList2 = Arrays.asList("one","two","three");
		linkedlist1.addAll(linkedList2);
		System.out.println("Ckeck list2 is present in list1 or not:\n"+
		(linkedlist1.containsAll(linkedList2) ? "Yes added":"No not yet added"));
		System.out.println("\nLater added these to exsting linkedlist1 : \n"+linkedList2);
		System.out.println("\nTotally now in linkedlist1 we have : \n"+linkedlist1);
		
		System.out.println("\nFirst element in list1 is :\n"+linkedlist1.getFirst());
		System.out.println("\nLast element in list1 is :\n"+linkedlist1.getFirst());
		System.out.println("\nMiddle element in list1 is :\n"+linkedlist1.get(linkedlist1.size()/2));
		linkedlist1.addLast("Last number");
		linkedlist1.addFirst("First number ");
		
		System.out.println("\nAfter adding at something at first and last now list1 is: "+linkedlist1);
		List<String> inserlist = Arrays.asList("A","B","C","D","E");
		linkedlist1.addAll(linkedlist1.size()/2, inserlist);
		System.out.println("\nAfter insrting set of elements at middle :\n "+linkedlist1);
		linkedlist1.add((linkedlist1.size()/2)/2,"Quarter");
		System.out.println("\nAfter adding 'Quarter' at first half middle position:\n"+linkedlist1);
		System.out.println("\nMiddle element infinal list :\n"+linkedlist1.size()/2);
		
		System.out.println("\nLet's set Last element as 'Mazaa' in list2 :\n"+
								linkedList2.set(linkedList2.size()-1,"Mazaa"));
		
		System.out.println("list2 :\n"+linkedList2);
		System.out.println("Position of 'Mazaa' in list1"+linkedlist1.indexOf("Mazaa"));
		System.out.println("Let's add 'Mazaa' multiple times :");
 
		
 		System.out.println("Last occrance of 'Mazaa' in list1 is :\n"+linkedlist1.lastIndexOf("Mazaa"));
		System.out.println("\nLet's Loop over list1\n");
		for (String elements : linkedlist1) {
			System.out.print(elements+" ");
		}
		System.out.println("will check first occerance of 'Mazaa' :\n");
		System.out.println("\nLet's remove first and last element in list1 :\n");
		linkedlist1.removeLast();linkedlist1.removeFirst();
		System.out.println("let's remove list2 :"+linkedlist1.removeAll(linkedList2));
		System.out.println("Size of final list :\n"+linkedlist1);
 		
	}

}
