import java.util.Scanner;

public class PhanSo {
    private double tuSo;
    private double mauSo;

    public PhanSo() {}

    public PhanSo(double tuSo, double mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin mời nhập Tử Số:");
        tuSo = scanner.nextDouble();
        System.out.println("Xin mời nhập Mẫu Số:");
        mauSo = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("Từ số: " + tuSo);
        System.out.println("Mẫu số: " + mauSo);
    }

    public void cong(PhanSo phanSo) {
        double ketQua = (this.tuSo * phanSo.mauSo + this.mauSo * phanSo.tuSo)/(this.mauSo * phanSo.mauSo);
        System.out.println("Tổng 2 phân số: " + ketQua);
    }

    public void tru(PhanSo phanSo) {
        double ketQua = (this.tuSo * phanSo.mauSo - this.mauSo * phanSo.tuSo)/(this.mauSo * phanSo.mauSo);
        System.out.println("Hiệu 2 phân số: " + ketQua);
    }

    public void nhan(PhanSo phanSo) {
        double ketQua = (this.tuSo * phanSo.tuSo)/(this.mauSo * phanSo.mauSo);
        System.out.println("Tích 2 phân số: " + ketQua);
    }

    public void chia(PhanSo phanSo) {
        double ketQua = (this.tuSo * phanSo.mauSo)/(this.mauSo * phanSo.tuSo);
        System.out.println("Thương 2 phân số: " + ketQua);
    }
}
