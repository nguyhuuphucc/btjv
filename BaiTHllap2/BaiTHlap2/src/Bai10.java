import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        System.out.print("Nhap ky tu: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("So lan xuat hien ky tu " + ch + " trong chuoi la: " + count);
    }
}
