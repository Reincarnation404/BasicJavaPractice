package org.example;

public class ch10_practice {
    public static void main(String[] args) {
        //1
        System.out.println("Q1:");
        Cbbbb cbbbb = new Cbbbb();
        cbbbb.set_num(5,10);
        cbbbb.show();
        //2
        System.out.println("Q2:");
        Cbbbb cbbbb1 = new Cbbbb();
        Cbbbb cbbbb2 = new Cbbbb(3,9);
        cbbbb1.show();
        cbbbb2.show();

        //3&12
        System.out.println("\nQ3:");
        data2 obj1 = new data2(3,8);
        data2 obj2 = new data2();
        obj1.area();
        obj2.area();
        System.out.println("Q12:");
        data2 obj3 = new data2();
        obj3.area();


        //4
        System.out.println("\nQ4:");
        Cbbbb2 bb =new Cbbbb2(2);
        bb.show();

        //5
        System.out.println("\nQ5:");
        data_tri dt = new data_tri(3,8);
        dt.area();

        //6
        System.out.println("\nQ6:");
        Coin1006 coin1006 = new Coin1006(2.5,10);
        coin1006.show();
        coin1006.print_pi();

        //7
        System.out.println("\nQ7:");
        Caaaa aa = new Cbbbb();
        aa.display();
        //父子都有display(),子的類別會被呼叫

        //8
        cbbbb b1 = new cbbbb();
        cbbbb b2 = new ccccc();
//        ccccc c1 = new caaaa();
//        ccccc c2 = new cbbbb();

        //9
        System.out.println("\nQ9:");
        Circle2 c = new Circle2(1);
        Circle2 c2 = new Circle2(2);
        System.out.println("area="+c.area());
        System.out.println("area="+c2.area());
        Square sq = new Square(1);
        Square sq2 = new Square(2);
        System.out.println("area="+sq.area());
        System.out.println("area="+sq2.area());
        tri t = new tri(3,6);
        tri t2 = new tri(4,10);
        System.out.println("area="+t.area());
        System.out.println("area="+t2.area());
        //比較大小
        double[] shp = new double[6];
        shp[0] = c.area();
        shp[1] = c2.area();
        shp[2] = sq.area();
        shp[3] = sq2.area();
        shp[4] = t.area();
        shp[5] = t2.area();
        System.out.println("largest area="+largest(shp));
        //10
        System.out.println("Q10:");
        Shape s1 = new Circle2(2);
        Shape s2 = new Circle2(1);
        System.out.println("area="+s1.area());
        System.out.println("area="+s2.area());
        Shape s3 = new Square(2);
        Shape s4 = new Square(1);
        System.out.println("area="+s3.area());
        System.out.println("area="+s4.area());
        Shape s5 = new tri(4,10);
        Shape s6 = new tri(3,6);
        System.out.println("area="+s5.area());
        System.out.println("area="+s6.area());
        //比較大小
        double[] shp2 = new double[6];
        shp2[0] = s1.area();
        shp2[1] = s2.area();
        shp2[2] = s3.area();
        shp2[3] = s4.area();
        shp2[4] = s5.area();
        shp2[5] = s6.area();
        System.out.println("largest area="+largest(shp2));

        //11
        System.out.println("\nQ11:");
        Cbbb1011 cbbb1011 = new Cbbb1011();
        cbbb1011.show();
        Cbbb1011 cbbb10112 = new Cbbb1011(3,4);
        cbbb10112.show();

        //13
        //ch10_1中, 請指出下列兩者是"has-a"還是"is-a"關係
        //(a) Coin / Circle -> is-a
        //(b) coin / radius -> has-a
        //(c) coin / show() -> has-a

        //14
        System.out.println("\nQ14:");
        Truck1014 truck1014 = new Truck1014();
        truck1014.show();

        //15
        //Q: 把習題1中的n1,n2成員宣告為final，是否還能正確編譯?
        //A: 不行，final會把該成員變成無法修改的常數(constant)

        //16
        System.out.println("\nQ16:");
        Rectangle1016 rect = new Rectangle1016(20,60);
        System.out.println(rect);

        //17
        System.out.println("\nQ17:");
        Truck t1 = new Truck();
        System.out.println(t1.getClass());

    }

