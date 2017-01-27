package adder;

public class Main {

   public static void main(String[] args) {
        try {        
            int result = addArguments(args);
            System.out.println(result);
        }
          catch (NumberFormatException nE) {
            System.err.println("Please provide integers to add");
          }
          catch (IllegalArgumentException e) {
            System.err.println("List numbers to Add. Precede list with a '-' to Subtract");
          }
    }

  private static int addArguments(String[] args) {
    	
    	int numArgs = args.length;
    	int total = 0;
    	
    	for(int i = 0; i < numArgs; i++)
    	{
    		total = total + Integer.valueOf(args[i]);
    	}
    	
    	return total;
    }
}
