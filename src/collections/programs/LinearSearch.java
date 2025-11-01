package collections.programs;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
 
		        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		        int target = 30;
		        boolean found = false;

		        for (int i = 0; i < list.size(); i++) {
		            if (list.get(i) == target) {
		                System.out.println("Element found at index: " + i);
		                found = true;
		                break;
		            } 
		            }

		        if (!found) {
		           System.out.println("Element not found.");
		        }
		    }
		}

