package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class ch5_practice {
    public static void main(String[] args) {
//        //9
//        Scanner scn9 = new Scanner(System.in);
//        System.out.println("輸入分數：");
//        int grade = scn9.nextInt();
//        if(grade>100 || grade<0){
//            System.out.println("分數範圍錯誤");
//        }else{
//            if(grade>=80){
//                System.out.println("A");
//            }if (grade>=60 && grade<=79){
//                System.out.println("B");
//            }if(grade<59) {
//                System.out.println("C");
//            }
//        }
//
//
//        //12
//        Scanner scn12 = new Scanner(System.in);
//        System.out.println("輸入月份：");
//        int month = scn12.nextInt();
//        if (month>12 || month<1){
//            System.out.println("月份範圍錯誤");
//        }else {
//            switch (month) {
//                case 3, 4, 5 -> System.out.println("spring");
//                case 6, 7, 8 -> System.out.println("summer");
//                case 9, 10, 11 -> System.out.println("fall");
//                case 12, 1, 2 -> System.out.println("winter");
//            }
//        }

//        //15
//        int sum = 1;
//        for(int i=1; i<=10; i++){
//            sum*=i;
//        }
//        System.out.println("Ans:"+sum);
//
//        //16
//        int num = 64;
//        for (int i = 1; i<=num; i++){
//            if (64%i == 0){
//                System.out.println(i);
//            }
//        }

//        //21
//        int fx = 0,i=1;
//        while(fx>=100){
//            fx+=i;
//            i++;
//        }
//        System.out.println(i);

        //23
//        Scanner scn23 = new Scanner(System.in);
//        int input;
//        do{
//            System.out.println("輸入整數：");
//            input = scn23.nextInt();
//            if (input>=0){
//                int output = (int) pow(input,2);
//                System.out.println(output);
//            }
//
//        }while (input>=0);
//        System.out.println("input小於0,結束");
//
//
////        int input = 0;
////        while (input >= 0) {
////            System.out.println("輸入整數：");
////            input = scn23.nextInt();
////
////            if (input >= 0) {
////                int output = (int) Math.pow(input, 2);
////                System.out.println(output);
////            }
////        }
////        System.out.println("input小於0,結束");

//        //24-1
//        for(int i=0; i<5; i++){
//            for(int j=5; j>i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        //24-2
//        for(int i=0; i<5; i++){        // 負責換行
//            for(int j=4; j>i; j--){    // 印空白
//                System.out.print(" ");
//            }
//            for(int k=0; k<=i; k++){   // 印星號
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        System.out.println();
//        //24-3
//        for(int i=0; i<=5; i++){
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            for (int k=4; k>=i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //24-4
//        for(int i=0; i<=4; i++){
//            for(int j=0; j<i; j++){
//                System.out.print("^");
//            }
//            for (int k=4; k>=i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //29
        Scanner scn29 = new Scanner(System.in);
        int password= 6128;
        int n=3;
        System.out.println("請輸入密碼:");
        int input= scn29.nextInt();
        do{
            if(input != password){
                System.out.println("密碼錯誤,還有"+n+"次機會"+":");
                input = scn29.nextInt();
                n--;
            }else{
                System.out.println("密碼正確");
                break;
            }
//            System.out.println("錯誤次輸過多,結束程式");
        }while (n>=1);

    }
}
