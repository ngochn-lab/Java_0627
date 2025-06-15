import java.util.Scanner;

class PhuongTienGiaoThong {
    protected String hangSX;
    protected String tenPT;
    protected int namSX;
    protected double vanTocToiDa;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãng SX: ");
        hangSX = sc.nextLine();
        System.out.print("Tên phương tiện: ");
        tenPT = sc.nextLine();
        System.out.print("Năm SX: ");
        namSX = sc.nextInt();
        System.out.print("Vận tốc tối đa: ");
        vanTocToiDa = sc.nextDouble();
    }

    public void xuat() {
        System.out.printf("Hãng: %s | Tên: %s | Năm: %d | Vận tốc: %.2f\n", hangSX, tenPT, namSX, vanTocToiDa);
    }

    public double getVanTocToiDa() {
        return vanTocToiDa;
    }
}
