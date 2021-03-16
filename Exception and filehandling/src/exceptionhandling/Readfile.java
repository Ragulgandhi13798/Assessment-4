package exceptionhandling;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Readfile {

	public static void main(String[] args) {
		try
		{
			File f = new File("globalwarming.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine())
			{
				String data = sc.nextLine();
				System.out.println(data);
			}
		}
		catch(IOException e)
		{
			
		}
		// TODO Auto-generated method stub

	}

}
