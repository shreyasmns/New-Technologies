package arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class MxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		int[] array = { 4, 3, -5, 0, 6, -8, 12, 3, -9, 2, 5, 8, 4, 8};
		int[] array = {4,-4, 8};
		maxSumSubArray(array);
	}

	/**
	 * @param array
	 */
	private static void maxSumSubArray(int[] array) {
		
		int maxSum=0, sum=0, start=0, end=0;
		
		for(int i=0; i< array.length; i++){
			sum += array[i];
			
			if(maxSum < sum){
				maxSum = sum;
				end = i;
			}
			if(sum <= 0){
				sum =0 ;
				start = i+1;
			}
		}
		System.out.println("Maximum Sub Sum : "+maxSum);
		System.out.println("Min-Max indices : "+start + " - "+end);
	}
}
