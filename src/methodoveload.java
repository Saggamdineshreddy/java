class demo {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public int add(double a, double b) {
        return (int) (a + b);
    }
}
class methodoverload {
    public static void main(String[] args) {
       demo d1 = new demo();

        System.out.println(d1.add(1,2,3));
    }
}
