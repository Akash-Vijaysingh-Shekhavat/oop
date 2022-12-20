package Exception;

import java.security.cert.Extension;


public class dividebyzero {
    public static void main(String[] args) {

//   ArithmeticException
//        int num = 3/0;
//        System.out.println(num);
        try {
            int n = 5 / 0;
            System.out.println(n);

        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();

        }


//        Array index out of bounds exception

                try {
                    int[] arr= new int[]{1, 2, 3, 4, 5};
                    for(int i =0;i<9;i++){
                        System.out.println(arr[i]);
                    }
                } catch (Exception e ) {
                    System.out.println(e);
                    e.printStackTrace();

                }
//        System.out.println(num);
        try {
            String input1 = null;
            System.out.println(input1.length());
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }





    }

}
