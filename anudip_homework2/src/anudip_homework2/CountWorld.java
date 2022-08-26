package anudip_homework2;
import java.util.Scanner;

public class CountWorld {

		
		public static void main(String... args) {
			// TODO Auto-generated method stub
	         Scanner sc=new Scanner(System.in);
	         
	       //Take output from user
	         System.out.println("Enter a Sentence: ");
	         String str=sc.nextLine();
	         
	       //method call
	        countWord(str);           
		}
		
		//method define
		
		static void countWord(String str) 
		{
			 //split the sentence into words
			 String[] val=str.split(" ");
	         int count=0;
	         for(int i=0;i<val.length;i++)
	         {
	        	//count the words//count the words
	        	 count++;  
	        	 
	         }
	         
	       //print total words present in a sentence
	         System.out.println("The total words present is: "+count);      
		}
	}

