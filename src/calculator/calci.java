package calculator;

public class calci {
  int a;
  int b;

  public int add(int a, int b) {
      this.a = a;
      this.b = b;
      return a + b;
  }
  public int sub(int a ,int b){
      this.a = a;
      this.b = b;
      return a - b;
  }
  public int mul(int a,int b){
      this.a = a;
      this.b = b;
      return a * b;
  }

    public static void main(String[] args) {
      calci calculator = new calci();
      System.out.println(calculator.add(1456,2));
      System.out.println(calculator.sub(2000,300));
      System.out.println(calculator.mul(2876,3));


    }
}
