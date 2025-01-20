package pack;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng NhanVien
        NhanVien nv1 = new NhanVien("Quốc Tuấn", 6.5);
        NhanVien nv2 = new NhanVien("Trọng Tuấn", 5.1);
        NhanVien nv3 = new NhanVien("Hoàng Đức", 5.1);

        nv1.setHeSoLuong(6.5);
        nv2.setHeSoLuong(5.1);
        nv3.setHeSoLuong(5.1);

        nv1.tangLuong(1.0); // Tăng hệ số lương cho nv1
        nv2.tangLuong(1.5); // Tăng hệ số lương cho nv2

        // In thông tin các nhân viên
        nv1.inTTin();
        nv2.inTTin();
        nv3.inTTin();

        // Tạo đối tượng TruongPhong
        TruongPhong tp1 = new TruongPhong("Nguyễn Văn Bình", 8.0, 3000000, 5);
        tp1.tangLuong(0.5); // Tăng hệ số lương cho trưởng phòng

        // In thông tin trưởng phòng
        tp1.inTTin();

        // In tổng lương của các nhân viên và trưởng phòng
        double tongLuong = NhanVien.tinhTongLuong(nv1, nv2, nv3, tp1);
        System.out.println("Tổng lương của tất cả nhân viên và trưởng phòng: " + tongLuong);

        // In số lượng đối tượng đã được tạo
        System.out.println("Số lượng nhân viên đã được tạo: " + NhanVien.getSoLuongTheHien());
        double loiNhuanCongTy = 100000000.0; // Lợi nhuận công ty

        // Tạo đối tượng Giám đốc
        GiamDoc giamDoc = new GiamDoc("Nguyễn Văn A", 5000000, 8, 2000000, loiNhuanCongTy);

        // Tạo đối tượng Cán bộ quản lý
        CanBoQuanLy canBo = new CanBoQuanLy("Trần Văn B", 4000000, 6.5, loiNhuanCongTy);

        // In thông tin
        System.out.println("Thông tin giám đốc:");
        giamDoc.inTTin();

        System.out.println("\nThông tin cán bộ quản lý:");
        canBo.inTTin();
    }
}
