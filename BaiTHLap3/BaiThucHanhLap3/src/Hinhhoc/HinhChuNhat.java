package Hinhhoc;

import java.util.Scanner;

public class HinhChuNhat extends  HinhHoc {
    public float dai;
    public float rong;
    public HinhChuNhat() {
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Chieu Dai = ");
        dai = sc.nextFloat();
    }
    public void nhapChieuRong() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Chieu Rong = ");
        rong = sc.nextFloat();
    }
    public void tinhChuVi() {
        ChuVi = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        DienTich = dai * rong;
    }
    public void hienthi() {
        System.out.printf("Chieu Dai = %f, Chieu Rong = %f, Chu vi = %f, Dien Tich = %f", dai, rong, ChuVi, DienTich);
    }
}
