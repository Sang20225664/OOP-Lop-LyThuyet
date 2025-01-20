package pack;

public class PhongBan {
    public static final byte SO_NV_MAX = 100; // Số nhân viên tối đa trong phòng ban
    private String tenPhongBan; // Tên phòng ban
    private byte soNhanVien; // Số lượng nhân viên hiện có
    private NhanVien[] dsnv; // Danh sách nhân viên trong phòng ban

    // Constructor khởi tạo phòng ban với tên
    public PhongBan(String tenPB) {
        dsnv = new NhanVien[SO_NV_MAX];
        tenPhongBan = tenPB;
        soNhanVien = 0;
    }

    // Thêm nhân viên vào phòng ban
    public boolean themNhanVien(NhanVien nv) {
        if (soNhanVien < SO_NV_MAX) {
            dsnv[soNhanVien] = nv;
            soNhanVien++;
            return true;
        } else {
            System.out.println("Không thể thêm nhân viên vào phòng ban, đã đủ số lượng tối đa.");
            return false;
        }
    }

    // Xóa nhân viên cuối cùng trong danh sách
    public NhanVien xoaNhanVien() {
        if (soNhanVien > 0) {
            NhanVien tmp = dsnv[soNhanVien - 1];
            dsnv[soNhanVien - 1] = null;
            soNhanVien--;
            return tmp;
        } else {
            System.out.println("Không có nhân viên nào để xóa.");
            return null;
        }
    }

    // Tính tổng lương của tất cả nhân viên trong phòng ban
    public double tongLuong() {
        double tong = 0.0;
        for (int i = 0; i < soNhanVien; i++) {
            tong += dsnv[i].tinhLuong();
        }
        return tong;
    }

    // In thông tin phòng ban và các nhân viên
    public void inTTin() {
        System.out.println("Tên phòng ban: " + tenPhongBan);
        System.out.println("Số lượng nhân viên: " + soNhanVien);
        System.out.println("Thông tin các nhân viên:");
        for (int i = 0; i < soNhanVien; i++) {
            dsnv[i].inTTin();
        }
    }

    // Getter và Setter cho tên phòng ban
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
}
