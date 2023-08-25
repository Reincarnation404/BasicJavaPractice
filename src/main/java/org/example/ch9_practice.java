package org.example;

public class ch9_practice {
    public static void main(String[] args) {
        //1
        Rectangle r1 = new Rectangle();
        r1.show();
        Rectangle r2 = new Rectangle(2,3);
        r2.show();

        //3
        Caaa obj1 = new Caaa();
        Caaa obj2 = new Caaa(12);
        System.out.println(obj1.get_value());
        System.out.println(obj2.get_value());
        obj1.set_value(2);
        obj2.set_value(300);
        System.out.println(obj1.get_value());
        System.out.println(obj2.get_value());

        //5
        int[][] a={{12,54,23},{21,12,25}};
        Average aver = new Average(a);
        aver.print_avg();
        aver.print_arr();

        //7
        Summation.add(5);
        Summation.add(10);

        //9
        int[] a2={-4,190,300,12,-7,8};
        int[] b2={0,2,4,3,6,7};
        MyClip obj = new MyClip(0,255);
        obj.clip(a2);
        obj.print_arr(a2);
        obj.set_range(3,5);
        obj.clip(b2);
        obj.print_arr(b2);

        //11
        Fraction f = new Fraction(5,3);
        f.show();
        f.setN(7);
        f.setD(12);
        f.show();
        f.setND(100,120);
        f.show();
        //13
        Fraction f1 = new Fraction(3,5);
        Fraction f2 = new Fraction(1,4);
        Fraction result = f1.add(f2);
        result.show();
        //14
        Fraction f3 = new Fraction(2,3);
        Fraction f4 = new Fraction(1,2);
        Fraction f5;
        f5=Fraction.compare(f3,f4);
        f5.show();
        //15


        //17  //詳解  //題目改自CH9_12
        Circle[] cir = new Circle[3];
        double[] r={1.0,4.0,2.0};
        for(int i=0;i<cir.length;i++){  //將r的值指派給對應的cir[i]
            cir[i]=new Circle(r[i]);
            cir[i].show();
        }

        //19
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
        width = 1;
        height = 1;
    }

    void show(){
        System.out.println("W="+width+"\nH="+height);
    }
}

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
}

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

}

class Summation{

    //記得寫static 不然無法用類別呼叫
    static void add(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

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
}

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

    }
}

class Circle{
    private static double pi=3.14;
    private double radius;

    public Circle(double r){       // Circle建構子
        radius=r;
    }
    public void show(){
        System.out.printf("area=%6.2f\n",pi*radius*radius);
    }
}

class Data{
    private String name;
    private Test test;

    public Data(String na, int eng, int ma) {
        name = na;
        test = new Test(eng, ma);
    }

    void show(){
        System.out.println("name:"+name+"\neng:"+test.english+"\nmath:"+test.math);
        System.out.println("avg:"+test.avg());
    }

    private class Test{
        private int english;
        private int math;

        public Test(int eng, int ma) {
            english = eng;
            math = ma;
        }

        double avg(){
            return (double) (math + english) /2;
        }

    }
}