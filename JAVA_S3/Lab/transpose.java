\\ Arpitha Bhandary
\\ Cs(AI)
\\ 16
package n_no;
import java.util.*;
// to find the transpose of a matrix
public class trans_mat {
 
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the number of rows of the matrix: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter the number of columns of the matrix: ");
	        int cols = sc.nextInt();
	        int[][] matrix = new int[rows][cols];
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        int[][] transpose = new int[cols][rows];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transpose[j][i] = matrix[i][j];
	            }
	        }
	        System.out.println("The transpose of the matrix is:");
	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                System.out.print(transpose[i][j] + " ");
	            }
	            System.out.println();
	        }
	    
	}
}



