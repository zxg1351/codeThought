package com.zxgparent.demo.generics;

import com.zxgparent.demo.Amphibian;
import com.zxgparent.demo.Vehicle;
import com.zxgparent.demo.mindview.FiveTuple;
import com.zxgparent.demo.mindview.FourTuple;
import com.zxgparent.demo.mindview.ThreeTuple;
import com.zxgparent.demo.mindview.TwoTuple;

import static com.zxgparent.demo.generics.Tuple.tuple;

public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);

    }

    static TwoTuple f2(){
        return tuple("hi",47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 45);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 45, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
