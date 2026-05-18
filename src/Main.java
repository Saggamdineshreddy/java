public class Main{
    public static void main(String[] args) {
        int num =1;
        char c ='a';
        String name ="dinesh";
        double d=10.5;
        boolean b=false;


//        System.out.println(name);
//        System.out.println("hii");

        person p=new person();
        p.display();
        int infor = p.info();
        System.out.println(p.info());
        System.out.println(infor);

        p.message("hello");

        double mrp  =p.price(300.5);


//        System.out.println(p.name);
//        System.out.println(p.age);
//        System.out.println(p.loc);
    }
}