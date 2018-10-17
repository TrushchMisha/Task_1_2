package com.trushchmisha;

public class Main {
    public static void main(String[] args){
        byte n = 12;
        System.out.println(n);
        int a = 2147483647;
        System.out.println(a);
        long b = 9223372036854775807L;
        System.out.println(b);

        int c = (int) b;
        System.out.println(c);
        long d = (long) a;
        System.out.println(d);
        double f = 12.4567834567;
        System.out.println(f);
        System.out.println((long) f);
        System.out.println((float) f);
        short k = 2354;
        System.out.println(k);
        System.out.println(a/n);
        System.out.println(a+n);
        System.out.println(a-n);
        System.out.println(a*n);
        a = 15;
        System.out.println(a/n);
        System.out.println(a+n);
        System.out.println(a-n);
        System.out.println(a*n);
        char h = 35;
        System.out.println(h);
        h = 200;
        System.out.println(h);
        h = 'z';
        System.out.println(h);
        System.out.println(Math.floor(f));
        System.out.println(Math.ceil(f));
        System.out.println(Math.sin(30));
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
