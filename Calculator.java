public class Calculator {
public static boolean isNumeric(String str) throws IllegalArgumentException   //Exception handling function
{  
  try  
  {  
    double d = Double.parseDouble(str);  //checks if the input is an int or a double
  }  
  
  catch(IllegalArgumentException n)  
  {  
    return false;  
  }  
  return true;  
}


	    public static void main (String args[]) throws Exception { //main function
	    	double c = 0, d = 0;
	    	double a = 0;
	    	String b = args[1];
	    	char ch = ' ';
	    	
	    	for (int i = 0; i < args.length; i++){ // Enters command line input in function
	            a = Integer.parseInt(args[i]) ;    //Turns the first input into an double
	            if(!isNumeric(args[i]))           //Checks if input is a number
	            throw new NotANumberException(); // Throws an exception
	            i++;							
	            if(isNumeric(args[1]))			//Checks if command line input is an operator
	            throw new IllegalOperationException(); // Throws an exception if it is not an operator
	            ch = b.charAt(0);
	            i++;
	            c = Integer.parseInt(args[i]) ;
	            if(!isNumeric(args[i]))
	            throw new NotANumberException();
	            if(args[2] == null && args[1] == null)
	            	throw new NotEnoughNumbersException();
	    	}
	    	
	       
	            
	       if (b.charAt(0) == 'x')							//Multiply function for calculator
	        {
	        	d = a * c;
	        	System.out.println(a + " x " + c + " = " + d);
	        }
	           else if (b.charAt(0) == '-')					//Subtract function for calculator
	           {
	        	   d = a- c;

	   	        System.out.println(a + " - " + c + " = " + d);

	           }
	           else if (b.charAt(0) == '/')					//Divide function for calculator		
	           {
	        	   try {
	        	
	        	   d = a /c;
	        	   
	        	   System.out.println(a + " / " + c + " = " + d);
	        	   }
	        	   catch (ArithmeticException e) {
	        		      System.out.println("Unable to divide by 0!");
	        		 
	        		    }
	           }
	           else if (b.charAt(0) == '+')					//Add function for calculator	
	           {
	        	   d = a + c;
	        	   System.out.println(a + " + " + c + " = " + d);
	           }

	        
	}


		private static Exception IllegalOperationException(String string) {
			// TODO Auto-generated method stub
			return null;
		}
}

