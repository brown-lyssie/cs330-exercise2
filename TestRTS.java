// main function
public class TestRTS {
    public static void main(String[] args) {
        GameUnit grunt = new Grunt();
        GameUnit tank = new Tank();
        // grunt.walk();
        // tank.walk();
        //test attacks
        System.out.println("Testing attacks...");
        //test grunt attacks
        grunt.attack();
        // set grunt attack to axe
        grunt.setAttack(new UseAxe());
        grunt.attack();
        //test tank attacks
        tank.attack();
        // set tank attack to canon
        tank.setAttack(new UseCanon());
        tank.attack();
    }
}