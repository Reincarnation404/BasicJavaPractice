package org.example;

public class ch9_practice {
    public static void main(String[] args) {
        //1
        System.out.println("Q1:");
        Rectangle r1 = new Rectangle();
        r1.show();
        Rectangle r2 = new Rectangle(2,3);
        r2.show();
        //2
        System.out.println("Q2:");
        Rectangle r3 = new Rectangle();
        r3.show();

        //3
        System.out.println("\nQ3:");
        Caaa obj1 = new Caaa();
        Caaa obj2 = new Caaa(12);
        System.out.println(obj1.get_value());
        System.out.println(obj2.get_value());
        obj1.set_value(2);
        obj2.set_value(300);
        System.out.println(obj1.get_value());
        System.out.println(obj2.get_value());

        //4
        System.out.println("\nQ4:");
        int[] a4 = {12, 54, 23, 17,90};
        MinMax minMax = new MinMax(a4);
        minMax.find_min_max();

        //5
        System.out.println("\nQ5:");
        int[][] a={{12,54,23},{21,12,25}};
        Average aver = new Average(a);
        aver.print_avg();
        aver.print_arr();

        //6
        System.out.println("\nQ6:");
        Count count1 = new Count();
        Count count2 = new Count();
        Count.show_cnt();
        Count.setZero();
        Count.show_cnt();
        Count.setValue(10);
        Count.show_cnt();

        //7
        System.out.println("\nQ7:");
        Summation.add(5);
        Summation.add(10);

        //8
        System.out.println("\nQ8:");
        Math08 math1 = new Math08();
        Math08 math2 = new Math08();
        math1.mypower(2,5);
        math2.mypower(3,4);

        //9
        System.out.println("\nQ9:");
        int[] a2={-4,190,300,12,-7,8};
        int[] b2={0,2,4,3,6,7};
        MyClip obj = new MyClip(0,255);
        obj.clip(a2);
        obj.print_arr(a2);
        obj.set_range(3,5);
        obj.clip(b2);
        obj.print_arr(b2);

        //11
        System.out.println("\nQ11:");
        Fraction f = new Fraction(5,3);
        f.show();
        f.setN(7);
        f.setD(12);
        f.show();
        f.setND(100,120);
        f.show();
        //12
        //要改寫範例
        //13
        System.out.println("Q13:");
        Fraction f1 = new Fraction(3,5);
        Fraction f2 = new Fraction(1,4);
        Fraction result = f1.add(f2);
        result.show();
        //14
        System.out.println("Q14:");
        Fraction f3 = new Fraction(2,3);
        Fraction f4 = new Fraction(1,2);
        Fraction f5;
        f5=Fraction.compare(f3,f4);
        f5.show();
        //15
        System.out.println("Q15:");
        f3.larger(f4);

        //17  //詳解  //題目改自CH9_12
        System.out.println("\nQ17:");
        Circle[] cir = new Circle[3];
        double[] r={1.0,4.0,2.0};
        for(int i=0;i<cir.length;i++){  //將r的值指派給對應的cir[i]
            cir[i]=new Circle(r[i]);
            cir[i].show();
        }
        System.out.println("Q16:");
        System.out.println("avg radius="+Circle.average(cir));

        //18
        System.out.println("\nQ18:");
        NameCard tom = new NameCard("Tom","here");
        tom.setPhone("345-7612","0971-666000");
        tom.show();

        //19&20
        System.out.println("\nQ19&20:");
        Data stu= new Data("Annie",85,92);
        stu.show();



    }
}

class Rectangle{
    int width;
    int height;

    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
    public Rectangle() {
        this(1,1);
    }

    void show(){
        System.out.println("W="+width+", H="+height);
    }
}   //1&2

class Caaa{
    private int value;

    public Caaa() {
        value = 1;
    }
    public Caaa(int i) {
        value = i;
    }


    void set_value(int n){
        value = n;
    }
    int get_value(){
        return value;
    }
}   //3

class MinMax{
    private int[] arr;

    public MinMax(int[] a) {
        arr = a;
    }

    void find_min_max(){
        int max = 0, min =arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            } else if (arr[i]<min) {
                arr[i]=min;
            }
        }
        System.out.println("min="+min+", max="+max);
    }
}   //4

class Average{
    private int[][] arr;
    private double avg;

