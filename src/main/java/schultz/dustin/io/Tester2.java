package schultz.dustin.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Tester2 {
    interface IntegerMath {
        int operation(int a, int b);

        default IntegerMath swap() {
            return (a, b) -> operation(b, a);
        }
    }

    private static int apply(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {
        double f,e;  f = 2.11; e = 3.1;
         int round = (int)(e-f);
        System.out.println(e + " minus " + f + " casted to int equals " + round);

        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " + apply(40, 2, addition));
        System.out.println("20 - 10 = " + apply(20, 10, subtraction));
        System.out.println("10 - 20 = " + apply(20, 10, subtraction.swap()));
        for (int i = 0;i<90; i++) {
            System.out.println(i + ": " + count.apply(i));
        }

        String[] x = {"Hello","Hase","Helmut","Gans","dvdv","Alphabet"};
        Arrays.stream(x).filter(o->o.contains("a")).filter(o->o.contains("e")).forEach(System.out::println);
        ArrayList<String> ar = new ArrayList<>();
        ar.add("13");
        ar.add("233");
        ar.add("13");
        ar.add("43");
        ar.add("13");
        ar.removeIf(o -> o.contains("1"));
        System.out.println(ar);

    }

     static boolean check(String o){
        if(o.contains("1")){
            return true;
        }
         return false;
     }
    static final UnaryOperator<Integer> count = new UnaryOperator<Integer>() {
        @Override
        public Integer apply(Integer x) {
            return x == 0
                    ? 0
                    : x + Tester2.count.apply(x - 1);
        }
    };
}