package com.company;

import java.math.BigInteger;


public class FactorialThread extends Thread{
    int num;

    public FactorialThread(String name, int num) {
        super(name);
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(getName()+" is running");
        System.out.println(getName()+"factorial of " + num +" is..."+factorial(num));
    }

    BigInteger factorial (long number) {
        if (number == 0 || number == 1) {
            return BigInteger.valueOf(1);
        }
        return factorial(number - 1).multiply(BigInteger.valueOf(number));
    }
}
