package schultz.dustin.io;

public class Tester {

    static boolean switcher = false;

    public static void main(String[] args) {
        booltest();
        int a = 60;          int b = -60;        int c = 0;
        digits(9223372036854775807L);
        System.out.println("Int 6 / 10 =" + 9/10);
        System.out.println(Integer.parseInt("AB",16));
        System.out.println("60 in binary  = " + Integer.toBinaryString(a));
        System.out.println("60 in hexadecimal  = " + Integer.toHexString(a));
        System.out.println("-60 = " + Integer.toBinaryString(b));
        digits(601312515);
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

    public static void digits(int digits){
        int count = 0;

        while(digits > 0)
        {
            // num = num/10
            digits /= 10;
            System.out.println(digits);
            ++count;
        }

        System.out.println("Number of digits: " + count);

    }

    public static void digits(long digits){
        int count = 0;

        while(digits > 0)
        {
            // num = num/10
            digits /= 10;
            System.out.println(digits);
            ++count;
        }

        System.out.println("Number of digits: " + count);

    }


    public static void booltest(){
    if(switcher == true){
        System.out.println("You should have used ==");
    }else
        System.out.println("You used ==!");
    }

}
