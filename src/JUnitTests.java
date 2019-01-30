import org.junit.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    /* Testing main class */
    Main myProgram;

    @Test
    public void testMain() {
        myProgram = new Main();
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
        int[][] result = Main.zero(A);
        Assert.assertArrayEquals(result, testResult);
    }

    /* Testing operations */
    @Test
    public void testTranspose() {
        int[][] testTranspose = new int[30][30];

        testTranspose[0][0] = 68;
        testTranspose[0][1] = 49;
        testTranspose[0][2] = 32;
        testTranspose[0][3] = 98;

        testTranspose[1][0] = 64;
        testTranspose[1][1] = 58;
        testTranspose[1][2] = 98;
        testTranspose[1][3] = 38;

        testTranspose[2][0] = 3;
        testTranspose[2][1] = 29;
        testTranspose[2][2] = 33;
        testTranspose[2][3] = 44;

        testTranspose[3][0] = 9;
        testTranspose[3][1] = 37;
        testTranspose[3][2] = 66;
        testTranspose[3][3] = 27;


        int[][] resultTranspose = Operations.transpose(A);
        Assert.assertArrayEquals(resultTranspose, testTranspose);
    }

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

        int[][] resultSum = Operations.subt(A, B);

        Assert.assertArrayEquals(resultSum, testSum);
    }

    @Test
    @Ignore
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

        int[][] result = Operations.mul(A, B);
        Assert.assertArrayEquals(result, testMul);
    }


}