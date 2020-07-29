/*
 * Participant: ConcreteState
 */

public class BulletStateFired implements BulletState {
	
	public BulletStateFired() {
		System.out.println("A bullet is fired!");
	}

	@Override
	public void goNext(Bullet context) {
		context.setState(new BulletStateExplosion());
	}
	
}
