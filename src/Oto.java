import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong{
    private int soChoNgoi;
    private String kieuDongCo;

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chỗ ngồi:");
        this.soChoNgoi = scanner.nextInt();
        System.out.print("Nhập kiểu động cơ:");
        this.kieuDongCo = scanner.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Số chỗ: %d | Động cơ: %s\n", soChoNgoi, kieuDongCo);
    }
}
