import java.util.*;

public class VanDongVien {
    private String hoTen;
    private int tuoi;
    private String monThiDau;
    private double canNang;
    private double chieuCao;

    public VanDongVien() {
    }

    public VanDongVien(String hoTen, int tuoi, String monThiDau, double canNang, double chieuCao) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.monThiDau = monThiDau;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Môn thi đấu: ");
        monThiDau = sc.nextLine();
        System.out.print("Cân nặng: ");
        canNang = sc.nextDouble();
        System.out.print("Chiều cao: ");
        chieuCao = sc.nextDouble();
    }

    public void xuat() {
        System.out.printf("Tên: %s | Tuổi: %d | Môn: %s | Cân nặng: %.2f | Chiều cao: %.2f\n", hoTen, tuoi, monThiDau, canNang, chieuCao);
    }

    public boolean lonHon(VanDongVien vanDongVien) {
        return (this.chieuCao > vanDongVien.chieuCao) || (this.chieuCao == vanDongVien.chieuCao && this.canNang > vanDongVien.canNang);
    }

    public String getHoTen() {
        return hoTen;
    }
}
