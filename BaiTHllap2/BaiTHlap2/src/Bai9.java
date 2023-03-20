import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        int low = 0;
        int upp = 0;
        int num = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)) {
                low++;
            } else if (Character.isUpperCase(ch)) {
                upp++;
            } else if (Character.isDigit(ch)) {
                num++;
            }
        }

        System.out.println("So ki tu thuong la: " + low);
        System.out.println("So ki tu hoa la: " + upp);
        System.out.println("Ki tu so la: " + num);
    }
}
