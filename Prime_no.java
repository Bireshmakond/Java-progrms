package prog;

public class Prime_no {

	public static void main(String[] args) {
		int no=7;
		boolean flag=true;
		for (int i = 2; i <no; i++) {
			if(no%i==0)
			{
			flag=false;
			break;
			
		}
		}
		if(flag==true)
		{
			System.out.println(no+"it is prime no");
		}else{
			System.out.println(no+"it is not prime no");
			
		}
	}

}
