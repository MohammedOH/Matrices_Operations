package JUnit_Tests;
import org.junit.*;
import java.io.*;
import java.util.Scanner;
import MyProgram.*;

public class JUnitTests {
    private static int[][] A = {
            {68, 64, 3, 9,},
            {49, 58, 29, 37},
            {32, 98, 33, 66},
            {98, 38, 44, 27}
    };
    private static int[][] B = {
            {91, 60, 28, 40},
            {21, 98, 33, 19},
            {53, 36, 5, 62},
            {37, 7, 21, 76}
    };

    Main myProgram;

    @Before
    @Test
    public void testMain() {
        myProgram = new Main();
    }

    Operations operations;

    @Before
    @Test
    public void before() {
        operations = new Operations();
    }

    /* Testing main class */
    @Test
    public void testDoOperationSum1() {
        String op = "SUM A B";
        int[][] testResultDo = operations.sum(A, B);
        int[][] resultDo = myProgram.doOperation(op, A, B);
        Assert.assertArrayEquals(testResultDo, resultDo);
    }


    @Test
    public void testDoOperationSubt1() {
        String op = "SUBT A B";
        int[][] testResultDo = operations.subt(A, B);
        int[][] resultDo = myProgram.doOperation(op, A, B);
        Assert.assertArrayEquals(testResultDo, resultDo);
    }

    @Test
    public void testDoOperationSubt2() {
        String op = "SUBT B A";
        int[][] testResultDo = operations.subt(B, A);
        int[][] resultDo = myProgram.doOperation(op, A, B);
        Assert.assertArrayEquals(testResultDo, resultDo);
    }


    @Test
    public void testDoOperationMul1() {
        String op = "MUL A B";
        int[][] testResultDo = operations.mul(A, B);
        int[][] resultDo = myProgram.doOperation(op, A, B);
        Assert.assertArrayEquals(testResultDo, resultDo);
    }

    @Test
    public void testDoOperationMul2() {
        String op = "MUL B A";
        int[][] testResultDo = operations.mul(B, A);
        int[][] resultDo = myProgram.doOperation(op, A, B);
        Assert.assertArrayEquals(testResultDo, resultDo);
    }

    @Test
    public void testDoOperationTranspose1() {
        String op = "Transpose A";
        int[][] testResultDo = operations.transpose(A);
        int[][] resultDo = myProgram.doOperation(op, A, B);
        Assert.assertArrayEquals(testResultDo, resultDo);
    }

    @Test
    public void testDoOperationTranspose2() {
        String op = "Transpose B";
        int[][] testResultDo = operations.transpose(B);
        int[][] resultDo = myProgram.doOperation(op, A, B);
        Assert.assertArrayEquals(testResultDo, resultDo);
    }

    @Test
    public void testDoOperationSum2() {
        String op = "SUM B A";
        int[][] testResultDo = operations.sum(B, A);
        int[][] resultDo = myProgram.doOperation(op, A, B);
        Assert.assertArrayEquals(testResultDo, resultDo);
    }

    @Test
    public void testGetArray() throws FileNotFoundException {
        File testInput = new File("testInput.txt");
        Scanner input = new Scanner(testInput);
        int[][] testResultA = {
                {91, 26, 75, 98, 86}
        };

        int[][] testResultB = {
                {30, 88},
                {57, 12},
                {32, 95},
                {93, 13},
                {33, 28}
        };

        int[][] resultA = myProgram.getArray(input);
        int[][] resultB = myProgram.getArray(input);

        Assert.assertArrayEquals(resultA, testResultA);
        Assert.assertArrayEquals(resultB, testResultB);
    }

    @Test
    public void testZero() {
        int[][] testResult = new int[A.length][A[0].length];
        int[][] result = myProgram.zero(A);
        Assert.assertArrayEquals(testResult, result);
    }

