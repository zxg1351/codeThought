package com.zxgparent.demo.generics;

import java.util.EnumSet;
import java.util.Set;

import static com.zxgparent.demo.generics.Sets.*;


public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIANT_RED,Watercolors.VIRIDIAM_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAM_BLUE_HUE,Watercolors.BURNT_UMBER);

        System.out.println("set1"+set1);
        System.out.println("set2"+set2);
        System.out.println("union(set1,set2):"+ union(set1,set2));
        Set<Watercolors> subset = intersection(set1,set2);

        System.out.println("intersection(set1,set2):"+subset);
        System.out.println("difference(set1,subset):"+difference(set1,subset));
        System.out.println("difference(set2,subset):"+difference(set2,subset));
        System.out.println("complment(set2,subset):"+complment(set1,set2));
    }
}
