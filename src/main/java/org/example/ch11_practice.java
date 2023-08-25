package org.example;

public class ch11_practice {
    public static void main(String[] args) {
        //1
        Cbb bb = new Cbb(2);
        bb.show();

        //3
        Win w = new Win(5,7);
        w.show();

        //5
        Ccc obj = new Ccc();
        obj.set(5);
        obj.show();

        //7
        compute com = new compute();
        com.mul(3,5);
        com.show();
        com.mod(14,5);
        com.show();
        com.fac(5);
        com.show();
        com.pow(5,2);
        com.show();

        //9
        iWin iw = new iWin(5,7,"green");
        iw.show();

        //11
        Stu stu = new Stu("Judy",58,91);
        stu.show();
        Stu stu2 = new Stu("Tiv",60,95);
        stu2.show();
        Stu stu3 = new Stu("Ann",77,35);
        stu3.show();

        //12
        circle3 ccc = new circle3(8,6,2);
        ccc.showData();
        //13  把circle3的showData()和vol()移到Sphere
        circle4 cccc = new circle4(5,7,1);
        cccc.showData();

        //15 類別關係的判別
        boolean status;
        Object o = null;
        status = (o instanceof Object);
        System.out.println("null instanceof Object? "+status);
    }
}

abstract class Caa{
    protected int num;

    public Caa(int n) {
        num = n;
    }

    public abstract void show();
}
class Cbb extends Caa{

    public Cbb(int n) {
        super(n);
    }

    @Override
    public void show() {
        System.out.println("num="+num);
    }
}

abstract class Shapee{
    protected int width;
    protected int height;

    public Shapee(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void show(){
        System.out.println("width="+width+"\nheight="+height+"\narea="+area());
    }
    public abstract int area();
}
class Win extends Shapee{

    public Win(int width, int height) {
        super(width, height);
    }

    @Override
    public int area() {
        return width*height;
    }

}

interface iAaa{
    public void show();
}
class Bbb{
    public int num = 10;
    public void set(int n){
        num = n;
    }
}
class Ccc extends Bbb implements iAaa{

    @Override
    public void show() {
        System.out.println("num="+num);
    }
}

interface MyMath{
    void show();
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}
interface AdvancedMath{
    void mod(int a, int b);
    void fac(int a);
    void pow(int a, int b);
}
class compute implements MyMath, AdvancedMath{
    int ans;

    @Override
    public void show() {
        System.out.println("result="+ans);
    }
    @Override
    public void add(int a, int b) {
        ans = a+b;
    }
    @Override
    public void sub(int a, int b) {
        ans = a-b;
    }
    @Override
    public void mul(int a, int b) {
        ans = a*b;
    }
    @Override
    public void div(int a, int b) {
        ans = a/b;
    }
    @Override
    public void mod(int a, int b) {
        ans = a%b;
    }
    @Override
    public void fac(int a) {
        int sum = 1;
        for (int i=1; i<=a; i++){
            sum*=i;
        }
        ans = sum;
    }
    @Override
    public void pow(int a, int b) {
        int sum = 1;
        for (int i=1; i<=b; i++){
            sum*= a;
        }
        ans = sum;
    }
}

interface iShape{
    void show();
    int area();
}
interface iColor{
    void showColor();
}
class iWin implements iShape,iColor{

    int width,height;
    String color;

    public iWin(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void show() {
        System.out.println("width="+width+"\nheight="+height+"\narea="+area());
        showColor();
    }
    @Override
    public int area() {
        return width*height;
    }
    @Override
    public void showColor() {
        System.out.println("color="+color);
    }
}

interface data_score{
    void best();
    void failed();
}
interface Test extends data_score{
    void showData();
    double average();
}
class Stu implements Test{
    protected String name;
    protected int math;
    protected int english;

    public Stu(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    @Override
    public void best() {
        if (math>english){
            System.out.println(name+"的數學比英文好");
        }else{
            System.out.println(name+"的英文比數學好");
        }
    }
    @Override
    public void failed() {
        if (math<60){
            System.out.println(name+"的數學被當ㄌ");
        } else if (english<60) {
            System.out.println(name+"的英文被當ㄌ");
        }else {
            System.out.println(name+"歐趴!");
        }
    }
    @Override
    public void showData() {
        System.out.println("name="+name+"\nmath="+math+"\nenglish="+english);
        System.out.println("average="+average());
    }
    @Override
    public double average() {
        return (double) (math + english) /2;
    }
    void show(){
        showData();
        best();
        failed();
    }
}

//12
interface iVolume{
    void showData();
    double vol();
}
abstract class Sphere implements iVolume{
    final double PI = 3.14;
    protected int x;
    protected int y;
}
class circle3 extends Sphere {

    int r;

    public circle3(int x, int y,int r) {
        this.r = r;
        this.x = x;
        this.y = y;
    }


    @Override
    public void showData() {
        System.out.println("球心: ("+x+", "+y+")\n半徑: "+r);
        System.out.println("球體積:"+vol());
    }
    @Override
    public double vol() {
        return (double) 4 /3*PI*Math.pow(r,3);
    }
}
//13
abstract class Sphere2 implements iVolume{
    final double PI = 3.14;
    protected int x;
    protected int y;
    protected int r;

    public void showData() {
        System.out.println("球心: ("+x+", "+y+")\n半徑: "+r);
        System.out.println("球體積:"+vol());
    }
    public double vol() {
        return (double) 4 /3*PI*Math.pow(r,3);
    }
}
class circle4 extends Sphere2 {
    public circle4(int x, int y,int r) {
        this.r = r;
        this.x = x;
        this.y = y;
    }
}

