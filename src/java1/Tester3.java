package java1;

public class Tester3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int z=(2*i-1)/2;
			for(int m=0;m<n-i;m++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<(2*i-1);j++)
			{
			if(j<z)
			{
				System.out.print("* ");
			}
			else if(j==z)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("* ");
			}
			}
			System.out.println();
			}
		}
}
