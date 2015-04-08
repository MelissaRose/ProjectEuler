import java.util.Arrays;


public class MyObject {

	public int[] myFunction(int testInput) {
		int[] myOutcome = {};
		for (int i = 1; i < testInput; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				myOutcome = addElement(myOutcome, i);
				
				
			}
		}
		return myOutcome;
	}
	static int[] addElement(int[] a, int e) {
	    a  = Arrays.copyOf(a, a.length + 1);
	    a[a.length - 1] = e;
	    return a;
	}
	public int mySumFunction(int testInput) {
		int myOutcome = 0;
		int[] matches = myFunction(testInput);
		for( int i : matches) {
		    myOutcome += i;
		}
		return myOutcome;
	}
}
	
