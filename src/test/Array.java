package test;

import java.util.Scanner;

class Array_Demo {
//    int[] a={1,2,3,4,5};
    int a[] = new int[5];
    int result[] = new int[2];

//    To take the input from array
    void getInput()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
    }
//    Display the array
    void display()
    {
        for (int j : a) {
            System.out.println(j);
        }


    }
    public class Array{
        public static void main(String[] args) {
            Array_Demo a = new Array_Demo();
            System.out.println("Enter element are below:");
            a.getInput();
            System.out.println("Array element are below:");
            a.display();


        }

    }
}
