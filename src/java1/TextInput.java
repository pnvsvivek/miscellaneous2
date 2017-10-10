package java1;

public class TextInput {
	public static void main(String args[])
	{
	int list[] = {1,3,5,7,9};
	int target = 12;
	int a[] = err(list,target);
	for(int l:a)
	{
		System.out.println(l);
	}
	}
	public static int[] err(int[] list, int target)
	{
		Teak tk = new Teak();
		for(int i=0; i<list.length;i++)
		{			
			for(int j=i;j<list.length;j++)
			{
				if(list[i]+list[j]==target)
				{
					int a[] = {i,j};
				}
			}
			System.out.println();
		}
		return null;
		}
}
