// abstract class
public class GameUnit {
    public void attack(){}
    public void walk() {
        System.out.println(this.getClass().getName() +":walking");
    }
}