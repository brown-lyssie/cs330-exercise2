// abstract class
public abstract class GameUnit() {
    MoveBehavior moveBehavior;

    public void setMoveBehavior(MoveBehavior mb) {
        moveBehavior = mb;
    }

    public GameUnit() {
    }

    public void move() {
        moveBehavior.move();
    }
}