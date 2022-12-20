package Lab4;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Try to divide a number by zero\n"+
                        " 2.Try to access the array index which does not exist.\n" +
                        "3.Try to find the length of String in method ");
        int n= sc.nextInt();
        switch(n){
            case 1:
                int a, b , c;
                System.out.println("Enter numerator");
                a = sc.nextInt();
                System.out.println("Enter denominator");
                b = sc.nextInt();
                try
                {
                    c=a/b;
                    System.out.println("Division is:" + c);
                }
                catch (ArithmeticException e)
                {
                    System.out.println("The error is :" + e.fillInStackTrace());
                    System.out.println("Zero cannot be divided by any number");
                }
                break;
            case 2:
                int arr[]={1,2,3,4};
                int A;
                System.out.println("Enter Index No.");
                A = sc.nextInt();
                try
                {
                    System.out.println(arr[A]);
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("The error is :" + e.fillInStackTrace());
                    System.out.println("Array index is out of bound for length"+
                            arr.length);
                }

                break;
            case 3:
                String str=null;
                try
                {
                    System.out.println("length"+ str.length());
                }
                catch (NullPointerException e)
                {
                    System.out.println("The error is :" + e.fillInStackTrace());
                    System.out.println("null pointer exception arrises");
                }
                finally
                {
                    System.out.println("Code run successfully");
                }

                break;
        }
    }
}
