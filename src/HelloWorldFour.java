public class HelloWorldFour {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        String string = Integer.toBinaryString(i);//5的二进制表达式101
        String string1= Integer.toBinaryString(j);//              110
        System.out.println("5的二进制   " + string);
        System.out.println("6的二进制   " + string1);

        //位或 |
        int k = i | j;//7
        String string2 = Integer.toBinaryString(k);//111
        System.out.println(i | j);
        System.out.println(string2);

        //位与 &
        int k1 = i & j;// 101 & 110 = 100  4
        String string3 = Integer.toBinaryString(k1);
        System.out.println(k1);//4
        System.out.println(string3);//100

        //异或^
        int k2 = i ^ j;
        String string4 = Integer.toBinaryString(k2);
        System.out.println(k2);
        System.out.println(string4);

        //取反 ~
        int q = 5;
        int k3 = ~q;
        String string5 = Integer.toBinaryString(k3);
        System.out.println(k3);
        System.out.println(string5);

        // 左移 >>  右移 <<
        byte w  =6;
        //6的二进制是110
        System.out.println(Integer.toBinaryString(w));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(w<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(w>>1);

        /*
        带符号右移 >>
        对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1
        无符号右移>>>
        如果是一个负数，那么对应的二进制的第一位是1
        无符号右移>>>会把第一位的1也向右移动，导致移动后，第一位变成0
        这样就会使得负数在无符号右移后，得到一个正数

        简单的说：
        带符号右移 >> 移动后正的还是正的，负的还是负的,符号不变
        无符号右移>>>移动后，变正的了
         */

        int s  = -10;

        //-10的二进制是11111111111111111111111111110110
        //第一位是1，即符号位，代表这是一个负数
        System.out.println(s);
        System.out.println(Integer.toBinaryString(s));

        //对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        //对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1

        //-10带符号右移1位，移动后前面补齐1
        //得到11111111111111111111111111111011
        //因为第一位是1，所以依然是一个负数，对应的十进制是-5
        int a = s>>1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);

        //-10无符号向右移1位，符号位也会向右移，第一位就变成了0
        //得到01111111111111111111111111111011，对应的十进制是2147483643
        int d = a>>>1;
        System.out.println(Integer.toBinaryString(d));
        System.out.println(d);

        int q1 = 3; // 二进制是11
        int q2 = 2; // 二进制是10
        int q3 = ((q1 | q2) ^ (q1 & q2)) << 2 >>> 1;//  0011 0010 0001   0000
        System.out.println(q3);

    }
}
