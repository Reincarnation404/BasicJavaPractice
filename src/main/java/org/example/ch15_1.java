package org.example;

public class ch15_1 {
    public static void main(String[] args) {
        CTest15_1 dog=new CTest15_1("doggy");
        CTest15_1 cat=new CTest15_1("kitty");
        dog.run();
        cat.run();
    }
}

class CTest15_1{
    private String id;
    public CTest15_1(String str){   		   // 建構元，設定資料成員id
        id=str;
    }
    public void run(){    			   // run() 函數
        for(int i=1;i<=5;i++){
            for(int j=0;j<100000000;j++);  // 空迴圈，用來拖慢14行執行的速度
            System.out.println(id+" is running..."+i);
        }
    }
}