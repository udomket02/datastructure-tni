package lab;

public class Sorting {
	private int[] array;

	public Sorting(int[] array) {
		this.array = array;
	}

	public void printSortedData() {
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public void bubbleSort() {
		for (int i = 0; i < array.length; i++) {
			boolean is_swapped = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				// 5-0-1 = 4
				// s-1-1 = 3
				// 5-2-1 = 5
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					is_swapped = true;
				}
			}
			if (!is_swapped)
				break;
		}

	}

	public void selectionSort() { // O(n**2)
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}

	public void insertionSort() {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int walker_index = i - 1;
			while (walker_index >= 0 && array[walker_index] > key) {
				array[walker_index + 1] = array[walker_index];
				walker_index--;
			}
			array[walker_index + 1] = key;
		}
	}

	public int partition(int low, int high) {
		return 0;
	}

	private void quicksort() {

	}

}
