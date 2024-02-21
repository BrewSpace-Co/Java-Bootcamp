/*
 * This program is to swap/exchange two numbers by using a variable.

For example:

Numbers to swap: 11 and 12  
Let x= 11, y= 12  
  
Swapping Logic:  
t=x= 11  
x =y =12  
y =t =11  
  
After swapping:  
x= 12, y = 11  
*/

import java.util.Scanner;
class swapTwoNumbers {
    public static void main (String[] args) {
    int x, y, t;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       /*swapping */  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
}

}