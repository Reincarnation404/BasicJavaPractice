package org.example;

// Press Shift twice = find
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter = suggestion
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello world!");

        // Press Shift+F10 = run
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 = debug mode
            // Press Ctrl+F8 = add breakpoints
            System.out.println("i = " + i);
        }


//        int a=5,b=5;
//        System.out.printf("++a的傳回值: %d\n",++a);  //遞增運算子在前
//        System.out.printf("執行完++a之後，a= %d\n",a);
//        System.out.printf("b++的傳回值: %d\n",b++); 	//遞增運算子在後
//        System.out.printf("執行完b++之後，b= %d\n",b);

//        int a=7, b=13;
//        System.out.printf("%d & %d = %d\n",a, b, a&b);	// 位元AND
//        System.out.printf("%d | %d = %d\n",a, b, a|b);	// 位元OR
//        System.out.printf("!%d = %d\n",a, ~a);   		// 位元NOT
//        System.out.printf("%d ^ %d = %d\n",a, b, a^b);	// 位元XOR
//        System.out.printf("%d >> 2 = %d\n",a, a>>2);		// 右移兩個位元
//        System.out.printf("%d << 2 = %d\n",a, a<<2);		// 左移兩個位元

        int a1= 8;

        System.out.printf("a=%d\n",++a1);
        System.out.printf("a=%d\n",a1--);  //why??

        int a= 10,b=20;
        int num= (a++)-b;
        int num2= (-b)*a;
        int num3= (a++)+(++b);
        int num4= (--a)+(b--);
        int num5= (a+=a*(b++));
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);


    }
}