// main function
public class TestRTS {
    public static void main(String[] args) {
        GameUnit grunt = new Grunt();
        GameUnit tank = new Tank();
        grunt.walk();
        tank.walk();
        grunt.attack();
        tank.attack();
    }
}