package Hinhhoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float ChieuCao;
    public HinhTru() {
        ten = "Hinh Tru";
    }
    public void nhapChieuCao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n h = ");
        ChieuCao = sc.nextFloat();
    }
    public void tinhTheTich() {
        TheTich = DienTich * ChieuCao;
    }
    public void Hienthi() {
        super.Hienthi();
        System.out.printf("h = %f, The Tich = %f", ChieuCao, TheTich);
    }
}
