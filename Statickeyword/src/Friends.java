
public class Friends {
	
	String name;
	static int numoffriends;
	
	Friends(String name){
		this.name=name;
		numoffriends=numoffriends+1;
		
	}
	
	void totalfriends() {
		System.out.println("You have " + this.numoffriends +" friends");
		
	}
	
	
	static void totalfriends1() {
		System.out.println("You have " + numoffriends +" friends");
		
	}

}
