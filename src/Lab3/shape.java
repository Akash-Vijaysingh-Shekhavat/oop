package Lab3;
import java.util.Scanner;

public class shape {
    Scanner sc = new Scanner(System.in);
    float a;
    float b;
    public float getA(){
        return a;
    }
    public void setA(float a){
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public void setArea(){
        System.out.println("setArea() - Area methord for shape class");
    }


    public class Triangle extends shape {
        public void setArea(float base, float height) {
            float area = base * height * 0.5f;
            System.out.println("Area of triangle of base " + a + " and height "
                    + b + " is : " + area);
        }
        public void getInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter base and height");
            a = sc.nextFloat();
            b = sc.nextFloat();
        }
    }
}
