package prog;

public class Findout_1to100_prime_numbers {

	public static void main(String[] args) {
		for(int i=2;i<=100;i++)
		{
			int count=0;
			int no=i;
			boolean flag=true;
			for (int j = 2; j <no; j++) {
				if(no%j==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag==true)
			{
				
				System.out.println(no+" prime no");
				}else{
					System.out.println(no+ " it is not prime no");
					
				}

		}

		}
	}
