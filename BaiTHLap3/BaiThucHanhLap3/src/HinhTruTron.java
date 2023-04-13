import java.util.Scanner;

public class HinhTruTron {
    float banKinh;
    float chieuCao;
    final float PI = 3.14f;
    float chuVi;
    float dienTich;
    float theTich;
    void NhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("r = ");
        banKinh = sc.nextFloat();
    }
    
    void tinhchuVi() {
        chuVi = 2 * PI * banKinh * chieuCao;
    }
    void tinhdienTich() {
        dienTich = 2 * PI * banKinh * chieuCao + 2 * PI * banKinh * banKinh;
    }
    void tinhtheTich() {
        theTich = PI * banKinh * banKinh * chieuCao;
    }
    void hienThiRaManHinh() {
        System.out.printf("r = %f; h = %f; ChuVi = %f; DienTich = %f; TheTich = %f", banKinh, chieuCao, chuVi, dienTich, theTich);
    }
}
