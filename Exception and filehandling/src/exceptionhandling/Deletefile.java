package exceptionhandling;
import java.io.File;
public class Deletefile {

	public static void main(String[] args) {
		File f = new File ("globalwarming.txt");
		if(f.delete())
		{
			System.out.println("file will be deleted" + f.getName());
		}
		else
		{
			System.out.println("Error occurred");
		}
		// TODO Auto-generated method stub

	}

}
