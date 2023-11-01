public class HW18 {
    public static void main(String[] args) {
        int[][] matrix = new int[8][8];
        int maxNum;
        for (int i = 0; i < matrix.length; i++) {
            maxNum = 8;
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = maxNum;
                    maxNum--;
                }
            }
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == matrix.length - 1) {
                    System.out.print(ints[j]);
                } else {
                    System.out.print(ints[j] + ",");
                }
            }
            System.out.println();
        }
    }
}
