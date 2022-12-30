enum Planet {
	MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URANUS(7), NEPTUNE(8), PLUTO(9);

	int number;

	Planet(int number) {
		this.number = number;
	}

};

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planet planet = Planet.EARTH;
		System.out.println(planet.number);

	}

}
