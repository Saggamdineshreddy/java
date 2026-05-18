public class constructor {
    String name;
    int age;

    constructor(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {

        System.out.println(this.name + " " + this.age);
    }

    public static void main(String[] args) {
        constructor sc =new constructor("dinesh",21);
        System.out.println(sc.name);
        System.out.println(sc.age);
    }
}
