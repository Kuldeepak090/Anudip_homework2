
package anudip_homework2;
import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 
		//Take input from the user
	      System.out.print("Enter a sentence: ");  
	      String str=sc.nextLine();
	      
	    //method call
	      middleCharacter(str);   
		}
	
	     //method define

		static void middleCharacter(String str)  
		{
			
			//split the sentence
		   String[] val=str.split(" "); 
		   int middle=0;
		   
		 //find middle value of sentence
		    middle=(0+val.length)/2; 
		    
		  //print middle value
		     System.out.println(val[middle]);
		   
		
		}

	}


