//Project Euler Problem 1

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/
class Problem1{
	public int sum(){
		int sum1=0,sum2=0;
		
		for(int i=0;i<1000;i++){
			if (i%3==0)
					sum1=sum1+i;

			if (i%5==0 && i%3!=0)
					sum2=sum2+i;
						
		}
		return (sum1+sum2);
		
	}
	
	public static void main(String args[]){
			Problem1 p=new Problem1();
			int n=p.sum();
			System.out.println("Sum of Multiplies is:-"+n);
	}
}