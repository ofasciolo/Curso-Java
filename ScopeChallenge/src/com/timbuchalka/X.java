package com.timbuchalka;

import java.util.Scanner;

public class X {

    public int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 1; x < 13; x++){
            System.out.println(x * this.x);
        }
    }
}
