package com.zxgparent.demo.test;

import sun.dc.pr.PRError;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {



    private Class[]  types = {
            Lattee.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class
    };
    private static Random random = new Random(47);

    public CoffeeGenerator() {
    }
    private int size = 0;

    public CoffeeGenerator(int sz){
        size = sz;
    }

    @Override
    public Coffee next() {


        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;

        @Override
        public boolean hasNext() {
            return count>0;
        }

        @Override
        public Coffee next() {
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return  new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator generator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
        for (Coffee c: new CoffeeGenerator(5)
             ) {
            System.out.println(c);

        }
    }
}
