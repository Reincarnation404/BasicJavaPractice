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
        System.out.println("\nQ11:");   //3X4陣列
        double[][] temp ={{18.2,17.3,15.0,13.4},{23.8,25.1,20.6,17.8},{20.6,21.5,18.4,15.7}};
        System.out.println("temp內容=");
        for(double[] row: temp){
            for(double n: row){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        //11-2
        for(int i=0; i<4; i++){   //行
            double sum11 = 0;
            for (int j=0; j<3; j++){   //列
                sum11+=temp[j][i];
            }
            System.out.println("星期"+(i+1)+"均溫="+sum11/temp.length);
        }
        //11-3
        for(int i=0; i<3; i++){
            float sum_tem2 = 0;
            for (int j=0; j<4; j++){
                sum_tem2+= (float) temp[i][j];
            }
            System.out.println("時段"+(i+1)+"均溫="+sum_tem2/temp[0].length);
        }
        //11-4
        double max11 = 0;
        int week = 0, time=0;
        for(int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                if(temp[i][j]>max11){
                    max11=temp[i][j];
                    week=j;
                    time=i;
                }
            }
        }
        System.out.println("星期"+(week+1)+"的時段"+(time+1)+"為最高溫="+max11);
        //11-5
        double min11 = temp[0][0];
        int week2 = 0, time2=0;
        for(int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                if(temp[i][j]<min11){
                    min11=temp[i][j];
                    week2=j;
                    time2=i;
                }
            }
        }
        System.out.println("星期"+(week2+1)+"的時段"+(time2+1)+"為最低溫="+min11);

        //12-1&3
        System.out.println("\nQ12:");
        int[][] arr12={{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65},{12,16,10,14,15}};
        int max_sales = 0;
        int max_position = 0;
        for(int i=0; i<3; i++){
            int sum13 =0;
            for (int j=0; j<5; j++){
                sum13 += arr12[i][j] * arr12[3][j];
            }
            if (max_sales<sum13){
                max_sales =sum13;
                max_position = i+1;
            }
            System.out.println("第"+(i+1)+"位"+sum13);
        }
        System.out.println("最大銷售量"+max_sales);
        System.out.println("最大銷售員"+max_position);


        //12-2&4
        int max_thing=0;
        int max_product=0;
        for(int i=0; i<5; i++){
            int sum13 =0;
            for (int j=0; j<3; j++){
                sum13 += arr12[j][i] * arr12[3][i];
            }
            if (max_thing<sum13){
                max_thing =sum13;
                max_product = i+1;
            }
            System.out.println("第"+(i+1)+"項"+sum13);
        }
        System.out.println("最大銷售量"+max_thing);
        System.out.println("最大銷售產品"+max_product);

        //13
        System.out.println("\nQ13:");
        int[][] arr13={{18,21,30},{40,34,61},{41,15,18}};
        int min13=arr13[0][0];
        int r=0; int c=0;
        for (int i=0; i<arr13.length; i++){
            for (int j=0; j<arr13[i].length; j++){
                if (arr13[i][j]<min13){
                    min13=arr13[i][j];
                    r=i;
                    c=j;
                }
            }
        }
        System.out.println("arr13's minimum row="+r+", column="+c);

        //14
        System.out.println("\nQ14:");

        //15
        System.out.println("\nQ15:");
        int[][] arr15={{4,2},{3,4,6},{7,4,8,5}};
        int max15=0;
        System.out.println("arr15的內容=");
        for (int[] row:arr15){
            for (int i: row){
                if (i>max15){
                    max15=i;
                }
                System.out.print(i+" ");
            }System.out.println();
        }
        System.out.println("arr15's maximum="+max15);

        //16
        System.out.println("\nQ16:");
        int[][] arr16 = new int[6][6];
        for (int i=0; i<arr16.length; i++){
            for (int j=0; j<arr16[i].length; j++){
                arr16[i][j]=(6*i)+j;
                System.out.print(arr16[i][j]+" ");
            }
            System.out.println();
        }

        //17
        System.out.println("\nQ17:");
        int[][][] arr17={{{15,85,36},{30,14,37},
                {47,23,96},{19,39,51}},
                {{22,16,51},{97,30,12},
                        {68,77,26},{57,32,76}}};


        //18
        System.out.println("\nQ18:");

        //19
        System.out.println("\nQ19:");

        //20
        System.out.println("\nQ20:");

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
