/*
 * State design pattern
 */
public class Main {

    public static void main(String[] args) {

        // 'b1' is fired
        Bullet b1 = new Bullet();

        // now, 'b1' hit the target and explodes
        b1.goNextState();

        // 'b2' is fired
        Bullet b2 = new Bullet();

        // now, 'b1' is done
        b1.goNextState();

        // now, 'b2' hit the target and explodes
        b2.goNextState();

        // now, 'b2' is done
        b2.goNextState();

    }

}
