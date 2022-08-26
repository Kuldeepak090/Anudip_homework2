package anudip_homework2;
import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");  
        
      //Take input from the user
        String str=sc.nextLine(); 
        
      //method call
         countVowel(str);  
         
	
	
	}
	
	 //method define
	
	static void countVowel(String str)   
	{
		 int count=0;
		 
		 //use loop to access the character       
        for(int i=0;i<str.length();i++)
        {
        	
        	//check the condition if any vowels(a,e,i,o,u) is present then incerement the count value
       	 if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
       	 {                    
       		 count=count+1;
       		
       	 }
        }
        
        //print the total number of vowels present.
        System.out.println("The number of vowels : "+count);           

	}

	}


