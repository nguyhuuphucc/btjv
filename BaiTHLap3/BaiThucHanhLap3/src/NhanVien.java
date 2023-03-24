import java.util.Scanner;

public class NhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double heSoLuong;
        double luongCoBan = 1490000; 

        System.out.print("Ho ten nhan vien: ");
        name = sc.nextLine();

        System.out.print("Tuoi nhan vien: ");
        age = sc.nextInt();

        System.out.print("He so luong nhan vien: ");
        heSoLuong = sc.nextDouble();

        double luong = luongCoBan * heSoLuong;
        System.out.println("Thong tin nhan vien: " + name + ", " + age + " Tuoi, He so luong" + luong);
    }
}
