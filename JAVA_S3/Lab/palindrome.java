import java.util.*;
class Pal{
public static void main(String args[])
{
	String str,rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	str=sc.nextLine();
	int len= str.length();
	for(int i=len-1;i>=0;i--) 
	{
	rev= rev+str.charAt(i);
	}
	if(str.equals(rev))
	{System.out.println("the given string is palindrome");
	}
	else
	{System.out.println("the given string isnt palindrome");
	}
}
}

		
