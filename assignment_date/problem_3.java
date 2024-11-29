
package assignment_date;

import java.util.Scanner;


public class problem_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     if(a<b &c<b)
     {
         System.out.println("b is gretaer :"+b);
     }
     else if(b<a && a>c)
     {
         System.out.println("a is greater :"+a);
     }
     else
     {
         System.out.println("c is greater :"+ c);
     }
                
    }
}
