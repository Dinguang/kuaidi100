import java.math.BigDecimal;
import java.math.RoundingMode;
import java.rmi.MarshalledObject;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        NumberFormat currency = NumberFormat.getCurrencyInstance(); //建立货币格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用
        percent.setMaximumFractionDigits(2);
//        percent.setRoundingMode(RoundingMode.CEILING);
//
//
        Long l=28912L;
        BigDecimal bigDecimal = new BigDecimal(l);
        System.out.println(bigDecimal);
//        System.out.println(Long.toString(l));
//        double d=5.2;
//        double c = 5.8;
        BigDecimal b = new BigDecimal("90.02452556");
        BigDecimal r = new BigDecimal("100");
        System.out.println(r.subtract(b));
        System.out.println(percent.format(r.subtract(b)));
//        System.out.println(r.doubleValue());
//        System.out.println(r.toPlainString());
//        System.out.println(r.toString()+"%");
//        BigDecimal loanAmount = new BigDecimal(l); //贷款金额
        System.out.println(percent.format(b.divide(r, 6,BigDecimal.ROUND_HALF_EVEN)));

//
//        BigDecimal interestRate = new BigDecimal("5.21545"); //利率
//        BigDecimal interest = (interestRate.subtract(loanAmount)).divide(loanAmount,6,BigDecimal.ROUND_HALF_EVEN);
//        BigDecimal multiply = loanAmount.multiply(interestRate);
//        long l1 = interestRate.longValue();
//
//        System.out.println(multiply);
//        System.out.println(interestRate.doubleValue());
//        System.out.println(d * l);
//        System.out.println(currency.format(loanAmount));
//        System.out.println(percent.format(interestRate));
//        BigDecimal bigDecimal = BigDecimal.valueOf(50);
//        RoundingMode roundingMode = RoundingMode.valueOf(0);
//
//        System.out.println(roundingMode.toString());
//        System.out.println(bigDecimal);
//        int[] a = new int[20];
//        for (int i = 0; i<a.length; i++){
//            a[i] = i;
//        }
//        String s = Arrays.toString(a);
//        System.out.println(s);
//        for (UserRole role : UserRole.values()) {
//            System.out.println(role);
//        }
//        UserRole userRole = new UserRole(20,6000);
//        UserRole userRole2 = new UserRole(60,5000);
//        Map<String,UserRole> map= new HashMap<>();
//        map.put("ldg",userRole);
//        map.put("mlq",userRole2);
//        System.out.println(map.get("lkj"));

//        BigDecimal a = new BigDecimal("0");
//
//        for (int i=0;i<6;i++){
//            a=new BigDecimal("6").add(a);
//            System.out.println(a);
//        }
//        System.out.println(a);
//        Long la= -560L;
//        System.out.println(Math.abs(la));
    }

}
