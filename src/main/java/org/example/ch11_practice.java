package org.example;

public class ch11_practice {
    public static void main(String[] args) {
        //1
        System.out.println("Q1:");
        Cbb bb = new Cbb(2);
        bb.show();

        //2
        System.out.println("\nQ2:");
        compute1102 compute1102 = new compute1102();
        compute1102.mul(3,5);
        compute1102.show();

        //3
        System.out.println("\nQ3:");
        Win w = new Win(5,7);
        w.show();

        //4
        System.out.println("\nQ4:");
        compute1104 compute1104 = new compute1104();
        compute1104.div(4,2);
        compute1104.show();

        //5
        System.out.println("\nQ5:");
        Ccc obj = new Ccc();
        obj.set(5);
        obj.show();

        //6
        System.out.println("\nQ6:");
        win1106 win1106 = new win1106("red",5,7);
        win1106.show();

        //7
        System.out.println("\nQ7:");
        compute1107 com = new compute1107();
        com.mul(3,5);
        com.show();
        com.mod(14,5);
        com.show();
        com.fac(5);
        com.show();
        com.pow(5,2);
        com.show();

        //8
        System.out.println("\nQ8:");
        stu1108 stu1108 = new stu1108("940001","Fiona",90,92,85);
        stu1108.show();

        //9
        System.out.println("\nQ9:");
        iWin iw = new iWin(5,7,"green");
        iw.show();

        //10
        System.out.println("\nQ10:");
        Stu stu = new Stu("Judy",58,91);
        stu.show();
        Stu stu2 = new Stu("Tiv",60,95);
        stu2.show();
        Stu stu3 = new Stu("Ann",77,35);
        stu3.show();

        //11
        System.out.println("\nQ11:");
        compute1111 compute1111 = new compute1111();
        compute1111.sub(6,4);
        compute1111.show();

        //12
        System.out.println("\nQ12:");
        circle3 ccc = new circle3(8,6,2);
        ccc.showData();
        //13  把circle3的showData()和vol()移到Sphere
        System.out.println("Q13:");
        circle4 cccc = new circle4(5,7,1);
        cccc.showData();

        //14
        System.out.println("\nQ14:");
        circle1114 circle1114 = new circle1114();
        triangle1114 triangle1114 = new triangle1114();
        coin1114 coin1114 = new coin1114();
        boolean status1114;
        status1114 = (circle1114 instanceof coin1114);
        System.out.println("circle1114 instanceof coin1114? "+status1114);
        status1114 = (triangle1114 instanceof shape1114);
        System.out.println("triangle1114 instanceof shape1114? "+status1114);
        status1114 = (coin1114 instanceof Object);
        System.out.println("coin1114 instanceof Object? "+status1114);

        //15 類別關係的判別
        System.out.println("\nQ15:");
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
}   //1

abstract class MyMath1102{
    protected int ans;
    public void show(){
        System.out.println("ans="+ans);
    }
    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
    public abstract void div(int a,int b);
}
class compute1102 extends MyMath1102{

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
}   //2

abstract class Shapee{
    protected int width;
    protected int height;

    public Shapee(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void show(){
        System.out.println("width="+width+", height="+height+", area="+area());
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

}   //3

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
}    //5

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
class compute1104 implements MyMath{
    int ans;

    @Override
    public void show() {
        System.out.println("ans="+ans);
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
}
class compute1107 implements MyMath, AdvancedMath{
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
}    //7&4

interface Data1108{
    void showData();
}
interface Test1108{
    void showScore();
    double calcu();
}
class stu1108 implements Data1108,Test1108{
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;

    public stu1108(String id, String name, int mid, int finl, int common) {
        this.id = id;
        this.name = name;
        this.mid = mid;
        this.finl = finl;
        this.common = common;
    }

    @Override
    public void showData() {
        System.out.println("name="+name+", id="+id);
    }

    @Override
    public void showScore() {
        System.out.println("mid="+mid+", finl="+finl+", common="+common);
    }

    @Override
    public double calcu() {
        return (mid*0.3)+(finl*0.3)+(common*0.4);
    }
    void show(){
        showData();
        showScore();
        System.out.println("avg="+calcu());
    }
}    //8

interface iShape{
    void show();
    int area();
}
interface iColor{
    void showColor();
}
class color1106{
    String color;

    public color1106(String s) {
        color = s;
    }
}
class win1106 extends color1106 implements iShape{

    int width;
    int height;

    public win1106(String s, int w, int h) {
        super(s);
        width = w;
        height = h;
    }

    @Override
    public void show() {
        System.out.println("width="+width+", height="+height+", color="+color+", area="+area());
    }

    @Override
    public int area() {
        return width*height;
    }
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
        System.out.println("width="+width+", height="+height+", area="+area());
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
}   //9&6

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
        System.out.println("name="+name+", math="+math+", english="+english);
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
}   //10

interface show_ans{
    public void show();
}
interface MyMath1111 extends show_ans{
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
}
class compute1111 implements MyMath1111{
    int ans;
    int a;
    int b;

    @Override
    public void show() {
        System.out.println("Q11 ans="+ans);
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
}    //11

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
        System.out.println("球心: ("+x+", "+y+"), 半徑: "+r);
        System.out.println("球體積:"+vol());
    }
    @Override
    public double vol() {
        return (double) 4 /3*PI*Math.pow(r,3);
    }
}   //12

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
}   //13

class shape1114{}
class circle1114 extends shape1114{}
class triangle1114 extends shape1114{}
class coin1114 extends circle1114{}
