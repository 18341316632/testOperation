import java.util.Scanner;

public class HelloWorldJuly {
    public static void main(String[] args) {
        //使用Scanner读取整数
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("第一个整数："+ a);
        int b = scanner.nextInt();
        System.out.println("第二个整数："+ b);

        //使用Scanner读取浮点数
        float a1 = scanner.nextInt();
        System.out.println("读取的浮点数的值是："+ a1);

        //使用Scanner读取字符串
//        Scanner scanner1 = new Scanner(System.in);
//        String string = scanner1.nextLine();
//        System.out.println("读取的字符串是："+ string);

        /*
        需要注意的是，如果在通过nextInt()读取了整数后，再接着读取字符串，读出来的是回车换行:"\r\n",
        因为nextInt仅仅读取数字信息，而不会读取回车换行"\r\n".
        所以，如果在业务上需要读取了整数后，接着读取字符串，那么就应该连续执行两次nextLine()，
        第一次是取走回车换行，第二次才是读取真正的字符串
         */
        String rn = scanner.nextLine();
        String string = scanner.nextLine();
        System.out.println("读取的字符串是："+ string);

    }
}
