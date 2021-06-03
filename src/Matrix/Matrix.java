package Matrix;

import java.util.Random;

public class Matrix {

    int x;
    int y;

    int[][] matrix;

    Matrix (int x, int y) {
        this.x = x;
        this.y = y;
        matrix = new int[x][y];
        Random rand = new Random();

        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                matrix[i][j] = rand.nextInt(11);
            }
        }
    }

    public void showMatrix () {
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // у Matrix есть параметры х и у - они же длина/ширина, отталкиваться от них, а не от .length
    public int[][] sumMatrices (int matrix2[][]) {

        int temp[][] = new int[1][1];

        if ((matrix.length > matrix2.length) && (matrix[0].length < matrix2[0].length)) {

            temp = new int[matrix2.length][matrix[0].length];

            for (int i=0; i<matrix2.length; i++) {
                for (int j=0; j<matrix[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

        } else if ((matrix.length < matrix2.length) && (matrix[0].length > matrix2[0].length)) {

            temp = new int[matrix.length][matrix2[0].length];

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix2[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

        } else if ((matrix.length == matrix2.length) && (matrix[0].length < matrix2[0].length)) {

            temp = new int[matrix.length][matrix[0].length];

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

        } else if ((matrix.length == matrix2.length) && (matrix[0].length > matrix2[0].length)) {

            temp = new int[matrix.length][matrix2[0].length];

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix2[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

        } else if ((matrix.length == matrix2.length) && (matrix[0].length == matrix2[0].length)) {

            temp = new int[matrix.length][matrix[0].length];

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }
        } return temp;
    }
}
