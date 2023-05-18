import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int count = scanner.nextInt();

        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        int max = Collections.max(numbers);
        System.out.println("So lon nhat trong day: " + max);

        System.out.print("Nhap so nguyen de xoa: ");
        int toRemove = scanner.nextInt();

        numbers.removeIf(n -> n == toRemove);

        Collections.sort(numbers);

        System.out.println("Day so sau khi sap xep de: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
