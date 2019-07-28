/*
Largest palindrome product
Problem 4

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
class Problem4{
	
	public static void main(String args[]){
	int total = 0;
		for (int i = 999; i >= 900; i--)
		{
			for (int j = 999; j >= 900; j--)
			{
				total = i * j;
				String s = Integer.toString(total);
				String s2 = new StringBuffer(s).reverse().toString();
				if (s.equals(s2))
				{
					System.out.println("Largest Prime Product Is:-"+total);
					System.exit(0);
				}
				
			}
		}
	//	return 0;
	}
	
}