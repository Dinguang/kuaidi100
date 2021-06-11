import java.math.BigDecimal;

public class test1 {
    public static void main(String[] args) {
        BigDecimal test = test();
        System.out.println("------------------------");
        System.out.println(test);
    }
    public static BigDecimal test(){
        BigDecimal a = new BigDecimal("0");

        for (int i=0;i<6;i++){
            a=new BigDecimal("6").add(a);
            System.out.println(a);
        }
        System.out.println(a);
        return a;
    }
}
