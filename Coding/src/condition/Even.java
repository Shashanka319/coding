package condition;

import java.util.Scanner;

public class Even {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n%2==0)
        {
            System.out.println(n +" is Even Number ");
        }else{
            System.out.println(n+" is Odd Number");
        }
    }
}
