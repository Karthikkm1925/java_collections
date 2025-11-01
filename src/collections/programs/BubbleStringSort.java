package collections.programs;

import java.util.Arrays;

public class BubbleStringSort {

	public static void main(String[] args) {
		String[] str = {"Grapefruit","Rambutan","Peach","Pear","Avacado","Blueberry","Strawberry"};
		
		for(int i = 0; i<str.length;i++) {
			for(int j=0;j<str.length-1-i;j++) {
			
			if(str[j].compareTo(str[j+1])>0) {
				String temp = str[j];
				str[j]=str[j+1];
				str[j+1]=temp;
			}
			
		}
		}
		System.out.println(Arrays.toString(str));

	}

}

