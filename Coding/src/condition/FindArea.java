package condition;

import java.util.Scanner;

public class FindArea {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int rectAngle = n*m;
        System.out.println("The area of Rectangle is "+rectAngle);

        int squre = n*n;
        System.out.println("The area of Square is "+squre);

        int circle = (int)3.142*n*n;
        System.out.println("The area of Circle is "+circle);
    }
}
