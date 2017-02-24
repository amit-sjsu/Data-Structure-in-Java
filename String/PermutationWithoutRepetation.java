
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PermutationWithoutRepetation {
	
	
	
	public static Set<String> generatePerm(String input)
	{
	    Set<String> set = new HashSet<String>();
	    if (input == "")
	        return set;

	    Character a = input.charAt(0);
	    if (input.length() > 1)
	    {
	        input = input.substring(1);

	        Set<String> permSet = generatePerm(input);
	        for (String x : permSet)
	        { 
	        	
	            for (int i = 0; i <= x.length(); i++)
	            {  
	                set.add(x.substring(0, i) + a + x.substring(i));
	                
	            }
	        }
	    }
	    else
	    {
	    
	        set.add(a + "");
	    }
	    return set;
	}
	
	
	public static void main(String args[]){
		
	Scanner inp=new Scanner(System.in);
	System.out.print("Enter string for permutation");
	String s=inp.next();
   
	PermutationWithoutRepetation s1=new PermutationWithoutRepetation();
    Set<String> fina= s1.generatePerm(s);
    for (Iterator<String> it = fina.iterator(); it.hasNext(); ) {
        String f = it.next();
            System.out.println(f);
    }
	}

}

	
