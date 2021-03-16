package exceptionhandling;

public class arithmetic {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 try {
	            int a = 30;
	            int b = 0;
	            int c = a/b; 
	            
	            System.out.println ("c");
	        }
		 
	        catch(ArithmeticException e)
		 {
	            System.out.println ("it will be an error");

	}
		
		//ArrayIndex OutofBond exception
		try {
			int a[] = new int[5];
			
	         System.out.println( a[8]);
	         
	      } 
		catch (ArrayIndexOutOfBoundsException e)
		{
	         System.out.println( e);
	      }
		
		//Nullpointer Exception
		
		try
		{
			String S  ="Null";
			if("java".equals(S))
			{
				System.out.println("equal");
			}
			
			else
			{
				System.out.println("Not equal");
			}

			
		}
	     catch(NullPointerException e)
		{
	    	 System.out.println("Nullpointer Exception");
	    	 
		} 
	    	 //NumberFormat Exception
	    	 

	         try 
	         {
	             
	             int num = Integer.parseInt ("akki") ;
	  
	             System.out.println(num);
	         } 
	            catch(NumberFormatException e) 
	         {
	             System.out.println("Number format exception");
	    	 }
		}
		}


