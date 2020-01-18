package uk.info.sda.javalon3;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Zadanie {

    public void metodaZeStrumieniem() {

        IntStream.range(0,10).count();

       /* int sum = IntStream.range(1,10).filter(new IntPredicate() {
            @Override
            public boolean test(int value) {

             *//*   if (value % 2 == 1) {
                return true;
                    } else {
                        return false;
                        }*//*
             return  value % 2 == 1;
                    }

        }).sum();*/                                    // zrobione klasa anonimowa

        int n = 3;

        int sum = IntStream.range(1,n*2).filter(value -> value % 2 == 1).sum();
                                                              // zrobione lambdami

        int sum2 = IntStream.iterate(1, i -> i+2).limit(n).sum();

        System.out.println(sum);

        int sum1 = IntStream.iterate(2, i -> i + 2).filter(i -> i % 6 !=0).limit(n).sum();
        System.out.println(sum1);

        int m = 12;

        int sum3 = IntStream.range(m+1, m+n).sum();
        System.out.println(sum3);

    }
}
