package week3.day1;

import helpers.MatrixHelper;

public class Matrix {
  public static void main(String[] args) {
    int[][] matrix = new int[2][3];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("~~~~~~~~~~");
    int[][] mat2 = MatrixHelper.genMatrix(3,3);
    MatrixHelper.printMatrix(mat2);
    System.out.println("rotated");

    mat2 = MatrixHelper.rotate(mat2, 90);
//    MatrixHelper.printMatrix(MatrixHelper.rotate(mat2, 90));
    System.out.println("after rotate");
    MatrixHelper.printMatrix(mat2);
  }
}
