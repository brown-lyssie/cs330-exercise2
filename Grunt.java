public class Grunt extends GameUnit {
    public Grunt(){
        System.out.println("new Grunt");
        moveBehavior = new WalkBehavior();
        // set default attack
        attackBehavior = new UsePistol();
    }
}