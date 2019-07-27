/*
Largest prime factor
Problem 3

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
class NewProblem3{
	public static void main(String args[]){
		long n = Long.parseLong("600851475143");
		long copyInput=n;
		long i = 2;
		while(i*i<n){
			while(n%i==0){
				n=n/i;
			}
			i=i+1;
		}
		System.out.println(n);
	}
}