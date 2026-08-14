package lab;

import java.util.ArrayList;

public class ListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> original = new ArrayList<Integer>();
		for (int i = 11; i <= 20; i++) {
			original.add(i);
		}

		System.out.println("Original Sequnce: " + original);

		ArrayList<Integer> reversed = reverseList(original);
		System.out.println("Reverse Sequnce: " + reversed);
	}

	public static ArrayList<Integer> reverseList(ArrayList<Integer> original) {
		ArrayList<Integer> reverseList = new ArrayList<Integer>();

		for (int i = original.size()-1; i >= 0; i--) {
			reverseList.add(original.get(i));

		}
		return reverseList;

	}
}
