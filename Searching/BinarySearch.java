package Searching;

public class BinarySearch {
	
	
	
	public void search(int [] arr, int data)
	{
		boolean flag=false;
		int start=0;
		int end=arr.length;
		while(start<end)
		{
			int mid=(start+end)/2;
			
			if(arr[mid]==data)
			{
				flag=true;
				break;
			}
			else if(arr[mid]>data)
			{
				end=mid-1;
			}
			else if(arr[mid]<data)
			{
				start=mid+1;
			}	
			
		}
		if(flag){
			System.out.println(" Value is present in the array");
		}
		else
		{
			System.out.println(" Value is  NOT present in the array");
		}
		
		
	}

}
