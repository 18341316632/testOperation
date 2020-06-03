import java.util.Scanner;

public class HelloWorldJune {
    public static void main(String[] args) {
        /*
        三元操作符
        表达式?值1:值2
        如果表达式为真 返回值1
        如果表达式为假 返回值2
         */
        int i = 5;
        int j = 6;
        int k = i < j ? 99 : 88;

        // 相当于
        if (i < j) {
            k = 99;
        } else {
            k = 88;
        }
        System.out.println(k);

        /*
        通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末？
         */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int b = input.nextInt();
//        String string = b >= 1 && b <= 7 ? b <= 5 ? "工作日" : "周末": "输入错误";
        String string = b < 6 & b > 0 ?  "工作日" : (b >= 6 & b < 8 ? "周末": "输入错误");
        System.out.println(string);

    }
}
