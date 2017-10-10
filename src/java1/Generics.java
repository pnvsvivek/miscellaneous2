package java1;

public class Generics {

	/*int x;
	int y;
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
		x++;
		y++;
		System.out.println(x+" and "+y);
		}
	}
	public static void main(String args[])
	{
		Generics gen = new Generics();
		gen.run();
	}*/
	
	public static void main(String args[])
	{
		String word = "Malayalam";
		int len = word.length();
		System.out.println(len);
		boolean flag = false;
		for(int i=0; i<len/2; i++)
		{
			if(Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(len-i-1)))
			{
				flag = true;
				continue;
			}
			flag = false;
			break;
		}
		if(flag == true)
		{
			System.out.println("it is polindrome");
		}
		else
		{
			System.out.println("it is not polindrome");
		}
	}
}
