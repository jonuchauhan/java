import java.util.Random;
public class DiceRoll {
	Random random = new Random();
	int number;
	DiceRoll(){
		
		
	     number= random.nextInt(6)+1;
	    
	    }
	
	void show() {
		
		System.out.println(number);
	}

}
