package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");
        }
    }

   private static int addArguments(String[] args) {
    	
    	int numArgs = args.length;
    	int total = 0;
    	
    	System.out.println(args[0]);
    	System.out.println(args[1]);
    	
    	if((args[0].equals("-")))
    	{
    		for(int i = 1; i < numArgs; i++)
        	{
        		total = total - Integer.valueOf(args[i]);
        	}
    	}
    	else
    	{
    		for(int i = 0; i < numArgs; i++)
    		{
    			total = total + Integer.valueOf(args[i]);
    		}
    	}
    	return total;
    }
}
