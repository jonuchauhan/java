
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor visitor_1 = new Visitor("john");
		Visitor visitor_2 = new Visitor("nick", 30);
		Visitor visitor_3 = new Visitor("rahul", 28, "jaipur");
		Visitor visitor_4 = new Visitor("varun", 45, "banglore", "casual meet with friends");

		System.out.println(visitor_1.toString());
		System.out.println(visitor_2.toString());
		System.out.println(visitor_3.toString());
		System.out.println(visitor_4.toString());

	}

}
