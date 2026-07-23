package encapsulation;
class human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class demo {
    public static void main(String[] args) {
        human h = new human();
        h.setName("Dinesh");
        h.setAge(20);
        System.out.println(h.getName());
        System.out.println(h.getAge());

    }
}
