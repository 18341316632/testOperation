public class HelloWorldMay {
    public static void main(String[] args) {
        /*
        赋值操作的操作顺序是从右到左
        int i = 5+5;
        首先进行5+5的运算，得到结果10，然后把10这个值，赋给i
         */
        int i = 5+5;

        /*
        +=即自加
        i+=2;
        等同于
        i=i+2;
        其他的 -= , *= , /= , %= , &= , |= , ^= , >>= , >>>= 都是类似，不做赘述
         */

        int i1 =3;
        i1+=2;// i1 = i1 +2
        System.out.println(i1);

        int j=3;
        j=j+2;
        System.out.println(j);

        int a = 1;
        a += ++a;
        System.out.println(a);
    }
}
