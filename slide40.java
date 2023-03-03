import java.util.Scanner;
public class slide40 {
    public static void main(String[] args) {
        System.out.println("Nhap vao cac gia tri tu 1 den 7: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 1:
            System.out.println("Chu Nhat");
            break;
            case 2:
            System.out.println("Thu 2");
            break;
            case 3:
            System.out.println("Thu 3");
            break;
            case 4:
            System.out.println("Thu 4");
            break;
            case 5:
            System.out.println("Thu 5");
            break;
            case 6:
            System.out.println("Thu 6");
            break;
            case 7:
            System.out.println("Thu 7");
            break;
            default:
            System.out.println("Vui long nhap lai du lieu da cho: ");
            break;
        }
    }
}
