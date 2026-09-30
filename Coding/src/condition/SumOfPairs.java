package condition;

import java.util.Scanner;

public class SumOfPairs {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum1 = a + b;
        int sum2 = a +c;
        int sum3 = b + c;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}
