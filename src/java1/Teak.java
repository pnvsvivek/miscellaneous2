package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Teak {

	public static void main(String[] args) {

		/*List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(2);
		Collections.shuffle(list);
		System.out.println(list);
		Integer array[] = {1,2,3,4};
		List<Integer> lister = Arrays.asList(array);
		System.out.println(lister);
		Integer a[] = new Integer[lister.size()];
		lister.toArray(a);
		for(Integer i:a )
		{
			System.out.println(i);
		}*/
		//System.out.println(Math.random());
		int[] a={6,7,4,3};
		int n=a.length;
		for(int i=0; i<a.length;i++)
		{
			int r=i+(int)(Math.random()*(n-i));
			int t=a[r];
			a[r]=a[i];
			a[i]=t;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
