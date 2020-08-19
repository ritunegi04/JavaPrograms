import java.util.Scanner;

public class RotateArray {
	
	public void rotation(int[] arr,int rot)
	{
		for(int i=0;i<rot;i++)
		{
			arrtoRotate(arr);
		}
		
		for(int a:arr)
		{
			System.out.print(a);
			System.out.print(" ");
		}
	}
	
	

	private void arrtoRotate(int[] arr) {
		// TODO Auto-generated method stub
		int len=arr.length;
		int temp=arr[0];
		for(int i=0;i<len-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[len-1]=temp;
	}
	
	



	public static void main(String[] arg)
	{
		int[] arr= {1,2,3,4,5,6};
		int rotation=new Scanner(System.in).nextInt();
		RotateArray rt=new RotateArray();
		rt.rotation(arr,rotation);
		
	}
}
