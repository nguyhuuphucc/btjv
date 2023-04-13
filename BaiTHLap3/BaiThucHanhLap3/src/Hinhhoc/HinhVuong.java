package Hinhhoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten = "Hinh Vuong";
    }
    public void NhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Canh = ");
        dai = rong = sc.nextFloat();
    }
    public void hienthi() {
        super.hienthi();
    }
}
