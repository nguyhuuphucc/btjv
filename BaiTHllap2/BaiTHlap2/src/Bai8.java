import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so thu " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }

        double avg = (double) sum / n;
        System.out.println("Trùn binh cong cua day so la: " + avg);
    }
}
