import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Nhap vao so phan tu cua arrList: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu cua arrList");
        for(int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i);
            int number = sc.nextInt();
            arrayList.add(number);
        }
        Collections.sort(arrayList); // sắp xếp danh sách
        // sử dụng hàm collectonss
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        System.out.println("Day ArrList: " + arrayList);
        System.out.println("ArrList da sap xep: " + arrayList);
        System.out.printf("max = %d, min = %d ", max, min);
    } 
}