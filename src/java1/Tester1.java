package java1;

import java.util.Arrays;

public class Tester1 {

	public static void main(String[] args) {		
		int a[]={1,2,3,4,4,5,5,6,6,6};
		int size = a.length;
		int b[]=Arrays.copyOf(a, size);
		for(int i=0; i<size;i++)
		{
			boolean flag = false;
			int count =0;
			for(int j=0; j<i;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count == 0)
			{
				flag=true;
				//System.out.println(a[i]);
				/*int count1=0;
				for(int k=0;k<b.length;k++)
				{
					if(a[i]==b[k])
					{
						count1++;
					}
				}
				System.out.println("Count of "+a[i]+" is "+count1);
*/			}
			if(flag==false)
			{
				System.out.println(a[i]);
			}
		}
		}
}
