package main;

import Hinhhoc.HinhTru;
import Hinhhoc.HinhTron;
import Hinhhoc.HinhChuNhat;
import Hinhhoc.HinhVuong;
public class MainClass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.Hienthi();

        HinhTru htu = new HinhTru();
        htu.xuatTen();
        htu.nhapChieuCao();
        htu.tinhDienTich();
        htu.Hienthi();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.hienthi();
        
        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.NhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.hienthi();
    }
}

