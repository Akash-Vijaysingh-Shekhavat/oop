package test1;

import java.util.Scanner;

public class Array {
    int[] arr ;
    int[] result = new int[2]; //fixed size result
    int targetsum;
    Scanner in = new Scanner(System.in);

    public Array(int arraySize){
        arr = new int[arraySize];
        targetsum =0;
    }
    public void getData(){
        System.out.println("Enter the array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println("Enter the target sum =");
        targetsum = in.nextInt();

    }

    public int[] numsum(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                else{
                    if((arr[i]+arr[j])==targetsum){
                        result[0]=arr[j];
                        result[1]=arr[i];
                    }

                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arraySize =in.nextInt();
        Array adder = new Array(arraySize);
        adder.getData();
        int[] result = adder.numsum();
        System.out.print("Resulted array is : [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
        System.out.println("]");

    }

}
