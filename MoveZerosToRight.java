package arrays;

import java.util.Arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class MoveZerosToRight {

	public static void main(String[] args) {
		
		int[] array = {0,5,0,2,4,0,0,64,56,88,0,89,444,0,48};
		System.out.println("Input Array : "+Arrays.toString(array));
		
		// Now push zeros to the end
		moveZerostoTheRight(array);
		System.out.println("Doctored Array : "+Arrays.toString(array));
	}

	/**
	 * @param array
	 */
	private static void moveZerostoTheRight(int[] array) {
		int start = 0;
		int end = array.length-1;
		
		while(start < end){
			
			if(array[start] ==0 && array[end] != 0){
				int temp = array[start];
				array[start] = array[end];
				array[end] = temp;
			}
			else{
				if(array[start] != 0 ) start++;
				if(array[end] == 0 ) end--;
			}
		}	
	}
}
