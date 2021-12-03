package week1.day2;

public class Negativetopositive {
	
public static void main(String[] args) {
		
		int num = - 25;
		
		if(num < 0)
		{
	
			num = num * -1;
			System.out.println("The number -" + num + " is converted to " + num);
		}
		else if (num > 0)
		{
			System.out.println("The given number " + num +" is already a positive number");
		}
		else
		{
			System.out.println("The number is neither negative nor positive");
		}

	}


}
