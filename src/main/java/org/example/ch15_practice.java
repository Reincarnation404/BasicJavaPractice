package org.example;

public class ch15_practice {
    public static void main(String[] args) {
        //2
//        testt hi = new testt("Hello");
//        testt bye = new testt("Good bye");
//        hi.run();
//        bye.run();
        /*
            執行結果:
            Hello 1
            Hello 2
            Hello 3
            Hello 4
            Hello 5
            Good bye 1
            Good bye 2
            Good bye 3
            Good bye 4
            Good bye 5
         */
        //呼叫run()並沒有啟動執行緒
        //3
//        System.out.println("----------------");
//        hi.start();
//        bye.start();
//        testt morning = new testt("Good morning");
//        testt night = new testt("Good night");
//        morning.start();
//        night.start();

        //5
//        MyPrint s1 = new MyPrint(5,'*');
//        MyPrint s2 = new MyPrint(3,'$');
//        Thread t1 = new Thread(s1);
//        Thread t2 = new Thread(s2);
//        t1.start();
//        t2.start();

        //7
//        sleepThread st1 = new sleepThread("Thread 1",1000);
//        sleepThread st2 = new sleepThread("Thread 2",2500);
//        Thread t1 = new Thread(st1);
//        Thread t2 = new Thread(st2);
//        t1.start();
//        t2.start();

        //9
        //看不太懂題目敘述
        //待補
//        Pig p1 = new Pig();
//        Thread tp1 = new Thread(p1);
//        tp1.start();

        //11
//        Animal Tom = new Animal("狸克");
//        Animal Redd = new Animal("狐利");
//        Animal Tortimer = new Animal("壽伯");
//        Animal Blathers = new Animal("傅達");
//        Thread t1 = new Thread(Tom);
//        Thread t2 = new Thread(Tortimer);
//        Thread t3 = new Thread(Blathers);
//        Thread t4 = new Thread(Redd);
//        t1.start();
//        try {
//            t1.join();
//            t2.start();
//            t2.join();
//            t3.start();
//            t3.join();
//            t4.start();
//            t4.join();
//        }catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("All Threads are finished");

        //13
//        CData cd = new CData(5,1500);
//        CData cd2 = new CData(9,1000);
//        CData cd3 = new CData(8,2000);
//        cd.start();
//        cd2.start();
//        cd3.start();

        //15
        //卡在計算質數程式
        //看了答案還是不懂
        //待補

    }
}

class testt extends Thread{
    public String id;

    public testt(String str) {
        id = str;
    }

    public void run(){
        for(int i=1; i<=5; i++){
            for(int j=0; j<100000000; j++);  // 空迴圈，用來拖慢14行執行的速度
            System.out.println(id+" "+i);
        }
    }


}

class MyPrint implements Runnable{
    private int n;
    private char ch;

    public MyPrint(int a, char c) {
        n = a;
        ch = c;
    }


    @Override
    public void run() {
        for(int i=1; i<=n; i++){
            System.out.print(ch);
        }
    }
}

class sleepThread implements Runnable{
    public String string;
    public int sec;

    public sleepThread(String string, int sec) {
        this.string = string;
        this.sec = sec;
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            try {
                Thread.sleep(sec);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(string+" is running");
        }

    }
}

class Pig implements Runnable{
    @Override
    public void run() {
        System.out.println("小豬看到大野狼在爬煙囪");
        System.out.println("就在壁爐上煮了一鍋水");
        System.out.println("就在壁爐上煮了一鍋水");
        System.out.println("2分鐘 4分鐘 6分鐘");
        System.out.println("一鍋煮沸的熱水煮好了");
    }
}
class Wolf implements Runnable{
    @Override
    public void run() {
        System.out.println("大野狼對著第三隻小豬的房子吹氣");
        System.out.println("他不停地吹氣又吹氣");
        System.out.println("還是不能把房子吹倒");
        System.out.println("大野狼非常的生氣");
        System.out.println("他決定要從煙囪爬進小豬的家裡");
    }
}

class Animal implements Runnable{
    private String id;

    public Animal(String str) {
        id = str;
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(id+"來了"+i+"次");
        }
    }
}

class CData extends Thread{
    private static int sum = 30;
    private int n;
    private int sec;

    public CData(int a, int s) {
        n = a;
        sec = s;
    }

    public void run(){
        while (sum>10)
            sub(n, sec);
    }
    public synchronized static void sub(int a, int s){
        int tmp = sum-a;
        try {
            sleep(s);
        } catch (InterruptedException e) {}
        if (tmp>0){
            sum=tmp;
            System.out.println("減"+a+"後,餘數為"+sum);
        }
    }
}

class primeNum extends Thread{
    public int min;
    public int max;
    public int count;

    public primeNum(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void prime(){
        for(int i=min; i<=max; i++){

        }
    }
    public void run(){

    }
}