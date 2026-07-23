public class demooo {
     int roolnum;
     String name;
     int marks;
    public static void main(String[] args) {
        demooo st1=new demooo();
        st1.roolnum=1;
        st1.name="John";
        st1.marks=20;

        demooo st2= new demooo();
        st2.roolnum=2;
        st2.name="Jane";
        st2.marks=40;

        demooo st3= new demooo();
        st3.roolnum=3;
        st3.name="Bob";
        st3.marks=50;

        demooo students []= new demooo[3];
        students[0]=st1;
        students[1]=st2;
        students[2]=st3;


//        for(int i=0;i<students.length;i++){
//            System.out.println(students[i].name + ":"+students[i].marks);
//        }
        for (demooo student : students) {
            System.out.println(student.name +":"+student.marks);
        }

    }
}
