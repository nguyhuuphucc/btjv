import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int count = scanner.nextInt();

        System.out.println("Nhap cac so nguyen: ");
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        int sum = 0;
        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
                evenCount++;
            }
        }

        double average = (evenCount > 0) ? (double) sum / evenCount : 0;

        System.out.println("Trung binh cong cua cac so chan: " + average);
    }
}
