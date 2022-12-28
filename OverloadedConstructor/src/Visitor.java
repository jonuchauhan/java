
public class Visitor {

	String name;
	int age;
	String city;
	String purpose;

	Visitor(String name) {
		this.name = name;

	}

	Visitor(String name, int age) {
		this.name = name;
		this.age = age;

	}

	Visitor(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;

	}

	Visitor(String name, int age, String city, String purpose) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.purpose = purpose;

	}

	public String toString() {

		if (this.name.length() > 0 && this.age == 0 && this.city==null && this.purpose==null) {
			return this.name;
		} else if (this.name.length() > 0 && this.age != 0 && this.city==null && this.purpose==null) {
			return this.name + "\n" + this.age;
			
		}

		else if (this.name.length() > 0 && this.age != 0 && this.city!=null && this.purpose==null) {
			return this.name + "\n" + this.age + "\n" + this.city;

		}

		else

			return this.name + "\n" + this.age + "\n" + this.city + "\n" + this.purpose;

	}

}
