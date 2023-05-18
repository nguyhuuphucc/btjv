package Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Student> stdSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
    
        do {
            System.out.println("\n");
            System.out.println("1. Nhap thong tin cho sinh vien");
            System.out.println("2. Hien thi thong tin cho sinh vien");
            System.out.println("3. Them moi thong tin cho sinh vien");
            System.out.println("4. Sua thong tin cho sinh vien");
            System.out.println("5. Xoa thong tin cua sinh vien ");
            System.out.println("6. Exit");
    
            System.out.print("Hay chon: ");
            choice = sc.nextInt();
    
            switch (choice) {
                case 1:
                    Student.inputInfo(stdSet);
                    break;
                case 2:
                    Student.displayInfo(stdSet);
                    break;
                case 3:
                    Student.addNewInfo(stdSet);
                    break;
                case 4:
                    Student.editInfo(stdSet);
                    break;
                case 5:
                    Student.deleteInfo(stdSet);
                    break;
                case 6:
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Lua chon khong hop le vui long chon lai");
                    break;
            }
    
        } while (choice != 6);
    }
}