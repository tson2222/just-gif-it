package schultz.dustin.io;

public class Tester {
    public static void main(String[] args) {
        int a = 60;          int b = -60;        int c = 0;
        System.out.println("60 in binary  = " + Integer.toBinaryString(a));
        System.out.println("60 in hexadecimal  = " + Integer.toHexString(a));
        System.out.println("-60 = " + Integer.toBinaryString(b));

        //signed shift
        c = a >> 1;
        System.out.println("60 >> 1  = " + Integer.toBinaryString(c));

        //unsigned shift
        c = a >>> 1;
        System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) );

        c = b >> 1;
        System.out.println("-60 >> 1  = " + Integer.toBinaryString(c) );

        c = b >>> 1;
        System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));

        int hex = 0x14; int dezi = 20;
        if(hex == dezi)
        System.out.println("Hex and Deci have the same number value");
    }
}
