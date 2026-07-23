abstract class car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("music playing");
    }
}

    class Bmw extends car{
        public void drive(){
            System.out.println("bmw drive");
        }
    }

public class abstractttt {
    public static void main(String[] args) {
        car C = new Bmw();
        C.drive();
        C.playMusic();
    }
}
