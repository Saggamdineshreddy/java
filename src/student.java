public class student {

    student(){

    }
    student(String name, int age){
        this.name = name;
        this.age = age;
    }
    private String name;
    private int  age;

    public void setName(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }

    public String getName() {
            return name;
    }

    public int getAge() {
        return age;
    }

    public void Studentbeh(){
//        System.out.println("my name is "+name);
//        System.out.println("my age is "+age);
//        System.out.println("Bhehavior is :"+"Lazy");
    }
}
