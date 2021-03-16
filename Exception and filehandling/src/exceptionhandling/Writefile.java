package exceptionhandling;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Globalwarming.txt");
			fw.write("Global warming, the gradual heating of Earth's surface, "
					+ "oceans and atmosphere, is caused by human activity,"
					+ " primarily the burning of fossil fuels that pump carbon dioxide (CO2), "
					+ "methane and other greenhouse gases into the atmosphere.");
			fw.close();
			System.out.println("file has been written successfully");
		}
		catch(IOException e)
		{
			System.out.println("error occured");
		}
		
		// TODO Auto-generated method stub

	}

}
