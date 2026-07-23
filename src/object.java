public class object {
    public int add(int num1 , int num2){
//        System.out.println("in");
//        return 0;
//        int r = num1+num2;
//        return r;
        return num1 + num2;
    }

    public static void main(String[] args) {
//        int num1=10;
//        int num2=20;
        object obj = new object();
//        obj.add(1,2);
//        System.out.println(obj.add(10,30));
////        System.out.println(num1+num2);
        System.out.println(obj.add(1,2));
    }
}
