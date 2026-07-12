
public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums = {23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("Length =  "+ nums.length);
		System.out.println("the first element =  "+ nums[0]);
		System.out.println("the last element =  "+ nums[nums.length-1]);
		System.out.println("the middle element =  "+ nums[nums.length/2]);
		
		System.out.println("\nDisplay all element:");
		
		boolean first_element = true;
		for (int i=0; i<nums.length; i++) {
			
			System.out.print((!first_element ? "," : "") + nums[i]); //not (first_element == false) use (!first_element)
			first_element = false;
		};
	}

}
