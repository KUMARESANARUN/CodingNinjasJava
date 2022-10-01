package Interview;
import java.util.*;  


public class Ambition {


	   public static void main(String args[]) {
	       
		   
		   Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		  
		   String S= sc.nextLine();      
		   
		   int O =0;
		   
		   int E =0;
		   
		   int diff =0;
		   for(int i=0;i<S.length();i++)
			{ 
			     if (i%2==0)
			     {
			    	O += 0+S.charAt(i);
			 	  }
			     else
			    	 
			     {
			    		E += 0+S.charAt(i); 
			     }   
	     	}
		     System.out.println(O) ;	
		     System.out.println(E) ;
		     diff =O-E;
		     
		     int check =Math.abs(diff);
		     
		    
		     System.out.println(check);
		     
	  
		    	   int i =2;
		  	     
		  	     boolean isPrime =true;
		  	     
		  	     while(i<=check-1)
		  	    	 
		  	     {
		  	    	   if(check%i==0)
		  	    	   {
		  	    		   isPrime =false;
		  	    		   System.out.println("Casula String");
		  	    		   return;
		  	    	   }
		  	    	  
		  	    	   i++;
		  	    	   
		  	    	 
		  	     }
		  	     System.out.println("Prime String");
		    
		   
		
		   
	      
}
	   

}
  