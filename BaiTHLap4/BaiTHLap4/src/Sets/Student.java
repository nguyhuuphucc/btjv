package Sets;

import java.util.Scanner;
import java.util.Set;

public class Student {
    public String fullName;
    public int age;

    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void inputInfo(Set<Student> stdSet) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
    
        for (int i = 0; i < n; i++) {
            System.out.printf("Sinh vien thu %d: ", i + 1);
            System.out.print("Ho ten: ");
            String fullName = sc.nextLine();
            System.out.print("Tuoi: ");
            int age = sc.nextInt();
            sc.nextLine();
            Student std = new Student(fullName, age);
            stdSet.add(std);
        }
    }

    public static void displayInfo(Set<Student> stdSet) {
        System.out.println("Thong tin cua tat ca sinh vien ban da nhap: ");
        for (Student std : stdSet) {
            System.out.printf("\nHo ten: %s\tTuoi: %d", std.fullName, std.age);
        }
    }

    public static void addNewInfo(Set<Student> stdSet) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Them moi thong tin ");
        System.out.println("Nhap vao ho ten: ");
        String fullName = sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        Student std = new Student(fullName, age);
        stdSet.add(std);
        System.out.println("Da them sinh vien " + std.fullName + " vao danh sach.");
        System.out.println("Thong tin cua tat ca sinh vien ban da nhap sau khi them sinh vien: ");
        for (Student s : stdSet) {
            System.out.printf("\nHo ten: %s\tTuoi: %d", s.fullName, s.age);
        }
    }

    public static void editInfo(Set<Student> stdSet) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap vao ten sinh vien can sua thong tin: ");
        String name = sc.nextLine();
        boolean found = false;

        for (Student std : stdSet) {
            if (std.fullName.equals(name)) {
                System.out.println("Nhap vao thong tin moi cho sinh vien " + name + ":");
                System.out.println("Nhap vao ho ten: ");
                String fullName = sc.nextLine();
                System.out.println("Nhap vao tuoi: ");
                int age = sc.nextInt();
                sc.nextLine();
                std.fullName = fullName;
                std.age = age;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien co ten la " + name + " trong danh sach.");
        } else {
            System.out.println("Da cap nhat thong tin cho sinh vien " + name + ".");
            System.out.println("Thong tin cua tat ca sinh vien sau khi cap nhat: ");
            for (Student std : stdSet) {
                System.out.printf("\nHo ten: %s\tTuoi: %d", std.fullName, std.age);
            }
        }
    }

    public static void deleteInfo(Set<Student> stdSet) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten sinh vien can xoa: ");
        String name = sc.nextLine();
        boolean delete = false;

        for (Student std : stdSet) {
            if (std.fullName.equals(name)) {
                stdSet.remove(std);
                delete = true;
                break;
            }
        }

        if (!delete) {
            System.out.println("Khong tim thay sinh vien co ten la " + name + " trong danh sach.");
        } else {
            System.out.println("Da xoa sinh vien " + name + " khoi danh sach.");
            System.out.println("Thong tin cua tat ca sinh vien sau khi xoa: ");
            for (Student std : stdSet) {
                System.out.printf("\nHo ten: %s\tTuoi: %d", std.fullName, std.age);
            }
        }
    }
}