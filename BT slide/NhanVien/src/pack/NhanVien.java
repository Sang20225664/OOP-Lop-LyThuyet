package pack;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_CO_BAN = 750000;
    public static final double LUONG_MAX = 20000000;

    private static int soLuongTheHien = 0; // Đếm số lượng đối tượng được tạo

    // Constructor mặc định
    public NhanVien() {
        this.tenNhanVien = "Chưa đặt tên";
        this.heSoLuong = 1.0;
        soLuongTheHien++;
    }

    // Constructor có tham số
    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong > 0 ? heSoLuong : 1.0;
        soLuongTheHien++;
    }

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
    // Getter và Setter cho `tenNhanVien`
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        if (tenNhanVien != null && !tenNhanVien.trim().isEmpty()) {
            this.tenNhanVien = tenNhanVien;
        } else {
            System.out.println("Tên nhân viên không hợp lệ!");
        }
    }

    // Getter và Setter cho `heSoLuong`
    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        if (heSoLuong > 0) {
            this.heSoLuong = heSoLuong;
        } else {
            System.out.println("Hệ số lương phải lớn hơn 0!");
        }
    }

    // Phương thức tính lương
    public double tinhLuong() {
        return LUONG_CO_BAN * heSoLuong;
    }

    // Phương thức tăng lương
    public boolean tangLuong(double heSoTang) {
        if (heSoTang > 0 && (heSoLuong + heSoTang) * LUONG_CO_BAN <= LUONG_MAX) {
            heSoLuong += heSoTang;
            return true;
        } else {
            System.out.println("Không thể tăng lương vì vượt giới hạn lương tối đa.");
            return false;
        }
    }

    // Phương thức in thông tin
    public void inTTin() {
        System.out.printf("Tên nhân viên: %s, Hệ số lương: %.2f, Lương: %.2f%n",
                tenNhanVien, heSoLuong, tinhLuong());
    }

    // Phương thức tĩnh tính tổng lương của nhiều nhân viên
    public static double tinhTongLuong(NhanVien... nhanViens) {
        double tongLuong = 0;
        for (NhanVien nv : nhanViens) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }

    // Getter cho số lượng đối tượng đã tạo
    public static int getSoLuongTheHien() {
        return soLuongTheHien;
    }
}
