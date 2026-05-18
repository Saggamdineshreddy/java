public class Main {
    public static void main(String[] args) {
        student sc=new student();

//        sc.setname="Dinesh";
//        sc.age=21;
//        sc.setName("Dinesh");
//        sc.setage(21);
        System.out.println(sc.getName());
        System.out.println(sc.getAge());


        student sc1=new student("Dinesh",21);
        System.out.println(sc1.getName());
        System.out.println(sc1.getAge());
    }
}