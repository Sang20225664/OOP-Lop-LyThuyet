package MatHang;

public class TestHang {
    public static void main(String[] args) {
        // Tạo các đối tượng
        HangDienMay dienMay = new HangDienMay("DM001", "Tivi LG", "LG", 12000000, 24, 220, 150);
        HangSanhSu sanhSu = new HangSanhSu("SS001", "Bình hoa sứ", "Bát Tràng", 500000, "Gốm cao cấp");
        HangThucPham thucPham = new HangThucPham("TP001", "Sữa Vinamilk", "Vinamilk", 20000, "2025-01-01", "2025-06-01");

        // Xuất thông tin
        dienMay.XTT();
        System.out.println();
        sanhSu.XTT();
        System.out.println();
        thucPham.XTT();
    }
}