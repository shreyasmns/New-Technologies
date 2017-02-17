package arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class Casting {

	public static void main(String[] args) {
		
		//Implicit casting (widening conversion) :
		
		int i = 2; // 4 bytes
		double d = i;
		
		// Explicit casting: (narrowing)
		double d2 = 2.0;
		int i2 = (int) d2;
		
		System.gc();
	}

}
