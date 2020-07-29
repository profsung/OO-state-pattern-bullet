/*
 * Participant: ConcreteState
 */

public class BulletStateExplosion implements BulletState {

	public BulletStateExplosion() {
		System.out.println("The bullet explodes!");
	}

	@Override
	public void goNext(Bullet context) {
		context.setState(new BulletStateDone());
	}

}
