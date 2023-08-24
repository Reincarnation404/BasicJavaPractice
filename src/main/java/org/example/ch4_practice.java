package org.example;

public class ch4_practice {
    public static void main(String[] args) {
        //8
        int c1 = 0;
        int f1 = (9/5)*c1+32;
        System.out.println("f1="+f1);

        //9
        int f2 = 32;
        int c2 = f2-32/(9/5);
        System.out.println("c2="+c2);

        //15
        int year = 12;
        int cal = 100;
        System.out.println("100個月是"+(cal/year)+"年"+ cal % year +"個月");
    }
}
