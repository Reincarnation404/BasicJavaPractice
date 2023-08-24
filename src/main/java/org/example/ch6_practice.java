package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ch6_practice {
    public static void main(String[] args) {
//        //3
//        int[] arr= {53,27,69,12,3,96};
//        for (int i:arr){
//            System.out.println(i);
//        }
//
//        int n = 0,m = 0;
//        for(int j:arr){
//            if(j%2 == 0){
//                n++;
//            }else {
//                m++;
//            }
//        }
//        System.out.println("奇數有"+m+"個\n偶數有"+n+"個");
//
//        int omax=1,pmax=0;
//        for (int k: arr){
//            if (k%2 == 0){
//                if (k>pmax){
//                    pmax=k;
//                }
//            }else{
//                if(k>omax){
//                    omax=k;
//                }
//            }
//        }
//        System.out.println("偶數max="+pmax+"\n奇數max="+omax);

//        //5
//        int[] arr={32,16,34,71};
//        int sum=0;
//        float avg = 0;
//        //OptionalDouble avg= OptionalDouble.of(0.0);
//        for(int i: arr){
//            sum+=i;
//            avg = (float) sum /arr.length;
//           // avg = Arrays.stream(arr).average();
//        }
//        System.out.println(avg);

//        //7  byChatGPT
//        int[] arr={12,15,8,43};
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            // 交换数组中左右两个元素的位置
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            // 移动指针以继续交换下一对元素
//            left++;
//            right--;
//        }
//
//        // 打印反向排列后的数组
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //11-1
        double[][] temp ={{18.2,17.3,15.0,13.4},{23.8,25.1,20.6,17.8},{20.6,21.5,18.4,15.7}};
        for(double[] row: temp){
            for(double n: row){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        //11-2
        double sum=0;
        for(double[] row: temp){

        }

    }
}
