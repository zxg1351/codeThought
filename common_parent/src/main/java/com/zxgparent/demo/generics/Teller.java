package com.zxgparent.demo.generics;

import com.zxgparent.demo.test.Generator;

public class Teller {
    private static long counter = 1;
    private final long id = counter++;

    public Teller() {
    }
    @Override
    public String toString(){
        return "Teller"+id;
    }

    public static Generator<Teller> generator(){
        return new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }

}
