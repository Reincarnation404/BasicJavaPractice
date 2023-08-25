package org.example;

public class ch10_practice {
    public static void main(String[] args) {
        //1
        Cbbbb cbbbb = new Cbbbb();
        cbbbb.set_num(5,10);
        cbbbb.show();
        //2
        Cbbbb cbbbb1 = new Cbbbb();
        Cbbbb cbbbb2 = new Cbbbb(3,9);
        cbbbb1.show();
        cbbbb2.show();

        //3
        data2 obj1 = new data2(3,8);
        data2 obj2 = new data2();
        obj1.area();
        obj2.area();

        //4
        Cbbbb2 bb =new Cbbbb2(2);
        bb.show();

        //5
        data_tri dt = new data_tri(3,8);
        dt.area();

        //7
        Caaaa aa = new Cbbbb();
        aa.display();
        //父子都有display(),子的類別會被呼叫

        //9
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

        //15
        //Q: 把習題1中的n1,n2成員宣告為final，是否還能正確編譯?
        //A: 不行，final會把該成員變成無法修改的常數(constant)

        //17
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
        System.out.println("n1="+n1+"\nn2="+n2);
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
}

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
    }

    public data2(int len, int wid) {
        super(len, wid);
    }
}

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
}

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
}

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
}

class Truck{
    protected String name = "Toyota";
}


