package collections.programs;
import java.util.*;
public class ReverseList {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

	        int n = list.size();
	        for (int i = 0; i < n /2; i++) {
	            int temp = list.get(i);
	            list.set(i, list.get(n - 1 - i));
	            list.set(n - 1 - i, temp);
	        }

	        System.out.println("Reversed List: " + list);

	}

}
