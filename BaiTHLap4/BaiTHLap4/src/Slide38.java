import java.util.LinkedList;

public class Slide38 {
    public static void main(String[] args) {
        LinkedList<String> lish = new LinkedList<String>();
        lish.add("Java");
        lish.add("C++");
        lish.add("Python");
        lish.add("PHP");

        System.out.println("VD su dung phuong thuc addAll() ");
        System.out.println(" ------------------------------ ");

        LinkedList<String> lishA = new LinkedList<String>();
        lishA.addAll(lish);
        System.out.println("listA");
        showList(lishA);
        System.out.println("\nVD su dung phuong thuc retainAll() ");
        System.out.println(" ----------------------------------- ");

        LinkedList<String> lishB = new LinkedList<String>();
        lishB.add("Java");
        lishA.retainAll(lishB);
        System.out.println("listA");
        showList("listA");

        System.out.println("\nVD su dung phuong thuc removeAll() ");
        System.out.println(" ----------------------------------- ");
    }
}
 public static void showList(LinkedList<String> list) {
    for (String obj : list) {
        System.out.println("\t" + obj + ", ");
    }
    System.out.println();
 }