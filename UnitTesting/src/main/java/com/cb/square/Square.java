package com.cb.square;

public class Square {
    public int calculate(int x) {
        if(x < 0){
            throw new IllegalArgumentException("number is minus");
        }
        return x*x;
    }

}
