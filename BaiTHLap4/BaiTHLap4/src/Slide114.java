import java.util.*;

public class Slide114 {
    private String maSV;
    private String hoTen;
    private String lop;

    public SinhVien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public static void main(String[] args) {
        Map<String, SinhVien> danhSachSV = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String maSV = scanner.nextLine();

            System.out.print("Ho va ten: ");
            String hoTen = scanner.nextLine();

            System.out.print("Lop: ");
            String lop = scanner.nextLine();

            SinhVien sv = new SinhVien(maSV, hoTen, lop);
            danhSachSV.put(maSV, sv);
        }

        System.out.print("Nhap ten lop: ");
        String tenLop = scanner.nextLine();

        System.out.println("Cac sinh vien thuoc lop " + tenLop + ":");
        for (SinhVien sv : danhSachSV.values()) {
            if (sv.getLop().equals(tenLop)) {
                System.out.println("Ma SInh vien: " + sv.getMaSV());
                System.out.println("Ho va ten: " + sv.getHoTen());
                System.out.println("Lop: " + sv.getLop());
                System.out.println("------------------------");
            }
        }

        System.out.print("Nhap ma sinh vien: ");
        String maSV = scanner.nextLine();

        SinhVien sinhVien = danhSachSV.get(maSV);
        if (sinhVien != null) {
            System.out.println("Ho va ten: " + sinhVien.getHoTen());
            System.out.println("Lop: " + sinhVien.getLop());
        } else {
            System.out.println("Khong tim thay sinh vien voi ma " + maSV);
        }
    }
}

