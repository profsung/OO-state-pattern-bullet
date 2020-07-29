/*
 * Participant: ConcreteState
 */

public class BulletStateDone implements BulletState {

	public BulletStateDone() {
		System.out.println("This bullet is done.");
	}

	@Override
	public void goNext(Bullet context) {
		context.setState(null); // end state
	}

}
