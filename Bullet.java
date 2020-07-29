/*
 * Participant: Context
 */

public class Bullet {

    private BulletState state;

    public Bullet() {
        state = new BulletStateFired(); // initial state
    }

    public void goNextState() {
        state.goNext(this);
    }

    // The Context has the state transition information
    public void setState(BulletState state) {
        this.state = state;
    }

}
