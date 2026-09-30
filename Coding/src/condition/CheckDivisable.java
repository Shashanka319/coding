package condition;

import java.util.Scanner;

public class CheckDivisable {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
       static void main() {
        //check divisable by 3,5,7
       CheckDivisable obj = new CheckDivisable();
       obj.orOperation();
       obj.andOperation();

    }
     void orOperation(){
        String res = n%3==0 || n%5==0 || n%7==0 ? "Yes" : "No";
        System.out.println(res);
    }
     void andOperation(){
           String resu = n%2==0 || n%5==0 || n%7==0 ? "Yes" : "No";
           System.out.println(resu);
           String res= n%10==0 ? "Yes" : "No";
         System.out.println(res);
    }

}
