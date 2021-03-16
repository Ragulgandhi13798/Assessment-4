package exceptionhandling;

import java.io.File;
import java.io.IOException;
public class Createfile {

	public static void main(String[] args) {
		try
		{
			File f = new File("C:\\Users\\ragv2c18472\\Documents\\Globalwarming.txt");
			if(f.createNewFile())
			{
				System.out.println("File has been created");
			}
			else
			{
				System.out.println("file already exists");
			}
			
		}
		catch(IOException e)
		{
			System.out.println("Error has been occured");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
