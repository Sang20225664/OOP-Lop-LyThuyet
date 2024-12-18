package slide2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Kiểm tra điều kiện n từ 3 đến 8
        do {
            System.out.print("Nhập kích thước ma trận vuông (3 <= n <= 8): ");
            n = scanner.nextInt();
            if (n < 3 || n > 8) {
                System.out.println("Kích thước không hợp lệ. Vui lòng nhập lại!");
            }
        } while (n < 3 || n > 8);

        int[][] matrix = new int[n][n];
        fillSpiralMatrix(matrix, n);

        // In ma trận kết quả
        System.out.println("Ma trận xoắn ốc:");
        printMatrix(matrix, n);

        scanner.close();
    }

    // Hàm điền giá trị vào ma trận theo dạng xoắn ốc
    public static void fillSpiralMatrix(int[][] matrix, int n) {
        int value = 1; // Giá trị ban đầu
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            // Đi từ trái sang phải
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // Đi từ trên xuống dưới
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // Đi từ phải sang trái
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // Đi từ dưới lên trên
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
    }

    // Hàm in ma trận ra màn hình
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
