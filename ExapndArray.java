package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class ExapndArray {
	
	static List<Character> list = new ArrayList<Character>();

	public static void main(String[] args) {
		char[] charArray = "a3b1c1d1e4f0g4".toCharArray();
		exapndArray(charArray);
	}

	/**
	 * @param charArray
	 */
	private static void exapndArray(char[] charArray) {
		for(int i=0; i< charArray.length; i=i+2){
			char ch = charArray[i];
			int dig = charArray[i+1];
			expandArray(ch, dig);
		}
		
		Character[] result = (Character[]) list.toArray();
		
		for(int k=0; k< result.length; k++){
			System.out.print(result[k]);
		}
		
	}

	/**
	 * @param ch
	 * @param i
	 */
	private static void expandArray(char ch, int dig) {
		
		if(dig > 0){
			for( int j=0; j< dig; j++){
				list.add(ch);
			}
		}
	}
}
