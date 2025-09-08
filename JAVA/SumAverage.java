class SumAverage
{
	public static void main(String[] args)
	{
		int a=20,b=45,c=30,sum;
		float avg;
		
		sum=a+b+c;
		//avg = sum/3;
		avg = (float)sum/3; // typecasting
		System.out.println("The Sum Of Three Numbers is :"+ sum);
		System.out.println("The average of Three Numbers is: "+avg);
	}
}