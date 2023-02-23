import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) {
        // Nhập hai số nguyên từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int num2 = scanner.nextInt();

        // So sánh giá trị của hai số và in ra số nhỏ nhất
        if (num1 < num2) {
            System.out.println("So nho nhat la: " + num1);
        } else {
            System.out.println("So nho nhat la: " + num2);
        }
    }
}
 
    

