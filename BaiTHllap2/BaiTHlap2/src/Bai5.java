import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        while (sum <= 100) {
            System.out.print("Nhap 1 so nguyen: ");
            num = sc.nextInt();
            sum += num;
        }

        System.out.println("Tong cac so da nhap la: " + sum);
    }
}
