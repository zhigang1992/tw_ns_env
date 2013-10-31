package com.thoughtworks.ns.env;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int sum(int... toSums) {
        int total = 0;
        for (int i : toSums) {
            total += i;
        }

        return total;
    }
}

