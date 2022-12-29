
public class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("hunting");
		
	}

	@Override
	public void flee() {
		System.out.println("fleeing");
		
	}

}
