import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("test.txt");
			
			try {
				int  data = fr.read();
				while(data!=-1)
				{
					System.out.print((char)data);
					data = fr.read();
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
		
		

	}

}
