package arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class NextHighestInteger {
	
	public static void main(String[] args) {
		
		int input = 3784;
		int res = findNextHighestint(input);
		System.out.println("Next highest Integer is : "+res);
		
	}

	/**
	 * @param input
	 * @return nextHighestInt
	 */
	private static int findNextHighestint(int input) {
		int reverseint = 0;
		String instr = String.valueOf(input);
		for(int i = instr.length()-1; i>=0; i--){
			int last1 = Integer.parseInt(instr.substring(i, i+1));
			int last2 = Integer.parseInt(instr.substring(i-1, i));
			
			if(last1 > last2){
//				int res2 = swap(last1, last2, input);
				break;
			}
		}
		
		return 0;
	}

}
