class demo{
    String mobilename;
    int charging;
}
class mobiletest extends demo{

}


class mobile{
    public static void main(String[] args) {
        mobiletest m = new mobiletest();
        m.mobilename="redmi";
        m.charging=100;
        System.out.println(m.mobilename);
        System.out.println(m.charging);
    }
}
