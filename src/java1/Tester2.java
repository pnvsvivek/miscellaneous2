package java1;

public class Tester2 {

	public static void main(String[] args) {
		int n=7;
	/*	for(int i=1;i<=n;i++)
		{
			for(int k=0;k<n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
	
		for(int i=2;i<=n;i++)
		{
			boolean flag = false;
			for(int j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(i);
			}
		}
	}
}
