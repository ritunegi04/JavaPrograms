import java.util.HashSet;
import java.util.Scanner;

public class ArraySubsetsForSum {
	
	public void findSubsets(int sum)
	{
		int[] a= {1, 8, 45, 6, 10, 8,15,2 };
		int temp;
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int b:a)
		{
			temp=sum-b;
			if(hs.contains(temp))
			{
				System.out.println("Elements "+b + " and "+temp + " sum to "+sum );
			}
			hs.add(b);
		}
	}
	
	public static void main(String[] arg)
	{
		int sum=new Scanner(System.in).nextInt();
		ArraySubsetsForSum arr=new ArraySubsetsForSum();
		arr.findSubsets(sum);
		
	}

}
