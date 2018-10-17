package stringminipulator;

public class attempt1 
{
	//noVowels
	

	
	public String noVowels(String str)
	{
		
		
		boolean tryAgain = true;
		while(tryAgain)
		{
			
			String newStr = "";
		
			int stringlength = str.length();
		
			for(int i = 0; i < stringlength ; i++);
			{
				char letter = str.charAt(i);
				//or str.charAt(i) == 'a'||
				if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
				{
					newStr+='*';
				}
				else
				{
					newStr+= letter;
				}
			}
		
			//do you want to play again?
		}
		
		public String reverse(String str) 
		{
			String newStr = "";
			
			int stringlength = str.length();
			
			for(int i = 0; i < stringlength ; i++);
			{
				
				
				
				
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
}
