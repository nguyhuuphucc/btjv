import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) throws Exception {
        // Nhập giá trị số từ bàn phím
        try (
        Scanner Scanner = new Scanner(System.in)) {
            System.out.println("Nhap mot so nguyen: ");
            int number = Scanner.nextInt();

            // Tính tổng các chữ số 
            int sum = 0;
            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }
            // In ra màn hình
            System.out.println("Tong cac chu so vua nhap la: "+ sum);
        }
    }
}
    