    @Test
    public void testPrintResult() {
        int[][] temp = {{91, 26, 75, 98, 86}};
        // Expected result
        String testResultPrint = "91 26 75 98 86 \n";

        int[][] tempResult = new int[30][30];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                tempResult[i][j] = temp[i][j];
            }
        }
        // Result from method
        String resultPrint = myProgram.printArray(tempResult);
        // Testing
        Assert.assertEquals(testResultPrint, resultPrint);
    }

//    @Test
//    public void testRun() throws FileNotFoundException {
//        File testInput = new File("testInput.txt");
//        Scanner input = new Scanner(testInput);
//        PrintWriter writer = new PrintWriter("testOutput.txt");
//        myProgram.run(input, writer);
//        writer.close();
//    }

    /* Testing MyProgram.Operations */
    @Test
    public void testSum() {
        int[][] testSum = new int[30][30];
        testSum[0][0] = -23;
        testSum[0][1] = 4;
        testSum[0][2] = -25;
        testSum[0][3] = -31;

        testSum[1][0] = 28;
        testSum[1][1] = -40;
        testSum[1][2] = -4;
        testSum[1][3] = 18;

        testSum[2][0] = -21;
        testSum[2][1] = 62;
        testSum[2][2] = 28;
        testSum[2][3] = 4;

        testSum[3][0] = 61;
        testSum[3][1] = 31;
        testSum[3][2] = 23;
        testSum[3][3] = -49;

        int[][] resultSum = operations.subt(A, B);
        Assert.assertArrayEquals(testSum, resultSum);
    }

    @Test
    public void testSubt() {
        int[][] a = {{91, 26, 75, 98, 86}};
        int[][] b = {{90, 22, 73, 95, 80}};
        int[][] testResultSubt = new int[30][30];
        testResultSubt[0][0] = 1;
        testResultSubt[0][1] = 4;
        testResultSubt[0][2] = 2;
        testResultSubt[0][3] = 3;
        testResultSubt[0][4] = 6;

        int[][] resultSubt = operations.subt(a, b);
        Assert.assertArrayEquals(testResultSubt, resultSubt);
    }

    @Test
    public void testMul() {
        int[][] testMul = new int[30][30];

        testMul[0][0] = 8024;
        testMul[0][1] = 10523;
        testMul[0][2] = 4220;
        testMul[0][3] = 4806;

        testMul[1][0] = 8583;
        testMul[1][1] = 9927;
        testMul[1][2] = 4208;
        testMul[1][3] = 7672;

        testMul[2][0] = 9161;
        testMul[2][1] = 13174;
        testMul[2][2] = 5681;
        testMul[2][3] = 10204;

        testMul[3][0] = 13047;
        testMul[3][1] = 11377;
        testMul[3][2] = 4785;
        testMul[3][3] = 9422;

        int[][] resultMul = operations.mul(A, B);
        Assert.assertArrayEquals(testMul, resultMul);
    }

    @Test
    public void testTranspose() {
        int[][] temp = {{91, 26, 75, 98, 86}};
        int[][] testTranspose = new int[30][30];

        testTranspose[0][0] = 91;
        testTranspose[1][0] = 26;
        testTranspose[2][0] = 75;
        testTranspose[3][0] = 98;
        testTranspose[4][0] = 86;

        int[][] resultTranspose = operations.transpose(temp);
        Assert.assertArrayEquals(testTranspose, resultTranspose);
    }

    @Test
    public void testDet() {
        int[][] temp = new int[3][3];
        temp[0][0] = 10;
        temp[0][1] = -8;
        temp[0][2] = 0;

        temp[1][0] = -8;
        temp[1][1] = 20;
        temp[1][2] = -6;

        temp[2][0] = 0;
        temp[2][1] = -6;
        temp[2][2] = 10;
        int testResultDet = 1000;

        int resultDet = operations.det(temp);
        // Testing
        Assert.assertEquals(testResultDet, resultDet);
    }
}