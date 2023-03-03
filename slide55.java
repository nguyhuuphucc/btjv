import java.util.Scanner;

public class slide55 {
    public static void main(String[] args) {
        System.out.println("Cac so chia het cho 5 trong pham vi tu 0 den 200");
        int i;
        for(i = 0; i<=200;i++) {
            if (i % 5 == 0) {
            System.out.println(i +" ");
            }
        }
    }
}