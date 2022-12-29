import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:/PersonalGitHub/DATA/testa.csv");

		if (file.exists()) {
			System.out.println("File Exists at=" + file.getAbsolutePath());
			System.out.println("is file hidden=" + file.isHidden());
			System.out.println("file name=" + file.getName());
			file.delete();
			System.out.println(file.exists());

		}
		
		else 
		{
			System.out.println("file doesn't exists");
		}

	}

}
