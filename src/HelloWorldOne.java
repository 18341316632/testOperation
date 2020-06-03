import java.util.Scanner;

public class HelloWorldOne {
    /*
    基本算数操作符
    加 + 减 - 乘 * 除 / 取余 %
    自增 ++ 自减 --
    */

    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        int a = i+j;
        int b = i - j;
        int c = i*j;
        int d = i /j;

        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        System.out.println("第一个输入   " + e);
        int f = scanner.nextInt();
        System.out.println("第二个输入   " + f);
        int g = e + f;
        System.out.println("和是  " + g);

        //任意运算单元的长度超过int
        int a1 = 5;
        long b1 = 6;
        int c1 = (int) (a1 + b1);//a1 + b1 的结果是 long 类型，所以需要强制转型
        long d1 = a1 + b1;

        //任意运算单元的长度小于int
        byte a2 = 1;
        byte b2 = 2;
        byte c2 = (byte) (a+b); //虽然 a2 b2 都是byte类型，但是运算结果是int类型，需要进行强制转换
        int d2 = a+b;

        //% 取余数，又叫取模，例如5除以2，余1
        int i1 = 5;
        int j1 = 2;
        System.out.println("取余 " + i1 % j1); //输出为1

        // ++ -- 在原来的基础上增加1或者减少
        int i2 = 5;
        i2++;
        System.out.println("i2++结果    " + i2);//输出为6

/*
        以++为例
        int i = 5;
        i++; 先取值，再自加
        ++i; 先自加，再取值
*/
        int i3 = 5;
        System.out.println(i3++); //输出5
        System.out.println(i3);   //输出6

        int j3 = 5;
        System.out.println(++j3); //输出6
        System.out.println(j3);   //输出6

        int i4 = 1;
        int j4 = ++i4 + i4++ + ++i4 + ++i4 + i4++;
        System.out.println(j4);

    }
}
