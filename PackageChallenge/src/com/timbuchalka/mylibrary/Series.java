package com.timbuchalka.mylibrary;

public class Series {

    public static int nSum(int i){
        return (i * (i + 1)) /2;
    }

    public static int factorial(int i){
        if(i == 0){
            return 1;
        }
        int product = i;
        for (int n = 1; n < i; n++){
            product *= i;
        }

        return product;
    }

    public static int fibonacci(int i){
        if(i== 0){
            return 0;
        } else if(i == 1 || i == 2){
            return 1;
        }

        return fibonacci(i-1) + fibonacci(i-2);
    }
}
