package operators;

public class sumofdigitsinnumber {

	public static void main(String[] args)
	{
		int num = 1234;   // You can change this number
        int sum = 0;

        while (num != 0)
        {
            int digit = num % 10;  
            sum = sum + digit;     
            num = num / 10;        
        }

        System.out.println("Sum of digits: " + sum);

	}

}
