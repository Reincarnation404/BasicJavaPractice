package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ch6_practice {
    public static void main(String[] args) {
        //3
        System.out.println("Q3:");
        int[] arr= {53,27,69,12,3,96};
        for (int i:arr){
            System.out.print(i+" ");
        }

        int n03 = 0,m = 0;
        for(int j:arr){
            if(j%2 == 0){
                n03++;
            }else {
                m++;
            }
        }
        System.out.println("\n奇數有"+m+"個\n偶數有"+n03+"個");

        int omax=1,pmax=0;
        for (int k: arr){
            if (k%2 == 0){
                if (k>pmax){
                    pmax=k;
                }
            }else{
                if(k>omax){
                    omax=k;
                }
            }
        }
        System.out.println("偶數max="+pmax+"\n奇數max="+omax);

        //4
        System.out.println("\nQ4:");
        int[] arr04= {3,5,0,3,2,4,1,6,8,5,4,3,2};
        int count04=0;
        System.out.print("arr04內容=");
        for(int i:arr04){
            if (i>=3 && i<=6){
                count04++;
            }
            System.out.print(i+" ");
        }
        System.out.println("\n介於3~6之間的數有"+count04+"個");

        //5
        System.out.println("\nQ5:");
        int[] arr05={32,16,34,71};
        int sum=0;
        float avg = 0;
        //OptionalDouble avg= OptionalDouble.of(0.0);
        for(int i: arr05){
            sum+=i;
            avg = (float) sum /arr.length;
           // avg = Arrays.stream(arr).average();
        }
        System.out.println(avg);

        //6
        System.out.println("\nQ6:");
        int[] arr06={78,43,92,11,7};
        int max=0; int min=0;
        for(int i=0; i<arr06.length; i++){
            if(arr06[i]>arr06[max]){
                max = i;
            }
            if(arr06[i]<arr06[min]){
                min = i;
            }
        }System.out.println("最大值的索引值="+max+"\n最小值的索引值="+min);


        //7  byChatGPT
        System.out.println("\nQ7:");
        int[] arr07={12,15,8,43};

        int left = 0;
        int right = arr07.length - 1;

        while (left < right) {
            // 交换数组中左右两个元素的位置
            int temp = arr07[left];
            arr07[left] = arr07[right];
            arr07[right] = temp;

            // 移动指针以继续交换下一对元素
            left++;
            right--;
        }

        // 打印反向排列后的数组
        for (int i = 0; i < arr07.length; i++) {
            System.out.print(arr07[i] + " ");
        }

        //8
        System.out.println("\nQ8:");
        int[] arr08={12,43,56,77};
        int[] ind={2,0,1,3};
        int[] newArr08 = new int[4];
        System.out.print("newArr08=");
        for(int i=0; i<arr08.length; i++){
            newArr08[i]=arr08[ind[i]];
            System.out.print(newArr08[i]+" ");
        }

        //9

        //10
        System.out.println("\nQ10:");
        char[] charr={'H','e','l','l','o'};
        System.out.print("new charr=");
        for (char c:charr){
            if (c>=65 && c<91){
                c+=32;
            }else if(c>=97 && c<123) {
                c-=32;
            }
            System.out.print(c+" ");
        }

        //11-1
//        System.out.println("\nQ11:");   //3X4陣列
//        double sum11=0;
//        double[][] temp ={{18.2,17.3,15.0,13.4},{23.8,25.1,20.6,17.8},{20.6,21.5,18.4,15.7}};
//        System.out.println("temp內容=");
//        for(double[] row: temp){
//            for(double n: row){
//                System.out.print(n+" ");
//            }
//            System.out.println();
//        }
//        //11-2
//        for(int i=0; i<4; i++){
//            for (int j=0; j<3; j++){
//                sum11+=temp[i][j];
//            }
//            System.out.println("星期"+(i+1)+"均溫="+sum11/3);
//        }



        //21
        System.out.println("\nQ21:");
        int[] a21={1,2,3,4};
        int[] b21={9,8,7,6};
        int[] c21;
        c21 = a21;   //要用c去接a的內容, 不然a的內容會不見(直接a=b, a就變成b了)
        a21 = b21;
        b21 = c21;
        System.out.println("a21內容="+ Arrays.toString(a21));
        System.out.println("b21內容="+ Arrays.toString(b21));

        //22
        System.out.println("\nQ22:");
        int[] a22={14,36,31,61,65};
        int[] b22 = new int[a22.length];
        for (int i=0; i<a22.length; i++){
            b22[i]=a22[i];
        }

        a22[0]=100;
        System.out.println("a22內容="+ Arrays.toString(a22));
        System.out.println("b22內容="+ Arrays.toString(b22));
    }
}
