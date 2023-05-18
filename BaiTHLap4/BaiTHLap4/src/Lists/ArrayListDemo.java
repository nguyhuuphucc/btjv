package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stdList = new ArrayList<Student>();
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
                    Student.inputInfo(stdList);
                    break;
                case 2:
                    Student.displayInfo(stdList);
                    break;
                case 3:
                    Student.addNewInfo(stdList);
                    break;
                case 4:
                    Student.editInfo(stdList);
                    break;
                case 5:
                    Student.deleteInfo(stdList);
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