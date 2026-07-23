public class constructor {
        int age;
        String name;
    constructor() {

    }
    constructor(int age, String name) {
        this.age = age;
        this.name = name;
    }
    constructor(int age) {
        this.age = age;
    }
    constructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        constructor obj = new constructor(22,"ram");
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}