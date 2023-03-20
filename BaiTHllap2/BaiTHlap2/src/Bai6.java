import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao 1 so nguyen duong: ");
        int n = sc.nextInt();

        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }

        System.out.println("Giai thua cua " + n + " la " + fac);
    }
}
