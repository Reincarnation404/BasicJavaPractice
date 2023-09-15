package org.example;

public class ch8_practice {
    public static void main(String[] args) {
        //1
        System.out.println("Q1:");
        Caaa08 obj = new Caaa08();
        obj.a = 5; obj.b = 3; obj.c = obj.a* obj.b;
        System.out.println("a="+obj.a+", b="+obj.b+", c="+obj.c);

        //2
        System.out.println("\nQ2:");
        Cbbb08 obj1 = new Cbbb08();
        Cbbb08 obj2 = new Cbbb08();
        Cbbb08 avg = new Cbbb08();
        obj1.x = 5.2; obj1.y = 3.9;
        obj2.x = 6.5; obj2.y = 4.6;
        avg.x = (obj1.x+ obj2.x)/2; avg.y = (obj1.y+ obj2.y)/2;
        System.out.println("obj1.x="+obj1.x+", obj1.y="+obj1.y);
        System.out.println("obj2.x="+obj2.x+", obj2.y="+obj2.y);
        System.out.println("avg.x="+avg.x+", avg.y="+avg.y);

        //3
        System.out.println("\nQ3:");
        Cddd student = new Cddd();
        student.BMI("Sandy",1.655,58.2);


        //5
        System.out.println("\nQ5:");
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;
        box.showAll();

        //6
        System.out.println("\nQ6:");
        Circle08 c1 = new Circle08();
        c1.radius = 3.0;
        c1.show_periphery();

        //7
        System.out.println("\nQ7:");
        CTest c = new CTest();
        c.test(3);
        c.test(8);
        c.test(0);
        c.test(18);
        c.test(-3);

        //8
        CCalculator cCalculator = new CCalculator();
        cCalculator.set_value(5, 12);
        cCalculator.show();
        System.out.println("add="+cCalculator.add());
        System.out.println("sub="+cCalculator.sub());
        System.out.println("mul="+cCalculator.mul());
        System.out.println("avg="+cCalculator.avg());

        //9
        //不正確, 因為不能設計引數個數和型別完全相同,只有傳回值型別不同的多載

        //10
        //下列哪個可以呼叫void set(int r)這個函數?
        //(a) set("Hello");  引數型態不同
        //(b) set("50");
        //(c) set(10, 25);   引數個數不同
        //(b) set(3.14);     引數型態不同
        // Ans: (b)

        //11
        System.out.println("\nQ11:");
        CWin cWin = new CWin();
        cWin.setWindows(5,3,"my windows");
        cWin.show();

        //12
        System.out.println("\nQ12:");
        CCircle08 cCircle08 = new CCircle08();
        System.out.println("r=2, 圓面積="+cCircle08.area(2));
        System.out.println("r=2.2f, 圓面積="+cCircle08.area(2.2f));
        System.out.println("r=2.2, 圓面積="+cCircle08.area(2.2));


        //15
        System.out.println("\nQ15:");
        CSphere cs = new CSphere();
        cs.setLocation(3,4,5);
        cs.setRadius(1);
        cs.showAll();

        //16
        System.out.println("\nQ16:");
        CData08 tom = new CData08();
        CData08 mary = new CData08();
        tom.setName("Tom");
        tom.setEmail("abc@gmail.com");
        tom.setBirthday(6,18,2006);
        tom.show_data();
        mary.setAll("Mary","def@gmail.com",2,28,1999);
        mary.show_data();



    }
}

class Caaa08{
    int a;
    int b;
    int c;
}   //1

class Cbbb08{
    double x;
    double y;
}   //2

class Cddd{
    String name;
    double height;
    double weight;

    public void BMI(String n, double h, double w){
        name = n;
        height = h;
        weight = w;
        float bmi = (float) (w/Math.pow(h,2));
        System.out.println(n+"的BMI為"+bmi);
    }

}   //3

class CBox{
    int length;
    int width;
    int height;

    int volume(){
        return length*width*height;
    }

    int surfaceArea(){
        return (length*width+length*height+height*width)*2;
    }

    public void showData(){
        System.out.println("長為"+length+"\n寬為"+width+"\n高為"+height);
    }

    public void showAll(){
        showData();
        System.out.println("體積為:"+volume()+"\n表面積為:"+surfaceArea());
    }
}   //5

class Circle08{
    double pi = 3.14;
    double radius;

    void show_periphery(){
        System.out.println("圓周長="+2*pi*radius);
    }
}   //6

class CTest{
    int num;

    void test(int n){
        num = n;
        if(n==0){
            System.out.println("此數為0");
        }else if(n<0){
            System.out.println(n+"為負數");   //用else if不然會出現"0為偶數"
        }else{
            if(n %2 == 0){
                System.out.println(n +"為偶數");
            }else{
                System.out.println(n +"為奇數");
            }
        }

    }
}   //7

class CCalculator{
    int a;
    int b;

    void set_value(int a, int b){
        this.a = a;
        this.b = b;
    }
    void show(){
        System.out.println("a="+a+", b="+b);
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    double avg(){
        return (double) add() /2;
    }
}   //8

class CWin{
    int width;
    int height;
    String name;

    void setW(int w){
        width = w;
    }
    void setH(int h){
        height = h;
    }
    void setName(String s){
        name = s;
    }
    void setWindows(int w,int h){
        setW(w);
        setH(h);
    }
    void setWindows(int w,int h,String s){
        setWindows(w, h);
        setName(s);
    }
    public void show(){
        System.out.println("Name="+name);
        System.out.println("W="+width+", H="+height);
    }
}   //11

class CCircle08{

    double area(double r){
        return r*r*3.14;
    }
    float area(float r){
        return (float) (r*r*3.14);
    }
    double area(int r){
        return r*r*3.14;
    }
}   //12

class CSphere{
    private int x;
    private int y;
    private int z;
    private int r;


    void setLocation(int a, int b, int c){
        x=a;
        y=b;
        z=c;
    }
    void setRadius(int d){
        r=d;
    }
    double surfaceArea(){
       // setRadius(r);
        return 4*3.14*Math.pow(r,2);
    }
    double volume(){
       // setRadius(r);
        return (double) 4 /3*3.14*Math.pow(r,2);
    }
    public void showCenter(){
        System.out.println("圓心座標=("+x+","+y+","+z+")");
    }
    public void showAll(){
        showCenter();
        System.out.println("圓體積為"+volume()+"\n表面積為:"+surfaceArea());
    }

}   //15

class CData08{
    private String name;
    private String email;
    private int mm;
    private int dd;
    private int yy;

    void setName(String n){
        name = n;
    }
    void setEmail(String e){
        email = e;
    }
    void setBirthday(int m, int d, int y){
        mm = m;
        dd = d;
        yy = y;
        checkDate(m,d,y);
    }
    private boolean checkDate(int m, int d, int y){
        if(m==2 && d>28){return false;}
        if(d<1 || d>31){return false;}
        if(y<1900 || y>2099){return false;}
        else return true;
    }
    void setAll(String n, String e, int m, int d, int y){
        name = n;
        email = e;
        mm = m;
        dd = d;
        yy = y;
    }
    void show_data(){
        System.out.println("name=" +name);
        System.out.println("email=" +email);
        if(!checkDate(mm, dd, yy)){
            System.out.println("日期格式錯誤");
        }else{
            System.out.println(mm+"/"+dd+"/"+yy);
        }
    }

}