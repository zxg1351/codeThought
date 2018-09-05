package com.zxgparent.demo.mindview;

public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
        public final E fifth;


    public FiveTuple(A first, B second, C third, D fourth, E fifth) {
        super(first, second, third, fourth);
        this.fifth = fifth;
    }

    @Override
    public String toString(){
        return "("+first+","+second+","+third+","+fourth+","+fifth+")";
    }

}
