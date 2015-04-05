package helpers;

public class MatrixHelper {
  public static int[][] genMatrix(int rows, int columns){
    int[][] matrix = new int[rows][columns];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) (Math.random() * 10);
      }
    }
    return matrix;
  }

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] rotate(int[][] matrix, int angle){
    int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
    if(angle == 90) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
        }
      }
    }
    return rotatedMatrix;
  }

}
