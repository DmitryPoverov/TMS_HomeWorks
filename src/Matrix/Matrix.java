package Matrix;

import java.util.Random;

public class Matrix {

    int x;
    int y;
    static int count = 1;

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
        System.out.println("The constructor #" + (count++) + " has worked off");
    }

    public void showMatrix () {
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

/*    public int[][] sumMatrices (int[][] matrix2) {

        int[][] temp = new int[1][1];

        if ((matrix.length > matrix2.length) && (matrix[0].length < matrix2[0].length)) {
            System.out.println("Algorithm 1");

            temp = new int[matrix2.length][matrix[0].length];

            for (int i=0; i<matrix2.length; i++) {
                for (int j=0; j<matrix[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

        } else if ((matrix.length < matrix2.length) && (matrix[0].length > matrix2[0].length)) {
            System.out.println("Algorithm 2");

            temp = new int[matrix.length][matrix2[0].length];

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix2[0].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

        } else if ((matrix.length == matrix2.length) && (matrix[0].length < matrix2[0].length)) {
            System.out.println("Algorithm 3");

            temp = new int[matrix.length][matrix[0].length];

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

        } else if ((matrix.length == matrix2.length) && (matrix[0].length > matrix2[0].length)) {
            System.out.println("Algorithm 4");

            temp = new int[matrix.length][matrix2[0].length];

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix2[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

        } else if ((matrix.length == matrix2.length) && (matrix[0].length == matrix2[0].length)) {
            System.out.println("Algorithm 5");

            temp = new int[matrix.length][matrix[0].length];

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix[i].length; j++) {
                    temp[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }
        } return temp;
    }*/

    public int[][] sumMatrices (int[][] matrix2) {

//        int x = matrix.length<matrix2.length? matrix.length : matrix2.length;
        int x = Math.min(matrix.length, matrix2.length);

//        int y = matrix[0].length<matrix2[0].length? matrix[0].length : matrix2[0].length;
        int y = Math.min(matrix[0].length, matrix2[0].length);

        int[][] temp = new int[x][y];

        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                temp[i][j] = matrix[i][j] + matrix2[i][j];
            }
        } return temp;
    }

    public void multiplying (int num) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] *= num;
            }
        }
    }
}
