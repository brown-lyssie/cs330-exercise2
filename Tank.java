public class Tank extends GameUnit {
    public Tank(){
        System.out.println("new Tank");
    }
    public void attack(){
        System.out.println("Tank:shooting with canon");
    }
    public void walk(){
    //overide tanks don't walk
        System.out.println("Tank:driving");
    }
}