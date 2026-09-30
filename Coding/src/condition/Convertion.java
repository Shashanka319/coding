package condition;

import java.util.Scanner;

public class Convertion {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int c  = scan.nextInt();
        float  f = (c*9/5.0f) + 32;
        System.out.println(f);
    }
}
