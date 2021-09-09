package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            var thr = new FactorialThread("FacThread#"+i, i);
            thr.run();
        }
    }
}
