package com.zxgparent.demo.generics;

import com.zxgparent.demo.test.Generator;

public class Customer {
    private static long counter =1;
    private final long id = counter++;

    public Customer() {
    }
    @Override
    public String toString(){
        return "Custom"+id;
    }

    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}
