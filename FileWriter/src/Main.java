import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Main {

	public static void main(String[] args) {
	      
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("name,dept\n");
			fw.append("rahul,hr\n");
			fw.append("karan,it\n");
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		File file = new File("test.txt");
		
		if(file.exists()) {
		   System.out.println(file.length());
		}
		
		

	}

}

