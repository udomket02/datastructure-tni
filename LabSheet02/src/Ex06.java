
public class Ex06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayController nums = new ArrayController();
		nums.display("All elements : ");
		
		int[] new_num = new int[nums.getSize()-1];
		int delete_index = 2;
		
		for (int i=0; i<delete_index; i++) {
			new_num[i] = nums.getNums()[i];
		}
		for (int i=delete_index+1; i<nums.getSize(); i++) {
			new_num[i-1] = nums.getNums()[i];
		}
		nums.setNums(new_num);
		nums.display("\n\nafter delete number : ");
	}

}
