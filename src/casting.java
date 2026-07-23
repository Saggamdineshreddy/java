class a {
    public void show(){
        System.out.println("A");
    }
}

class b extends a{
    public void show1(){
        System.out.println("B");
    }
}

class casting {
    public static void main(String[] args) {
        a obj = new b();
        obj.show();

        b obj1 = (b) obj;
        obj1.show1();
    }
}