public class computer {
    public void playmusic() {
        System.out.println("Playing music");
    }

    public String getmeapen(int cost) {
        if (cost < 10) {
            return "pen";
        }
        return "nothing";

    }
    }
class demo1{
    public static void main(String[] args) {
         computer comp = new computer();
         comp.playmusic();

         String pen=comp.getmeapen(9);
        System.out.println(pen);
    }
}
