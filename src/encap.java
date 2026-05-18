public class encap {
    private String name;
    private int age;

    public void setName(String name) {
            this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    encap(){

    }
    encap(String name, int age){
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        encap sc = new encap();
        sc.name="dinesh";
        sc.age=20;
        System.out.println(sc.name);
        System.out.println(sc.age);
    }
}
