
public class LeftAndRightArraySum {
	
	public int sumofElements(int[] arr)
	{
		int leftsum=0,rightsum=0;
		int n=arr.length;
		for(int i=1;i<arr.length;i++)
		{
			rightsum+=arr[i];
		}
		for(int i=0,j=1;j<n;i++,j++)
		{
			rightsum-=arr[j];
			leftsum+=arr[i];
			
			if(leftsum==rightsum)
			{
				return arr[i+1];
			}
		}
		return -1;
		
	}
	
	public static void main(String[] arg)
	{
		int[] arr= {1,2,1,2,7,6 };
		LeftAndRightArraySum object=new LeftAndRightArraySum();
		int element=object.sumofElements(arr);
		System.out.println("Element is : "+element);
	}

}
