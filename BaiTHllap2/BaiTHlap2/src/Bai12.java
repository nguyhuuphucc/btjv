import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        int a = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > a) {
                    a = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu co gia tri lon nhat la: " + a);
    }
}
