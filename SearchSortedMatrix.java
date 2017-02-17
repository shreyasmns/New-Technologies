package arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class SearchSortedMatrix {

	public static void main(String[] args) {
		
		int[][] matrix ={ { 5, 7, 8, 9 }, { 6, 9, 11, 13 }, { 7, 11, 12, 14 }, { 8, 13, 16, 17 } };
		System.out.println("Contains element ? : "+searchMatrix(matrix, 14));
		
	}

	/**
	 * @param i
	 * @return
	 */
	private static boolean searchMatrix(int[][] matrix, int i) {
		
		int row = matrix.length;
		int col = matrix[0].length;
		
		int currentRow = 0;
		int currentCol = col-1;
		
		while(currentRow != row && currentCol != -1){
			if(matrix[currentRow][currentCol] == i)
				return true;
			else if(matrix[currentRow][currentCol] > i)
				currentCol--;
			else
				currentRow++;
		}
		return false;		
	}
}
