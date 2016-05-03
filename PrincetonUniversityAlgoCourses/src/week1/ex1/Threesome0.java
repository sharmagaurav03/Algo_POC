package week1.ex1;

import java.util.Arrays;

public class Threesome0 {
	
	public static void main(String...strings)
	{
		int[] arr=new int[]{-40,-20, -10, 0, 5, 10, 30, 40};
		System.out.println(find3SumTo0(arr));
	}
	
	static int find3SumTo0(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1; j<n-1;j++)
			{
				int index=Arrays.binarySearch(arr, j+1, arr.length, -(arr[i]+arr[j]));
				if(index>=0)
				{
					
					System.out.println(arr[i]+" "+arr[j]+" "+arr[index]);
//					return index;
					
				}
			}
		}
		return-1;
	}

}
