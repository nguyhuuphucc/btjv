package Hinhhoc;

import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float BanKinh;
    public HinhTron() {
        ten = "Hinh Tron";
    }
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" r = ");
        BanKinh = sc.nextFloat();
    }
    public void tinhChuVi() {
        ChuVi = 2 * PI * BanKinh;
    }
    public void tinhDienTich() {
        DienTich = PI * BanKinh * BanKinh;
    }
    public void Hienthi() {
        System.out.printf("r = %f, Chu Vi = %f, Dien Tich = %f", BanKinh, ChuVi, DienTich);
    }
}
