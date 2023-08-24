package org.example;

public class ch8_practice {
    public static void main(String[] args) {
        //3
        Cddd student = new Cddd();
        student.BMI("Sandy",1.655,58.2);

        //5
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;
        box.showAll();

        //7
        CTest c = new CTest();
        c.test(3);
        c.test(8);
        c.test(0);
        c.test(18);
        c.test(-3);

        //11
        CWin cWin = new CWin();
        cWin.setWindows(5,3,"my windows");
        cWin.show();

        //15
        CSphere cs = new CSphere();
        cs.setLocation(3,4,5);
        cs.setRadius(1);
        cs.showAll();

    }
}

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

}

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
}

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
}

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
}

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

}