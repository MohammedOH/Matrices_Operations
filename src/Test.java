//import java.io.*;
//
//public class Test {
//    public static void main(String[] args) throws FileNotFoundException {
//        PrintWriter writer = new PrintWriter("test.txt");
//        writer.println("The output is: ");
//
//        int[][] test = new int[30][30];
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                test[i][j] = random();
//            }
//        }
//
//        String output1 = printArray(test);
//        String output2 = print_Array(test);
//
//        writer.println(output1);
//        writer.print(output2);
//
//        writer.close();
//    }
//
//    private static int random() {
//        return ((int) (Math.random() * 9) + 1);
//    }
//
//    private static String printArray(int[][] list) throws FileNotFoundException {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list[i].length; j++) {
//                sb.append(list[i][j]).append(" ");
//            }
//            sb.append("\n");
//        }
//        return (sb.toString());
//    }
//
//
//}