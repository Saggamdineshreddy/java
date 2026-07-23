package oops;

class A{
    public void show(){
        System.out.println("A");
    }
}
class B extends A{
    public void show(){
        System.out.println("B");
    }
}





public class poly {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj =new B();
        obj.show();

    }



}
