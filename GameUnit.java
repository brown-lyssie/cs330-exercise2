// abstract class
public class GameUnit {
    public AttackBehavior attackBehavior;
    public void walk() {}
    // attack-related functions
    public void attack() {
        attackBehavior.attack();
    }
    public void setAttack(AttackBehavior newAttackBehavior) {
        attackBehavior = newAttackBehavior;
    }
    public AttackBehavior getAttack() {
        return attackBehavior; //returns object with the right behavior so that you can use it elsewhere
    }
}