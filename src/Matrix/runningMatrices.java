package Matrix;

public class runningMatrices {

    public static void main(String[] args) {

        Matrix m1 = new Matrix(3, 2);

        Matrix m2 = new Matrix(3, 2);

        m1.showMatrix();

        m2.showMatrix();

        m1.matrix = m1.sumMatrices(m2.matrix);

        m1.showMatrix();
    }
}