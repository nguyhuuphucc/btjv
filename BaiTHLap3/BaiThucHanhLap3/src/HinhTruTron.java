public class HinhTruTron {
    float banKinh = 2.5f;
    float chieuCao = 4.2f;
    final float PI = 3.14f;
    float chuVi;
    float dienTich;
    float theTich;
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
