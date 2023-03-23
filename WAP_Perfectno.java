package prog;

public class WAP_Perfectno {

	public static void main(String[] args) {
	  int no=28;
	  int copy=no;
	  int sum=0;
	  for (int i = 1; i <=no/2; i++) {
		  if(no%i==0)
		  {
			  sum=sum+i;
			  
		  }
		  }
	  if(copy==sum)
	  {
		  System.out.println(no+" it is perfect number");
	  }else{
		  System.out.println(no+" it is not perfect number");
	  }
	}

}
