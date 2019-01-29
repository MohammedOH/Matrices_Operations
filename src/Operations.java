class Operations {
    static int[][] transpose(int[][] list) {
        int[][] result = new int[30][30];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                result[j][i] = list[i][j];
            }
        }
        return result;
    }

    static int[][] sum(int[][] A, int[][] B) {
        int[][] result = new int[30][30];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    static int[][] subt(int[][] A, int[][] B) {
        int[][] result = new int[30][30];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    static int[][] det(int[][] list) {
        int[][] result = new int[30][30];

        return result;
    }

    static int[][] mul(int[][] A, int[][] B) {
        int[][] result = new int[30][30];

        return result;
    }

}