    //傳入陣列比較面積大小
    public static double largest(double[] a){
        double max=0;
        for(int i=0; i<a.length; i++){  //用迴圈取出陣列所有值比較
            if (a[i]>max)
                max=a[i];
        }
        return max;
    }
}

class Caaaa{
    public int n1,n2;

    public Caaaa() {
        n1 = n2 = 1;
    }
    public Caaaa(int a, int b) {
        n1 = a; n2 = b;
    }

    void display(){
        System.out.println("printed from Caaaa class");
    }
    void show(){
        System.out.println("n1="+n1+", n2="+n2);
    }
}
class Cbbbb extends Caaaa{

    public Cbbbb(int a, int b) {
        super(a, b);
    }

    public Cbbbb() {
        super();
    }

    public void set_num(int n1, int n2){
        this.n1 = n1; this.n2 = n2;
    }
    void display(){
        System.out.println("printed from Cbbbb class");
    }
}   //1&2&7

//class名跟ch9_practice重名，只改大小寫會出現錯誤
class rectangle2{
    private int length;
    private int width;

    public rectangle2() {
        length = 2;
        width = 2;
    }

    public rectangle2(int len, int wid) {
        length = len;
        width = wid;
    }

    private void show(){
        System.out.println("length="+length+", width="+width);
    }
    void area(){
        int area = length*width;
        show();
        System.out.println("area="+area);
    }

}
class data2 extends rectangle2{
    public data2() {
//        super();  //第12題
    }

    public data2(int len, int wid) {
        super(len, wid);
    }
}   //3&12

class Caaaa2{
    private int num;


    public Caaaa2(int n) {
        num = n;
    }

    public int get(){
        return num;
    }
}
class Cbbbb2 extends Caaaa2{

    //錯誤之處: 少了跟父對應的建構子
    public Cbbbb2(int n) {
        super(n);
    }

    public void show(){
        System.out.println("num="+get());
    }
}    //4

class Triangle{
    protected int base;
    protected int height;

    protected void show(){
        System.out.println("base="+base+", height="+height);
    }
}
class data_tri extends Triangle{

    public data_tri(int ba, int he) {
        super();
        base = ba;
        height = he;
    }

    void area(){
        super.show();
        System.out.println("area="+base*height/2);
    }
}    //5

class Circle1006{
    private double pi=3.14;	// 將pi宣告成protected
    protected double radius;			// 將radius宣告成protected

    public void show(){
        System.out.printf("area=%6.2f",pi*radius*radius);
    }
    double get_pi(){
        return pi;
    }
}
class Coin1006 extends Circle1006{   // 定義Coin類別，繼承自Circle類別
    private int value;

    public Coin1006(double r, int v){
        radius=r;   	// 在子類別裡可直接取用父類別裡的protected成員
        value=v;
        System.out.println("radius="+radius+", value="+value);
    }

    void print_pi(){
        System.out.println("\npi= "+get_pi());
    }
}   //6

class caaaa{}
class cbbbb extends caaaa {}
class ccccc extends cbbbb {}

class Shape{
    public double area(){
        return 0.0;
    }

}
class Circle2 extends Shape{
    int r;

    public Circle2(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*3.14;
    }
}
class Square extends Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    public double area() {
        return side*side;
    }
}
class tri extends Shape{
    int base;
    int height;

    public tri(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (double) (base * height) /2;
    }
}     //9&10

class Caaa1011{
    public int n1,n2;

    public Caaa1011() {
        n1=n2=1;
    }
    public Caaa1011(int a, int b) {
        n1 = a;
        n2 = b;
    }

    void show(){
        System.out.println("n1="+n1+", n2="+n2);
    }
}
class Cbbb1011 extends Caaa1011{
    public Cbbb1011() {
    }
    public Cbbb1011(int a, int b) {
        super(a, b);
    }


}   //11

class Car{
    String owner = "Tom";
    final String color = "Red";
    final void show(){
        System.out.println("color="+color+", owner="+owner);
    }
}
class Truck1014 extends Car{
//    void show(){
//        System.out.println("truck color="+color+", truck owner="+owner);
//    }
}   //14

class Rectangle1016{
    protected int width;
    protected int height;

    public Rectangle1016(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public String toString() {
        return "width="+width+", height="+height+", area="+width*height;
    }
}   //16

class Truck{
    protected String name = "Toyota";
}    //17


