public class Lab203 {

	public static void main(String[] args) {
		String[] subjects = {"ITE-201", "BIS-112", "DAT-201", "JPN-201", "ENL-211"};
		displayArray("Original", subjects);
		System.out.println();
		String new_subject = "SOC-111";
		subjects = addArraySize(subjects);
		subjects[subjects.length-1] = new_subject;
		displayArray("Already apended element", subjects);
		System.out.println();
		int delete_index1 = 3;
		subjects = deleteElement(delete_index1, subjects);
		displayArray("Already deleted index " + delete_index1, subjects);
		System.out.println();
		int delete_index2 = 0;
		subjects = deleteElement(delete_index2, subjects);
		displayArray("Already deleted index " + delete_index2, subjects);
		System.out.println();
		int delete_index3 = subjects.length-1;
		subjects = deleteElement(delete_index3, subjects);
		displayArray("Already deleted last index", subjects);
		System.out.println();
		int index_update = 1;
		String element_update = "MTE-201";
		subjects = updateElement(index_update, element_update, subjects);
		displayArray("Already updated element", subjects);
	}
	
	public static void displayArray(String message, String[] subjects) {
		System.out.print(message + ": ");
		boolean first = true;
		for (String subject : subjects) {
		System.out.print((!first ? ", " : "") + subject);
		first = false;
	    }
    }
	
    public static String[] addArraySize(String[] subjects) {
			 // เขียนค าสั่งเพิ่มขนาดของอาร์เรย์อีก 1 ต าแหน่ง และคืนค่าอาร์เรย์ที่ได้เพิ่มขนาดเรียบร้อยแล้ว (โดยยังคงข้อมูลเดิมไว้)
        String[] new_subject = new String[subjects.length+1];
        for (int i = 0; i<subjects.length; i++) {
            new_subject[i] = subjects[i];
        }
		return new_subject;
				

	}
    public static String[] deleteElement(int index, String[] subjects) {
			 // เขียนค าสั่งลบข้อมูลในอาร์เรย์ ตามต าแหน่งที่ส่งมาให้กับพารามิเตอร์ และคืนค่าอาร์เรย์ที่มีการลบข้อมูลเรียบร้อย
		String[] new_subject = new String[subjects.length-1];
		int Delete_index = index;
		
		for (int i=0; i<Delete_index; i++) {
			new_subject[i] = subjects[i];
		}
		
		for (int i=Delete_index+1; i<subjects.length; i++) {
			new_subject[i-1] = subjects[i];
		}
	
		
		return new_subject;
	}
	public static String[] updateElement(int index, String value, String[] subjects) {
			 // เขียนค าสั่งอัปเดตข้อมูลในอาร์เรย์ตาม ต าแหน่ง และ ข้อมูล ที่ส่งมาให้กับพารามิเตอร์ และคืนค่าอาร์เรย์ที่อัปเดตเรียบร้อย
		String[] new_subject = new String[subjects.length];
		for (int i = 0; i<subjects.length; i++) {
            new_subject[i] = subjects[i];
        }
		
		new_subject[index] = value;
		return new_subject;	
		
	}
}

