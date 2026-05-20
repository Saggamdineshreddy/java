public class demo {
    String name;
    int age;

    demo() {

    }

    demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Age(int age) throws Exception {
        if (age < 0) {
            throw new Exception("Age is negative");
        }
        if (age < 18) {
            throw new Exception("Age is less than 18");
        }
    }

    public static void main(String[] args) {
        try {
            demo per = new demo();
            per.name = "dinesh";
            per.Age(17);
        }
        catch (Exception e) {
            System.out.println(e.getMessage()+"you are not a human "+" enter your details correctly");
        }
        finally {
            System.out.println("Done");
        }
    }
}
