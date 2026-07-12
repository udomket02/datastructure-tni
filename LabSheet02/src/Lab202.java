import java.util.ArrayList;

public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		for (int i = 0; i<initial_numbers.length; i++) {
			numbers.add(initial_numbers[i]);
			
		}
		
		numbers.add(27);
		
		//2513510103
		int The_last_number = 3;
		numbers.add(The_last_number,25135101);
		
		int The_second_to_last_digit = 0;
		numbers.remove(The_second_to_last_digit);
		
		int The_third_to_last_digit = 1;
		int Date_study = 10;
		numbers.add(The_third_to_last_digit,Date_study);
		System.out.print("All numbers = " + numbers);
		
		
		
		
		
		
		
		
		
		
		    

	}

}
