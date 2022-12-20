package Exception;

import test1.Array;

public class All {
    public static void main(String[] args) {
        try {
            int n = 5 / 0;
            System.out.println(n);


            int[] arr = new int[]{1, 2, 3, 4, 5};
            for (int i = 0; i < 9; i++) {
                System.out.println(arr[i]);
            }
            String input1 = null;
            System.out.println(input1.length());
        }


        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        catch (NullPointerException w) {
            System.out.println(w);
        }
        catch(Exception e){
            System.out.println(e);
        }





    }
}

