
public class Main {

	public static void main(String[] args) {
		System.out.println(Friends.numoffriends);

		Friends friend_1 = new Friends("karan");

		System.out.println(Friends.numoffriends);

		Friends.totalfriends1();// static functions can be accessed without creating a instance

		Friends friend_2 = new Friends("Rahul");

		System.out.println(friend_2.name);
		System.out.println(friend_1.name);
		System.out.println(Friends.numoffriends);
		
		Friends.totalfriends1();
		

	}

}
