public class Tank extends GameUnit {
    public Tank(){
        System.out.println("new Tank");
        // set default attack
        moveBehavior = new DriveBehavior();
        attackBehavior = new UseRocket();
    }
}