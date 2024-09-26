/*Question 3 : Write a program to Find Transpose of a Matrix.
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
Matrix
a11 a12 a13
a21 a22 a23
Transposed Matrix
a11 a21
a12 a22
a13 a23 */

public class pract3 {

    public static void printMatrix(int matrix[][]){
        System.out.println("the matrix is:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row=2, column=3;
        int matrix[][]={{2,3,7},{4,6,7}};

        //display original matrix
        printMatrix(matrix);

        //transpose of matrix
        int transpose[][]=new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
              transpose[j][i]=matrix[i][j];
            }
        }
        //print transpose matrix
        printMatrix(transpose);
    }

}
   
