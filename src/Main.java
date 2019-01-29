import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input.txt");
        Scanner readFile = new Scanner(input);

        PrintWriter writer = new PrintWriter("output.txt");

        final int TESTS = readFile.nextInt();
        System.out.println(TESTS);
        int[][] result = new int[30][30];

        int columnA, rowA, columnB, rowB, queries;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= TESTS; i++) {
            /* Creat matrix A */
            int[][] A = getArray(readFile);
            // Matrix A content
            getInput(A, readFile);

            /* Creat matrix B */
            int[][] B = getArray(readFile);
            // Matrix B content
            getInput(B, readFile);

            // No. of operations must be done
            queries = readFile.nextInt();

            // Operations
            for (int j = 0; j < queries; j++) {
                String operation = sb.append(readFile.nextLine()).toString();
                writer.printf("Case #%d: \n %s\n", TESTS, operation);
                result = doOperation(operation, A, B);
                writer.print(printArray(result));
            }

            sb.delete(0, sb.capacity());

            zero(result);

        }
        writer.close();
    }

    private static void getInput(int[][] list, Scanner input){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = input.nextInt();
            }
        }
    }

    private static int[][] getArray(Scanner input){
        int column = input.nextInt();
        int row = input.nextInt();
        int[][] result = new int[column][row];
        return result;
    }

    private static int[][] doOperation(String operation, int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];

        switch (operation) {
            case "SUM A B":
                result = Operations.sum(A, B);
                break;
            case "SUBT A B":
                result = Operations.subt(A, B);
                break;
            case "SUBT B A":
                result = Operations.subt(B, A);
                break;
            case "MUL A B":
                result = Operations.mul(A, B);
                break;
            case "Transpose A":
                result = Operations.transpose(A);
                break;
            case "Transpose B":
                result = Operations.transpose(B);
                break;
            case "Det A":
                result = Operations.det(A);
                break;
            case "Det B":
                result = Operations.det(B);
                break;
            default:
                System.out.println("Invalid operation!");
        }
        return result;
    }

    private static void zero(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = 0;
            }
        }
    }


    private static String printArray(int[][] list) {
        StringBuilder sb = new StringBuilder();
        outer:
        for (int[] aList : list) {
            for (int anAList : aList) {
                if ((anAList == 0) && (aList[0] == 0)) {
                    continue outer;
                } else if (anAList == 0) {
                    sb.append("\n");
                    continue outer;
                }
                sb.append(anAList).append(" ");
            }
        }
        return (sb.toString());
    }

    private static String print_Array(int[][] list) {
        StringBuilder sb = new StringBuilder();

        for (int[] aList : list) {
            for (int anAList : aList) {
                sb.append(anAList).append(" ");
            }
            sb.append("\n");
        }
        return (sb.toString());
    }

}