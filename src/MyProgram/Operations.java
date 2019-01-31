package MyProgram;

public class Operations {
    public static int[][] transpose(int[][] list) {
        int[][] result = new int[30][30];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                result[j][i] = list[i][j];
            }
        }
        return result;
    }

    public static int[][] sum(int[][] A, int[][] B) {
        int[][] result = new int[30][30];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subt(int[][] A, int[][] B) {
        int[][] result = new int[30][30];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static int det(int[][] list) {
        int temp[][];
        int result = 0;
        // Base case
        if (list.length == 1) {
            result = list[0][0];
            return (result);
        }
        // Base case
        if (list.length == 2) {
            result = ((list[0][0] * list[1][1]) - (list[0][1] * list[1][0]));
            return (result);
        }
        // Case Matrix dimension is larger than 2
        for (int i = 0; i < list[0].length; i++) {
            temp = new int[list.length - 1][list[0].length - 1];
            for (int j = 1; j < list.length; j++) {
                for (int k = 0; k < list[0].length; k++) {
                    if (k < i) {
                        temp[j - 1][k] = list[j][k];
                    } else if (k > i) {
                        temp[j - 1][k - 1] = list[j][k];
                    }
                }
            }
            result += list[0][i] * Math.pow (-1, i) * det (temp);
        }
        return result;
    }

    public static int[][] mul(int[][] A, int[][] B) {
        int[][] result = new int[30][30];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
}