import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao 1 so nguyen: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " la so chan");
        } else {
            System.out.println(num + " la so le");
        }
    }
}
