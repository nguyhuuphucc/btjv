package Lists;
import java.util.List;
import java.util.Scanner;

public class Student {
    public String fullName;
    public int Age;
    
    public static void inputInfo(List<Student> arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
    
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            System.out.printf("Sinh vien thu %d: ", i+1);
            sc.nextLine(); 
            System.out.print("Ho ten: ");
            std.fullName = sc.nextLine();
            System.out.print("Tuoi: ");
            std.Age = sc.nextInt();
            arr.add(std);
        }
    }

    public static void displayInfo(List<Student> arr) {
        System.out.println("Thong tin cua tat ca sinh vien ban da nhap: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("\nSinh vien thu %d: \n" , i+1);
            System.out.print("Ho ten: " + arr.get(i).fullName);
            System.out.print("\tTuoi: " + arr.get(i).Age);
        }
    }

    public static void addNewInfo(List<Student> arr){
        Student std = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Them moi thong tin ");
        System.out.println("Nhap vao ho ten: ");
        std.fullName = sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        std.Age = sc.nextInt();
        arr.add(std);
        System.out.println("Da them sinh vien " + std.fullName + " vao danh sach.");
        System.out.println("Thong tin cua tat ca sinh vien ban da nhap sau khi them sinh vien: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("\nSinh vien thu %d: \n" , i+1);
            System.out.print("Ho ten: " + arr.get(i).fullName);
            System.out.print("\tTuoi: " + arr.get(i).Age);
        }
    }


    public static void editInfo(List<Student> arr) {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("\nNhap vao ten sinh vien can sua thong tin: ");
        String name = sc.nextLine();
        boolean found = false;
            
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).fullName.equals(name)) {
                System.out.println("Nhap vao thong tin moi cho sinh vien " + name + ":");
                System.out.println("Nhap vao ho ten: ");
                arr.get(i).fullName = sc.nextLine();
                System.out.println("Nhap vao tuoi: ");
                arr.get(i).Age = sc.nextInt();
                found = true;
                break;
                }
            }
            
            if (!found) {
                System.out.println("Khong tim thay sinh vien co ten la " + name + " trong danh sach.");
            } else {
                System.out.println("Da cap nhat thong tin cho sinh vien " + name + ".");
            }
        
    }

     public static void deleteInfo(List<Student> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten sinh vien can xoa: ");
        String name = sc.nextLine();
        boolean delete = false;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).fullName.equals(name)) {
                arr.remove(i);
                delete = true;
                break;
            }
        }
        if(!delete) {
            System.out.println("Khong tim thay sinh vien co ten la " + name + " trong danh sach.");
        } else {
            System.out.println("Da xoa thong tin cua " + name + " thanh cong ");
        }
    }

}