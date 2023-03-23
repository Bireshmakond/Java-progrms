package prog;

import java.util.Arrays;

public class AnagramNumber {

	public static void main(String[] args) {
		String first="bat";
		String second="tab";
		if(first.length()==second.length())
		{
			boolean flag=true;
			char ch[]=first.toCharArray();
			char ch1[]=second.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			for (int i = 0; i < ch1.length; i++) {
				if(ch[i]!=ch1[i])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println("it is a Anagram number ");
			}else{
				System.out.println("it is not a Anagram number ");
			} 
		}else{
			System.out.println("it is not a Anagram number ");
		}

	}

}
