
public class App {
   
    public static void main(String[] args) throws Exception {   
       DanhBaAB dv = new DanhBaAB(9);

       dv.Update("Uyen", "0397639062");
       dv.SeachByName("Phuc", "0129345235");
       dv.Delete("Uyen");
    }
}
