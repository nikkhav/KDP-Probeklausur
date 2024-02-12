public class MatrixAddition {
    public class DimensionsFehler extends Exception {
        public DimensionsFehler (String message) {
            super(message);
        }
    }
    public double[][] matAdd (double[][] m1, double[] [] m2) {
        if(m1.length != m2.length || m1[0].length != m2[0].length){
            return null;
        }

        double[][] res = new double[m1.length][m1[0].length];

        for(int i = 0; i < m1.length; i++) {
            for(int j = 0; j < m1[0].length; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return res;
    }

    public double[][] matAddAusnahme (double[][] m1, double[][] m2) throws DimensionsFehler {
        double[][] res = matAdd(m1,m2);
        if(res == null) {
            throw new DimensionsFehler("Dimensionen verschieden");
        } else {
            return res;
        }
    }
}
