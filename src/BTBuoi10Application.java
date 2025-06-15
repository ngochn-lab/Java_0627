import java.util.Scanner;

public class BTBuoi10Application {
    public static void main(String[] args) {
        /*
        Xây dựng lớp Phanso gồm:
            Thuộc Tính: tuso, mauso.
            Phương thức:
            Hàm Khởi Tạo Không Tham Số,
            Nhập , Xuất
            Cong(), Tru(), Nhan(), Chia()
        Tính Tổng, Hiệu, Tích, Thương 2 phân số tham số nhận vào là đối tượng (Phân Số) rồi in kết quả ra màn hình.
         */
        printDivider(1);
        PhanSo ps = new PhanSo();
        ps.nhap();
        ps.xuat();

        /* Bai 2
          Xây dựng lớp vận động viên VanDongVien gồm:
          Thuộc tính: hoten (chuỗi ký tự), tuoi (số nguyên), monthidau (chuỗi ký tự), cannang (số thực), chieucao (số thực).
          Phương thức:
           Khởi tạo không tham số.
           Khởi tạo 5 tham số
           Viết phương thức nhập
           Viết phương thức xuất
           Viết phương thức so sánh 2 vận động viên > (một vận động viên là lớn hơn nếu chiều cao lớn hơn, trong trường hợp chiều cao bằng nhau thì xét cân nặng lớn hơn)
         */
        printDivider(2);
        VanDongVien vdv1 = new VanDongVien();
        vdv1.nhap();
        vdv1.xuat();

        VanDongVien vdv2 = new VanDongVien("Mike", 22, "Muay Thai", 75.5, 1.86);
        vdv2.xuat();

        if (vdv1.lonHon(vdv2)) {
            System.out.println("Vận động viên " + vdv1.getHoTen() + " lớn hơn vận động viên " + vdv2.getHoTen());
        } else {
            System.out.println("Vận động viên " + vdv2.getHoTen() + " lớn hơn hoặc bằng vận động viên " + vdv1.getHoTen());
        }

        /*  Bai 3
            Giả sử Công ty có hai loại nhân viên: Nhân viên văn phòng và Nhân viên sản xuất. Viết chương trình quản lý và tính lương cho từng nhân viên của công ty:
            Mỗi nhân viên cần quản lý các thông tin sau: Họ tên, ngày sinh, lương
            Công ty cần tính lương cho nhân viên như sau:
            Đối với nhân viên sản xuất:
            Lương=lương căn bản + số sản phẩm * 5.000
            Đối nhân viên văn phòng:
            lương = số ngày làm việc * 100.000
         */
        printDivider(3);
        NhanVien nv1 = new NhanVienSanXuat("An", "01/01/2000", 3000000, 50);
        NhanVien nv2 = new NhanVienVanPhong("Bình", "02/02/1999", 22);
        nv1.xuat();
        nv2.xuat();

        /*  Bai 4
            Xây dựng lớp PhuongTienGiaoThong bao gồm các thuộc tính sau : Hãng sản xuất, tên phương tiện, năm sản xuất, vận tốc tối đa.
            Xây dựng lớp Oto kế thừa phương tiện giao thông và bổ sung thêm thuộc tính: số chổ ngồi, kiểu động cơ.
            - Viết hàm nhập, xuất cho PhuongTienGiaoThong và Oto với các yêu cầu sau
            - Nhập vào thông tin của một phương tiện giao thông và xuất ra màn hình
            - Nhập vào n đối tượng Ô tô và xuất ra màn hình
            - In ra các đối tượng ô tô có cùng vận tốc
         */
        printDivider(4);
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng ô tô: ");
        int n = sc.nextInt();
        Oto[] ds = new Oto[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập ô tô thứ " + (i + 1));
            ds[i] = new Oto();
            ds[i].nhap();
        }

        System.out.println("\n--- Danh sách ô tô ---");
        for (Oto xe : ds) xe.xuat();

        System.out.println("\n--- Các ô tô có cùng vận tốc tối đa với xe đầu tiên ---");
        double vanToc = ds[0].getVanTocToiDa();
        for (Oto xe : ds) {
            if (xe.getVanTocToiDa() == vanToc) xe.xuat();
        }


    }

    public static void printDivider(int soBai) {
        System.out.println("------------------- BÀI TẬP " + soBai + " ------------------------");
    }
}
