import java.util.Stack;

public class LabStack02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> track = new Stack<Integer>();
		
		for (int i = 1 ; i <= 5;i++) {
			 System.out.println("Push in track : "+ track.push(i));
		}
		System.out.println("Train car after into dead-end track : " + track);

        System.out.println();
        while (!track.empty()) {
            System.out.println("Pop from track : "+ track.pop());
        }
        System.out.println("Train car after out of dead-end track : " + track);
	}

}
