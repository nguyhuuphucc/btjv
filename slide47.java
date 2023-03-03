import java.util.Scanner;
public class slide47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Nhap vao cac chu so de tinh tong: ");  
            int num = sc.nextInt();
            sum += num;
            if(num>100){
                break;
            }      
        }
        System.out.println(" Tong cua cac so da nhap la: " + sum);
    }
}
