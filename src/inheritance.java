abstract class car {
    String name;

    void type() {
        System.out.println("car is moving");
    }
}
      class car1 extends car {
        @Override
        void type() {
            System.out.println("disel car");
        }
    }
      class car2 extends car {
        void type(){
            System.out.println("electric car");
        }
    }

public class inheritance {
    public static void main(String[] args) {
//        car c = new car();
//        c.name="BMW";
//        c.type();
//        System.out.println(c.name);
        car1 obj =new car1();
        obj.name="bmw";
        obj.type();
        System.out.println(obj.name);
    }
}
