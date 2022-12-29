
public class Main {

	public static void main(String[] args) {
		Hawk hawk = new Hawk();
		Fish fish = new Fish();
		Rabbit rabbit = new Rabbit();
		hawk.hunt();
		rabbit.flee();
	    fish.flee();
       	fish.hunt();

	}

}
