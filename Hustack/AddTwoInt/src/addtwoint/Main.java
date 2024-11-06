package addtwoint;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Đọc hai số nguyên lớn từ người dùng
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        // Cộng hai số
        BigInteger res = a.add(b);

        // In kết quả ra màn hình
        System.out.println(res);

        sc.close(); // Đóng scanner sau khi sử dụng
    }
}
