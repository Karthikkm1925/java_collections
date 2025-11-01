package collections.programs;

import java.util.*;

public class MergedList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(34, 7, 23);
        List<Integer> list2 = Arrays.asList(4, 16, 18);
        
        List<Integer> l = new ArrayList<>();
        l.addAll(list1);
        l.addAll(list2);
        
        Collections.sort(l);
        System.out.println("Sorted Merged List: " + l);


	}

}
