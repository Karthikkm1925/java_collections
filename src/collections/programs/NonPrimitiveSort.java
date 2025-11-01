package collections.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonPrimitiveSort {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>(Arrays.asList("Grapefruit","Rambutan","Peach","Pear","Avacado","Blueberry","Strawberry"));
		
		for(int i = 0; i<l.size();i++) {
			for(int j=0;j<l.size()-1-i;j++) {
			 
			if(l.get(j).compareTo(l.get(j+1))>0) {
				String temp = l.get(j);
				l.set(j, l.get(j + 1));
				l.set(j + 1, temp);	 
			}
		}
		}
		for(String s:l) {
			System.out.print(s+",");
		}

	}
}
