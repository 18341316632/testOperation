import java.util.Scanner;

public class HelloWorldTwo {
    /*
    关系操作符:比较两个变量之间的关系
    > 大于
    >= 大于或等于
    < 小于
    <= 小于或等于
    == 是否相等
    != 是否不等
     */

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 5;

        System.out.println(a>b);  //返回 false
        System.out.println(a>=c);  //返回 true

        System.out.println(a==b); //返回false
        System.out.println(a!=b);//返回true

        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        System.out.println("第一个整数   " + e);
        int f = scanner.nextInt();
        System.out.println("第二个整数   " + f);
        System.out.println(e > f);
        System.out.println(e >= f);
        System.out.println(e < f);
        System.out.println(e <= f);
        System.out.println(e == f);
        System.out.println(e != f);
    }
}
