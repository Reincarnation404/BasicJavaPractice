package org.example;

// Press Shift twice = find
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a=4; int b=2;
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a<<b);
        System.out.println(a<b);
        System.out.println(a>b);

        double ff =3.078;
        System.out.println((int)ff);
        int a1 = Integer.MAX_VALUE;
        System.out.println((double) a1);


        for(int i=0; i<7; i+=2){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<7; i+=2){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }




    }

}
