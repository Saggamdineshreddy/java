public class person {
    String name = "dinesh";
    int age = 21;
    String loc = "paris";

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(loc);
    }

    public int info(){
        return 21;
    }
    public void  message(String msg){
        System.out.println(msg);
    }
    public double price(double price){
        System.out.println("the price is :"+ price);
        return price;
    }
}






