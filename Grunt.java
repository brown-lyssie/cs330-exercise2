public class Grunt extends GameUnit {
    public Grunt(){
        System.out.println("new Grunt");
        // set default attack
        attackBehavior = new UsePistol();
    }
}