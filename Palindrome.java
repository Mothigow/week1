package week1.day2;

public class Palindrome {
	public static void main(String[] args) 
	{
		String pal = "madam";
		Palindrome obj = new Palindrome ();

		obj.reverseString(pal);
		
	}
	public static boolean isPalindrome(String input)
	{
		int length = input.length();
		int leftPtr = 0;
		int rightPtr = length -1;
		while(leftPtr <  rightPtr)
		{
			if(input.charAt(leftPtr) != input.charAt(rightPtr))
			{
				return false;
			}
			else
			{
				leftPtr++;
				rightPtr--;
			}
		}
		return true;
	}
	
	public void reverseString (String input)
	{
		        String revString = "";
		        int count = input.length();
		
				for (int i = count-1; i >= 0 ; i--) 
				{
					revString = revString + input.charAt(i);
				}		
				
           if(revString.equalsIgnoreCase(input))
           {

   			System.out.println(input + " is a Palindrome");
   		}
   		else
   		{
   			System.out.println(input + " is not a Palindrome");
   		}
		
	}
}
