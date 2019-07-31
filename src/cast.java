import java.util.Scanner;
import java.util.SortedMap;

public class cast {

    public static void main(String[] args) {
//        double a = 5.52;
//        int i;
//        i = (int)a;
//        final float PI = 3.1416f;
//        final double Latitude, Lontitude;
//        Latitude = 100.1564;
//        Lontitude = 99.1564;
//
//        System.out.println("\\value");
//        System.out.println(Latitude);
//        System.out.println(Lontitude);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Name :");
//        String s = scan.next();
//        System.out.println(s);
//        double r1 = Math.random();
//        double r2 = Math.random();
//        double r3 = Math.random();
//        int d1 = (int)(r1*6)+1;
//        int d2 = (int)(r2*6)+1;
//        int d3 = (int)(r3*6)+1;
//        System.out.println("ลูกเต๋าลูกที่1 = "+d1);
//        System.out.println("ลูกเต๋าลูกที่2 = "+d2);
//        System.out.println("ลูกเต๋าลูกที่3 = "+d3);
//
//        String s = "15";
//        int d = Integer.parseInt(s);
//        System.out.println("Convert string to int = "+d*2);
//
//
//        s = Integer.toString(d);
//        System.out.println("Convert int to string = "+s);
//        System.out.println("convert int to base 16 = "+ Integer.toHexString(100));
//        System.out.println("convert int to base 8 = "+ Integer.toOctalString(100));
//        System.out.println("convert int to base 2 = "+ Integer.toBinaryString(100));
//
//        String login = "admin";
//        boolean b =login.equals("admin");
//        System.out.println(b);
//
//        b = !(1<2) && (3<4);
//        System.out.println(b);
//
//        String s1 ="จริง";
//        String s2 = "ไม่จริง";
//        String s3;
//
//        s3 = (1>5)? s1:s2;
//        System.out.println(s3);
//
//        boolean x = (1>0)?true:false;
//        double x = 10;
//        String s = ( x%2==0)?"Even":"Odd";
//        System.out.println(s);

        Scanner scan = new Scanner(System.in);
        int withdraw;
        withdraw = scan.nextInt();

        int b1000 = (int)(withdraw/1000);
        int remain = withdraw%1000;

        int b500 = (int)(withdraw/500);

        remain = remain%500;
        int b100 = (int)(remain/100);

        System.out.println("ธนบัตรที่ได้รับ");
        System.out.println("B1000 : " + b1000);
        System.out.println("B500 : " + b500);
        System.out.println("B100 : " + b100);


    }
}
