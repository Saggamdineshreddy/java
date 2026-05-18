public class methodoverloading {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public  double add(int a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        System.out.println(obj.add(1,1.2));
    }
}
