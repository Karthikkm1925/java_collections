package collections.programs;
import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		 
		        List<Integer> list = Arrays.asList(23, 45, 12, 67, 34, 89);
		        
		        int max = list.get(0);
		        int min = list.get(0);

		        for (int i = 1; i < list.size(); i++) {
		            int num = list.get(i);
		            if (num > max) {
		                max = num;
		            }
		            if (num < min) {
		                min = num;
		            }
		        }

		        System.out.println("Max: " + max);
		        System.out.println("Min: " + min);
		    }
		

	}


