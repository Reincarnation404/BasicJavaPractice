package org.example;

import java.util.Arrays;

import static java.lang.Math.pow;

public class ch7_practice {
    public static void main(String[] args) {
        //1
        System.out.println("Q1:");
        greeting(2);

        //2
        System.out.println("\nQ2:");
        System.out.println("to_upper('a')="+to_upper('a'));
        System.out.println("to_upper('%')="+to_upper('%'));
        System.out.println("to_upper('Z')="+to_upper('Z'));

        //3
        System.out.println("\nQ3:");
        int cubic = cubic(5);
        System.out.println("cubic(5)="+cubic);

        //4
        System.out.println("\nQ4:");
        int s04 = sum(10);
        System.out.println("sum(10)="+s04);

        //5
        System.out.println("\nQ5:");
        double f = fahrenheit(50.0);
        System.out.println("攝氏50.0度= 華氏"+f+"度");

        //6
        System.out.println("\nQ6:");
        boolean b = is_even(5);
        if(!b){System.out.println("不4偶數");
        }else {System.out.println(" 4偶數");}

        //7
        System.out.println("\nQ7:");
        System.out.print("1~100間,是偶數且可被9整除的數=");
        for(int i=1; i<=100; i++){
            if(is_even(i) && i%9 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //8
        System.out.println("\nQ8:");
        factors(20);
        factors(5);

        //9
        System.out.println("\nQ9:");
        if (!is_prime(17)){
            System.out.println("不4質數");
        }else {
            System.out.println(" 4質數");
        }

        //10
        System.out.println("\nQ10:");
        primes(20);

        //11
        System.out.println("\nQ11:");
        System.out.println("gcd(12,16)最大公因數="+gcd(12,16));

        //12
        System.out.println("\nQ12:");
        System.out.println("lcm(12,16)最小公倍數="+lcm(12,16));

        //13
        System.out.println("\nQ13:");
        System.out.println("area(2.0)="+area(2.0));

        //14
        System.out.println("\nQ14:");
        System.out.println("-5的絕對值="+abs(-5));
        System.out.println("3的絕對值="+abs(3));

        //15
        System.out.println("\nQ15:");
        System.out.println("min(3,5)的最小值="+min(3,5));
        System.out.println("min(3,-1)的最小值="+min(3,-1));
        System.out.println("min(0,5)的最小值="+min(0,5));

        //16
        System.out.println("\nQ16:");
        int[] array = {8,6,9,12,47,55,10};
        int[] array2 = {11,6,9,13,47,52,17};
        System.out.println("array奇數有"+odd(array)+"個");
        System.out.println("array2奇數有"+odd(array2)+"個");

        //17
        System.out.println("\nQ17:");
        int[] arr17={75,29,38,45,16};
        System.out.println("arr17的min="+min(arr17));

        //18
        System.out.println("\nQ18:");
        System.out.println("arr17的min Index="+argMin(arr17));

        //19
        System.out.println("\nQ19:");
        int[][] arr19={{75,89,10},{38,45,16}};
        System.out.println("arr19的max="+max(arr19));

        //20
        System.out.println("\nQ20:");
        int[][] arr20={{12,19,14},{18,45,46}};
        System.out.println("arr20="+ Arrays.toString(argMax(arr20)));

        //21
        System.out.println("\nQ21:");
        int[] arr21={7,3,2,4,5};
        System.out.println("arr21最大值*最小值="+product(arr21));

        //22
        System.out.println("\nQ22:");
        int[][] arr22={{2,4,6},{1,3,5},{8,9}};
        System.out.println("arr22的平均值="+mean(arr22));

        //23
        System.out.println("\nQ23:");
        int[][] arr23={{1,3,5},{8,9,2}};
        square(arr23);
        System.out.println("now arr23="+ Arrays.deepToString(arr23));

        //24   //未完成
        System.out.println("\nQ24:");
        int[][] arr24={{1,3,5},{8,9,2}};
        System.out.println("arr24元素平方="+ Arrays.deepToString(square24(arr24)));
        System.out.println("原本的arr24="+ Arrays.deepToString(arr24));

        //25
        System.out.println("\nQ25:");
        System.out.println("fib_for(6)="+fib_for(6));

        //26
        System.out.println("\nQ26:");
        System.out.println("power(5.0, 3)="+power(5.0,3));

        //27
        System.out.println("\nQ27:");
        System.out.println("sum27(100)="+sum27(100));

        //28
        System.out.println("\nQ28:");
        System.out.println("sum28(5)="+sum28(5));

        //29
        System.out.println("\nQ29:");
        System.out.println("triangle(6,3) area="+triangle(6,3));
        System.out.println("triangle(4.2f,3.3f) area="+triangle(4.2f,3.3f));

        //30
        System.out.println("\nQ30:");
        System.out.println("max(8,2)'s maximum="+max(8,2));
        System.out.println("max(1,5,9)'s maximum="+max(1,5,9));

        //31
        System.out.println("\nQ31:");
        int[] arr31={12,7,32,67};
        System.out.println("smallest(8,9)'s minimum="+smallest(8,9));
        System.out.println("smallest(arr31)'s minimum="+smallest(arr31));

        //32
        System.out.println("\nQ32:");
        System.out.println("area(2)="+area(2));
        System.out.println("area(2.3)="+area(2.3));

    }
    static void greeting(int a){
        for(int i=1; i<=a; i++){
            System.out.println("Hello Java!");
        }
    }   //1

    static char to_upper(char c){
        if(c>=65 && c<91){
            return (char) (c+32);
        }else if(c>=97 && c<123){
            return (char) (c-32);
        }else {
            return '@';
        }
    }   //2

    public static int cubic(int x){return (int) pow(x,3);}   //3

    static int sum(int s){
        int sum04=0;
        for (int i=1; i<=s; i++){
            sum04+=i;
        }return sum04;
    }   //4

    static double fahrenheit(double c){
        return (((double) 9 /5)*c)+32;
    }   //5

    static boolean is_even(int a){
        if(a%2 == 0){
            return true;
        }else {
            return false;
        }
    }   //6&7

    static void factors(int a){
        for (int i=1; i<=a; i++){
            if (a%i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }   //8

    static boolean is_prime(int a){
        int count=0;
        for(int i=1; i<=a; i++){
            if (a%i == 0){
                count++;
            }
        }
        if (count==2){
            return true;
        }else {return false;}
    }   //9

    static void primes(int a){
        for(int i=1; i<=a; i++){
            if(is_prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }   //10

    static int gcd(int a, int b){
        int max=0;
        for(int i=2; i<=b; i++){   //i要從2開始,從1的話,if的條件會always true
            if(a%i == 0 && b%i == 0){
                max = i;
            }
        }
        return max;
    }   //11

    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }   //12

    static double area(double r){
        return r*r*3.14;
    }   //13&32

    static int abs(int a){
        if (a<0){
            return a*-1;
        }else {return a;}
    }   //14

    public static int min(int a, int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }   //15

    public static int odd(int[] arr){
        int count=0;
        for(int i:arr){
            if(i%2 != 0){
                count++;
            }
        }
        return count;
    }   //16

    static int min(int[] a){
        int min=a[0];
        for(int i: a){
            if(i<min){
                min = i;
            }
        }
        return min;
    }   //17

    static int argMin(int[] a){
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<a[0]){
                min = i;
            }
        }
        return min;
    }   //18

    static int max(int[][] a){
        int max=0;
        for (int[] row: a){  //row=a的一行
            for(int i: row){  //i=一行(row)裡的某個元素
                if(i>max){
                    max = i;
                }
            }
        }
        return max;
    }   //19

    static int[] argMax(int[][] a){
        int max=0;
        int[] maxArg = new int[2];
        for(int r=0; r<a.length; r++){   //r=列
            for (int c=0; c<a[r].length; c++){   //c=行
                if(a[r][c]>max){
                    max = a[r][c];
                    maxArg[0]=r;
                    maxArg[1]=c;
                }
            }
        }
        return maxArg;

    }   //20

    static int product(int[] a){
        int max=0;
        for (int i: a){
            if(i>max){
                max = i;
            }
        }
        return max*min(a);
    }   //21

    static double mean(int[][] a){
        double sum=0;
        int count=0;
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                sum+=a[i][j];
                count++;
            }
        }
        return sum/count;
    }   //22

    static void square(int[][] a){
        for (int[] row:a){
            for(int i: row){
                System.out.print(i*i+" ");
            }
            System.out.println();
        }
    }   //23

    static int[][] square24(int[][] a){
        int[][] newA = new int[a.length][];
        for(int r=0; r<a.length; r++){
            newA[r] = new int[a[r].length];   //沒有這句會出現: Cannot store to int array because "newA[r]" is null
            for (int c=0; c<a[r].length; c++){
                newA[r][c]=(int)pow(a[r][c],2);
            }
        }
        return newA;
    }   //24

    public static long fib_for(int n){
        //遞迴
        if (n>2){
            return fib_for(n-1)+fib_for(n-2);
        }else {
            return 1;
        }
        //for迴圈
//        for(int i=){
//
//        }
    }   //25

    static double power(double a, int b){
        if (b==0){
            return 1;
        }else{
            return a*power(a,b-1);
        }
    }   //26

    static int sum27(int n){
        if(n==1){return 1;}
        else {return n+sum27(n-1);}
    }   //27

    static int sum28(int n){
        if(n==1){return 0;}
        else {return n*(n-1)+sum28(n-1);}
    }   //28

    static float triangle(int base, int height){
        return (float) (base * height) /2;
    }
    static float triangle(float base, float height){
        return (float) (base * height) /2;
    }   //29

    static int max(int a, int b){
        if (a>b){
            return a;
        }else {return b;}
    }
    static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if (b>a && b>c){
            return b;
        }else {return c;}
    }   //30

    static int smallest(int a,int b){
        if (a>b){
            return b;
        }else {return a;}
    }
    static int smallest(int[] a){
        return min(a);
    }   //31

    static int area(int a){
        return (int) (a*a*3.14);
    }   //32
}

