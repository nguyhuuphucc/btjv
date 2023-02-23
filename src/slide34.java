import java.util.Scanner;

public class slide34 {
    public static void main(String[] args) {
        // Nhập các hệ số a, b, c từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();

        // Tính delta và kiểm tra các trường hợp
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trihn co 2 nghiem :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
