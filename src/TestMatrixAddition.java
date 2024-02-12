public class TestMatrixAddition {
    public static void main (String[] args) {
        double[][] m1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] m2 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};

        try {
            MatrixAddition MA = new MatrixAddition();
            MA.matAddAusnahme(m1, m2);
        } catch (MatrixAddition.DimensionsFehler fehler){
            System.out.println(fehler.getMessage());
        }
    }
}
