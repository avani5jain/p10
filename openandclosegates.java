import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack s=new Stack();
		int i,l,c=0;
		l=str.length();
		for(i=0;i<l;i++)
		{ char ch=str.charAt(i);
		if(ch=='('||ch=='['||ch=='{')
		{ s.push(ch);
		}
		if((ch==')'&&ch!=']'&&ch!='}')||(ch==']'&&ch!=')'&&ch!='}')||(ch=='}'&&ch!=']'&&ch!=')'))
		{ s.pop();
		c++;
		}
		}
		if(s.empty())
		System.out.print(c);
		else
		System.out.print(-1);
		
	}
}
