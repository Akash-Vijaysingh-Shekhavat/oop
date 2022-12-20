package Lab7;


interface Boy {
  void Eat();
}

interface Girl {
    void Dance();
}

class Human implements Boy,Girl {
    public void Eat(){
        System.out.println("Boy is Eating ");
    }
    public void Dance(){
        System.out.println("Girl is Dancing ");
    }
}

public class Minheritance {
    public static void main(String[] args) {
        Human H = new Human();
        H.Eat();
        H.Dance();
    }
}
