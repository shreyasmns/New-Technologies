package arrays;

import java.util.Arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class LeastDiffArray {

	public static void main(String[] args) {
		int[] array = {64, 1, 5004, 7676, 464, 32, 8888, 99999};
		Arrays.sort(array);
		
		int mindiff = Integer.MAX_VALUE;
		
		for(int i=0; i< array.length-1; i++){
			int diff = Math.abs(array[i] - array[i+1]);
			if(diff < mindiff){
				mindiff = diff;
			}
		}
		
		System.out.println("Minimum Difference between any two elemnets : "+mindiff);
	}

}
