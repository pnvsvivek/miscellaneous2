package java1;

public class Random {

	public static void main(String[] args) {
		permute(new int[]{2,3,4,5});
	}
	
	public static void permute(int[] a)
	{
		permuteHelper(a,0);
	}
	public static void permuteHelper(int[] a, int index)
	{
		if(index>=a.length-1 && index==a.length)
		{
			for(int i=0; i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
		for(int i=index;i<a.length;i++)
		{
			int t=a[index];
			a[index]=a[i];
			a[i]=t;
			
			permuteHelper(a,index+1);
			
			t=a[index];
			a[index]=a[i];
			a[i]=t;		
		}
	}
}
