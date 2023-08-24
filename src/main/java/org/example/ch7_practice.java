package org.example;

public class ch7_practice {
    public static void main(String[] args) {
        //3
        int cubic = cubic(5);
        System.out.println(cubic);

        //15
        System.out.println(min(3,5));
        System.out.println(min(3,-1));
        System.out.println(min(0,5));

        //16
        int[] array = {8,6,9,12,47,55,10};
        int[] array2 = {11,6,9,13,47,52,17};
        System.out.println(odd(array));
        System.out.println(odd(array2));

        //25



    }

    public static int cubic(int x){return (int) Math.pow(x,3);}

    public static int min(int a, int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    public static int odd(int[] arr){
        int count=0;
        for(int i:arr){
            if(i%2 != 0){
                count++;
            }
        }
        return count;
    }

//    public static long fib_for(int n){
//
//
//        for(int i=0;i<=n;i++){
//
//        }
//    }
}

