public class Test {
    public static void main(String[] args) {
//        int i = 1;
//        int j = ++i + i++ + ++i + ++i + i++;
//        System.out.println(j);

        int i = 1;
        boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);//1 i=2 1 i=3 1
        System.out.println(b);
        System.out.println(i);
    }
}
