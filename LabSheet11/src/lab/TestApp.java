package lab;

public class TestApp {
	
	public static void main(String[] args) {
	
	int[] nums = {11, 9, 23, 87, 38, 22, 92, 10};
	
	System.out.print("Bubble Sort : ");
	Sorting sort1 = new Sorting(nums);
	sort1.bubbleSort();
	sort1.printSortedData();
	
	System.out.println("\n");
	int[] numss = {25, 11, 45, 6, 87, 20, 78, 64};
	
	System.out.print("Selection Sort : ");
	Sorting sort2 = new Sorting(numss);
	sort2.selectionSort();
	sort2.printSortedData();
	
	System.out.println("\n");
	int[] numsss = {68, 10, 87, 75, 14, 36, 98, 76};
	
	System.out.print("Insertion Sort : ");
	Sorting sort3 = new Sorting(numsss);
	sort3.insertionSort();
	sort3.printSortedData();
	
	}
}
