package Lab;

import java.util.Scanner;

public class binarySearch01 { // O(log2n)

	public static void main(String[] args) {
		int[] nums = sorting(new int[] { 96, 87, 18, 6, 31, 11, 56, 36, 76 });

		for (int num : nums) {
			System.out.print(num + " ");
		}

		Scanner input = new Scanner(System.in);
		System.out.print("\n\nEnter a target number: ");
		int target = input.nextInt();

		int index = binarySearch(nums, target);
		if (index != -1) {
			System.out.println("\nthe target " + target + " at index " + index);
		} else {
			System.err.println("\nCannot found " + target + " in this array");
		}

	}

	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}

	public static int binarySearch(int[] nums, int target) {
		int Low = 0;
		int high = nums.length - 1;

		while (Low <= high) {
			int middle = (Low + high) / 2;
			if (nums[middle] == target) {
				return middle;
			}
			if (target < nums[middle]) {
				high = middle - 1;
			} else {
				Low = middle + 1;
			}
		}
		return -1;
	}

}
