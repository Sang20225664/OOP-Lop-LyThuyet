package hinhhoc;

import hinhhoc.HinhVuong;

import java.util.Scanner;

import hinhhoc.HinhTron;

public class TestHinhHoc {
    public static void main(String[] args) {
        // Tạo đối tượng HinhVuong và tính toán
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Hình Vuông Cạnh: ");
    	double c = sc.nextDouble();
    	HinhVuong hv = new HinhVuong(c);
        System.out.println("Cạnh: " + hv.getCanh());
        System.out.println("Diện tích: " + hv.tinhDienTich());
        System.out.println("Chu vi: " + hv.tinhChuVi());

        // Tạo đối tượng HinhTron và tính toán
        System.out.print("Hình Tròn Bán Kính: ");
        double r = sc.nextDouble();
        HinhTron ht = new HinhTron(r);
        System.out.println("Bán kính: " + ht.getR());
        System.out.println("Diện tích: " + ht.tinhDienTich());
        System.out.println("Chu vi: " + ht.tinhChuVi());
    }
}
