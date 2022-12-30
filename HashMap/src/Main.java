import java.util.HashMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<Integer, String> emp= new HashMap<Integer, String>();
		emp.put(1, "Rahul");
		emp.put(2, "Karan");
		emp.put(3, "Varun");
		emp.put(4, "Jasmine");
		
		for(int j : emp.keySet())
		{
			System.out.print(j+"=");
			System.out.print(emp.get(j));
			System.out.println();
		}
		

	}

}
