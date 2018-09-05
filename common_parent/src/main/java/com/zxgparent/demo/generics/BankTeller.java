package com.zxgparent.demo.generics;

import com.zxgparent.demo.test.Generators;

import java.util.*;

public class BankTeller {
    public static void serve(Teller t,Customer c){
        System.out.println(t+"server"+c);
    }

    public static void main(String[] args) {

        Random random = new Random(47);
        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line,Customer.generator(),15);
        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers,Teller.generator(),4);
        for (Customer c:line
             ) {
            serve(tellers.get(random.nextInt(tellers.size())),c);
        }
    }
}
