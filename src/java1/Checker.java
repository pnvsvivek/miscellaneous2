package java1;

public class Checker {

	/*public void runer()
	{
		System.out.println("my name is vivek");
	}
	
	public static void ruiner()
	{
		System.out.println("villa");
	}*/
	public static void main(String[] args) {
		String name = "missisippi";
		String name2 = "";
		int size = name.length();
		for(int i=0; i<size;i++)
		{
			int count =0;
			for(int j=0;j<i;j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				name2=name2+name.charAt(i);
			}
		}
		System.out.println(name2);
		for(int i=0;i<name2.length();i++)
		{
			int count = 0;
			for(int j=0; j<name.length();j++)
			{
				if(name2.charAt(i)==name.charAt(j))
				{
					count++;
				}
			}
			System.out.println("Character "+name2.charAt(i)+" count is "+count);
		}
	}
}
