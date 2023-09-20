package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class ch5_practice {
    public static void main(String[] args) {

        //4
//        Scanner scn4 = new Scanner(System.in);
//        System.out.println("輸入整數：");
//        int input4 = scn4.nextInt();
//        if(input4<0){
//            System.out.println("絕對值= "+(input4*-1));
//        }else {
//            System.out.println(input4);
//        }

        //5

        //6
//        Scanner scn6 = new Scanner(System.in);
//        System.out.println("輸入整數：");
//        int input6 = scn6.nextInt();
//        if(input6%2 == 0){
//            System.out.println("此數為偶數");
//        }else{
//            System.out.println("此數為奇數");
//        }

        //7
//        Scanner scn7 = new Scanner(System.in);
//        System.out.println("輸入整數：");
//        int input7 = scn7.nextInt();
//        int num = (input7>0)? input7: (input7*-1);
//        System.out.println("result= "+num);

        //8
//        Scanner scn8 = new Scanner(System.in);
//        System.out.println("輸入整數：");
//        int input8 = scn8.nextInt();
//        if(input8%5 == 0 && input8%6 == 0){
//            System.out.println("可被5和6整除");
//        }else {
//            System.out.println("不可被5和6整除");
//        }

        //9
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

        //10
//        Scanner scn10 = new Scanner(System.in);
//        System.out.println("輸入三個整數：");
//        int input10_1 = scn10.nextInt();
//        int input10_2 = scn10.nextInt();
//        int input10_3 = scn10.nextInt();
//        if(input10_1+input10_2>input10_3 && input10_1+input10_3>input10_2 && input10_2+input10_3>input10_1){
//            System.out.println("可以構成三角形");
//        }else{
//            System.out.println("不可以構成三角形");
//        }

        //11
//        Scanner scn11 = new Scanner(System.in);
//        System.out.println("輸入整數day：");
//        int input11 = scn11.nextInt();
//        switch (input11){
//            case 1,2,3,4,5:
//                System.out.println("上班上課");
//                break;
//            case 6,7:
//                System.out.println("休息");
//                break;
//            default:
//                System.out.println("錯誤");
//                break;
//        }

        //12
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

        //13
        System.out.println("Q13:");
        for (int i = 1; i <= 100; i++) {
            if (i % 16 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //14
        System.out.println("\nQ14:");
        int sum14 = 0;
        for (int i = 1; i <= 5; i++) {
            int power = (int) pow(i, 2);
            sum14 += power;
        }
        System.out.println("1~5的平方和=" + sum14);

        //15
        System.out.println("\nQ15:");
        int sum15 = 1;
        for (int i = 1; i <= 10; i++) {
            sum15 *= i;
        }
        System.out.println("Ans:" + sum15);

        //16
        System.out.println("\nQ16:");
        int num = 64;
        for (int i = 1; i <= num; i++) {
            if (64 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //17
        System.out.println("\nQ17:");
        int num17 = 89;
        int count = 0;
        for (int i = 1; i <= num17; i++) {
            if (num17 % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num17 + " 4質數");
        } else {
            System.out.println(num17 + "不4質數");
        }

        //18
        System.out.println("\nQ18:");
        int sum18 = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sum18 -= (int) pow(i, 2);
            } else {
                sum18 += (int) pow(i, 2);
            }
        }
        System.out.println("1^2-2^2+3^2-4^2+...+49^2-50^2=" + sum18);

        //19
        System.out.println("\nQ19:");
        int i19 = 1;
        while (i19 <= 9) {
            int j19 = 1;   // 內層迴圈跑過一遍記得要設回1
            while (j19 <= 9) {
                System.out.print(i19 + "*" + j19 + "=" + i19 * j19 + "\t");
                j19++;
            }
            System.out.println();
            i19++;
        }

        //20
        System.out.println("\nQ20:");
        int num20 = 23983;
        int count20 = 0;
        do {
            count20++;
        } while ((num20/=10) != 0);
        System.out.println("此數為" + count20 + "位數");

        //21
        System.out.println("\nQ21:");
        int sum21 = 0, i21 = 1;
        do {
            sum21 += i21;
            i21++;
        } while (sum21 <= 100);
        System.out.println("n最小值=" + (i21 - 1));

        //22
        System.out.println("\nQ22:");
        int x = 0;
        do {
            x++;
        } while (!((x % 3 == 1) && (x % 5 == 3) && (x % 7 == 2)));
        System.out.println("最少有" + x + "隻兔子");

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

        //24-1
//        for(int i=0; i<5; i++){
//            for(int j=5; j>i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
        //24-2
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
        //24-3
//        for(int i=0; i<=5; i++){
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            for (int k=4; k>=i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //24-4
//        for(int i=0; i<=4; i++){
//            for(int j=0; j<i; j++){
//                System.out.print("^");
//            }
//            for (int k=4; k>=i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //25-1
//        for(int i=0; i<5; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print(j+1);
//            }
//            System.out.println();
//        }
//        System.out.println();
        //25-2
//        for(int i=5; i>=1; i--){
//            for(int j=5; j>=i; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        System.out.println();
        //25-3
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        System.out.println();
        //25-4   //待修
        char ch= '0';
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
        System.out.println();

        //26

        //27
        System.out.println("\nQ27:");
        int xy = 0;
        for (int i=0; i<=100; i++){
            if(i%2==0 && i%3==0 && i%12!=0){
                continue;
            }
            System.out.print(i+" ");
        }


        //28
        System.out.println("\nQ28:");
        int sum28=0;
        int n=0;
        for(int i=1; i<100; i++){
            sum28+=i*i;
            n++;
            if (sum28>320){
                break;
            }
        }
        System.out.println("n="+n);

        //29
//        Scanner scn29 = new Scanner(System.in);
//        int password= 6128;
//        int n=3;
//        System.out.println("請輸入密碼:");
//        int input= scn29.nextInt();
//        do{
//            if(input != password){
//                System.out.println("密碼錯誤,還有"+n+"次機會"+":");
//                input = scn29.nextInt();
//                n--;
//            }else{
//                System.out.println("密碼正確");
//                break;
//            }
//
//        }while (n>=1);
//        if(n<1){
//            System.out.println("錯誤次數太多,結束程式");
//        }

    }
}
