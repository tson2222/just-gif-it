package schultz.dustin.io;

public class Tester {

    public static void main(String[] args) {
        int a = 60;
        int b = -60;
        int c = 0;
        Integer integer = new Integer(a);
        System.out.println("Byte Value of a: " + Integer.toString(a,16));
        digits(9223372036854775807L);
        System.out.println("Int 6 / 10 =" + 9 / 10);
        System.out.println(Integer.parseInt("AB", 16));
        System.out.println("60 in binary  = " + Integer.toBinaryString(a));
        System.out.println("60 in hexadecimal  = " + Integer.toHexString(a));
        System.out.println("-60 = " + Integer.toBinaryString(b));
        digits(601312515);
        //signed shift
        c = a >> 1;
        System.out.println("60 >> 1  = " + Integer.toBinaryString(c));
        //unsigned shift
        c = a >>> 1;
        System.out.println("60 >>> 1 = " + Integer.toBinaryString(c));

        c = b >> 1;
        System.out.println("-60 >> 1  = " + Integer.toBinaryString(c));

        c = b >>> 1;
        System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));

        int hex = 0x14;
        int dezi = 20;
        if (hex == dezi)
            System.out.println("Hex and Deci have the same number value");

    }

    public static void digits(int digits) {
        int count = 0;

        while (digits > 0) {
            // num = num/10
            digits /= 10;
            System.out.println(digits);
            ++count;
        }

        System.out.println("Number of digits: " + count);

    }

    public static void digits(long digitss) {
        int count = 0;

        while (digits > 0) {
            // num = num/10
            digits /= 10;
            System.out.println(digits);
            ++count;
        }

        System.out.println("Number of awaddigits: " + count);

    }
}
