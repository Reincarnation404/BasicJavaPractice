package org.example;

import java.util.Objects;
import java.util.Scanner;

public class ch13_practice {
    public static void main(String[] args) throws NotOddException, IllArgException, Exception520 {
//        //1
//        int num= 12, den= 0;
//        int ans= num/den;
//        System.out.println("end of Q1!");
//        //Q: 是否會印出字串?
//        //A: 不會,因為錯誤發生於前一行
        //2
        int num= 12, den= 0;
        if(den == 0){
            System.out.println("分母不可為0");
        }else {
            int ans= num/den;
            System.out.println("ans"+ans);
        }
        //3
        try {
            int ans= num/den;
            System.out.println("ans"+ans);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }finally {
            System.out.println("end of Q1!");
        }

        //5
        int number = 5;
        int[] d= {3,0,0,1};
        for(int i=0;i<d.length;i++){
            try{
                System.out.println(number+"/"+d[i]+"= "+number/d[i]);
            }catch (Exception e){
                System.out.println("分母為0,不計算");
            }
        }

        //7
        int[] arr={4,12,87,21,6,18};
        int[] den2={2,0,7,0,61,0};
        double sum = 0.0;
        try {
            for (int i=0; i<=6; i++){
                sum+= (double) arr[i] /den2[i];
            }
            System.out.println("sum="+sum);
        }catch (Exception e){
            System.out.println("抓到錯誤ㄌ");
        }

        //9
        try {
            test(6,3);
            test(6,0);
            test(2,2);  //不會執行
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }

        //11
        try{
            TTTest ttTest = new TTTest();
            ttTest.aaa(4,0);
        }
        catch(ArithmeticException e){
            System.out.println(e+" throwed");
        }

//        //12
//        double radius=10.0;
//        double x1=5.3;
//        double y1=6.8;
//        double x2=0.2;
//        double y2=9.5;
//        double dist=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
//        if(dist<=radius){
//            System.out.print("("+x1+","+y1+")");
//            System.out.print("在半徑"+radius);
//            System.out.println(",圓心("+x2+","+y2+")的圓內");
//        }else {
//            System.out.print("("+x1+","+y1+")");
//            System.out.print("不在半徑"+radius);
//            System.out.println(",圓心("+x2+","+y2+")的圓內");
//        }

        //15
        int n=-11;
        try {
            if(n<=0){
                throw new IllArgException();
            }if(n%2 == 0) {
                throw new NotOddException();
            }
            odd(n);
        }catch (IllArgException i){
            System.out.println("N<0無法處理");
        }catch (NotOddException not){
            System.out.println("無法處理偶數");
        }

        //16
        System.out.println("請輸入數字:");
        Scanner sc16 = new Scanner(System.in);
        String input = sc16.next();
        try{
            if(Objects.equals(input, "520")){
                throw new Exception520();
            }else{
                System.out.println(input);
            }
        }catch (Exception520 e520){
            System.out.println("字串520的error");
        }

    }

    static void test(int num, int den){
        System.out.println(num+"/"+den+"="+num/den);
    }
    static void odd(int n) throws IllArgException, NotOddException{
        for(int i = 1;i<=n;i+=2){
            System.out.print(i+" ");
        }System.out.println();
    }
}

//11
class TTTest{
    public void aaa(int a,int b) throws ArithmeticException{
        int c=a/b;
        System.out.println(a+"/"+b+"="+c);
    }
}

//12
//13
class selfmadeException extends Exception{
}

//15
class IllArgException extends Exception{}
class NotOddException extends Exception{}

//16
//17
class Exception520 extends Exception{}
