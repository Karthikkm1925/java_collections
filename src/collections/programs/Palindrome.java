package collections.programs;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
        boolean isPalindrome = true;

        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is not a palindrome.");
        }

	}

}