    public Average(int[][] a) {
        arr = a;
        int count = 0;
        int sum = 0;
        for (int[] i:arr){
            for(int j:i){
                sum+=j;
                count++;
            }
        }

        avg = (double) sum /count;
                   // 不能除以a.length
        // 二維陣列名稱後直接加上 length（如 arr.length），所指的是有幾列（Row）；指定索引後加上 length（如 arr[0].length），指的是該列所擁有的元素，也就是行（Column）數目。
    }

    void print_avg(){
        System.out.println("avg="+avg);
    }
    void print_arr(){
        for (int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}   //5

class Count{
    private static int cnt = 0;

    public Count() {
        cnt++;
    }

    public static void setZero(){
        cnt=0;
    }
    public static void setValue(int n){
        cnt = n;
    }
    public static void show_cnt(){
        System.out.println("建立了"+cnt+"個物件");
    }
}   //6

class Summation{

    //記得寫static 不然無法用類別呼叫
    static void add(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}   //7

class Math08{
    int pow = 1;  //要設成1, 不然會一直乘與0

    void mypower(int x,int n){
        if(n == 0){
            pow = 1;
            System.out.println(x+"的"+n+"次方 = "+pow);
        }else{
            for(int i=1; i<=n; i++){
                pow*=x;
            }
            System.out.println(x+"的"+n+"次方 = "+pow);
        }

    }
}   //8

class MyClip{
    private static int low;
    private static int high;

    public MyClip(int lo, int hi) {
        low = lo;
        high = hi;
    }

    public void set_range(int lo, int hi){
        low = lo;
        high = hi;
    }
//    void clip(int[] arr){
//        for(int i: arr){
//            if (i>high){
//                i = high;
//            }else if (i<low){
//                i = low;
//            }
//        }
//    }
    void clip(int[] arr){
        for(int i=0; i< arr.length; i++){
            if(arr[i]>high)
                arr[i]=high;
            else if(arr[i]<low)
                arr[i]=low;
        }
    }
    void print_arr(int[] arr){
        for (int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
}   //9

class Fraction{
    private int num,den;

    public Fraction(int n, int d) {
        num = n;
        den = d;
    }

    public void setN(int n){
        num=n;
    }
    public void setD(int d){
        den=d;
    }
    public void setND(int num, int den){
        this.num = num;
        this.den = den;
    }
    public void show(){
        System.out.println(num+"/"+den);
    }
    public Fraction add(Fraction f){  //詳解
        int new_num=this.num*f.den+this.den*f.num;
        int new_den=this.den*f.den;
        return new Fraction(new_num,new_den);
    }
    public static Fraction compare(Fraction f1, Fraction f2){
        int f1_new_num = f1.num* f2.den;
        int f2_new_num = f2.num* f1.den;
        if (f1_new_num>f2_new_num)
            return f1;
        else
            return f2;
    }
    void larger(Fraction f2){
        if((double)this.num/this.den > (double) f2.num / f2.den){
            System.out.println("前者大");
        }else {
            System.out.println("後者大");
        }
    }
}   //11&13&14&15

class Circle{
    private static double pi=3.14;
    private double radius;

    public Circle(double r){       // Circle建構子
        radius=r;
    }

    public void show(){
        System.out.printf("area=%6.2f\n",pi*radius*radius);
    }
    public static double average(Circle[] c){
        double sum=0.0;
        for(int i=0; i<c.length; i++){
            sum+=c[i].radius;
        }
        return sum/c.length;
    }
}   //16&17

class NameCard{
    private String name;
    private String address;
    private Phone data;

    public NameCard(String na, String ad) {
        name = na;
        address = ad;
        data = new Phone();
    }


    void show(){
        System.out.println("name="+name);
        System.out.println("address="+address);
        System.out.println("tel="+data.tel);
        System.out.println("mobile="+data.mobile);
    }
    void setPhone(String te,String mo){
        data.tel = te;
        data.mobile = mo;
    }

    static class Phone{
        String tel;
        String mobile;


    }
}   //18

class Data{
    private String name;
    private Test test;

    public Data(String na, int eng, int ma) {
        name = na;
        test = new Test(eng, ma);
    }

    void show(){
        System.out.println("name:"+name+"\neng:"+test.english+"\nmath:"+test.math);
        System.out.println("avg:"+avg());
    }
    double avg(){
        return (double) (test.math + test.english) /2;
    }

    private class Test{
        private int english;
        private int math;

        public Test(int eng, int ma) {
            english = eng;
            math = ma;
        }

//        20題: 把avg()移出去變外部類別Data的函數
//        double avg(){
//            return (double) (math + english) /2;
//        }

    }
}   //19&20