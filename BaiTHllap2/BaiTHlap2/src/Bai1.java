import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so thu nhat: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Nhap so thu hai: ");
        double num2 = sc.nextDouble();
        
        double sum = num1 + num2;
        double dif= num1 - num2;
        double prod = num1 * num2;
        double quot = num1 / num2;
        double remai = num1 % num2;
        
        System.out.println("Tong 2 so la: " + sum);
        System.out.println("Hieu 2 so la: " + dif);
        System.out.println("Tich 2 so la: " + prod);
        System.out.println("Thuong 2 so la: " + quot);
        System.out.println("Phan du 2 so la: " + remai);
        
        if (num1 > num2) {
            System.out.println("So thu nhat lon hon so thu hai");
        } else if (num1 < num2) {
            System.out.println("So thu nhat nho hon so thu hai");
        } else {
            System.out.println("Hai so bang nhau");
        }
    }
}
