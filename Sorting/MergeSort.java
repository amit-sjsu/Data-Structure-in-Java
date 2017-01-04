package Sorting;

public class MergeSort
{
	static int arr[]={3,2,1,9,8,7,0,5,6};
	
	
	public void mergeSort(int [] arr, int p, int r)
	{
		if(p<r)
		{	
			int q=(p+r)/2;
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
			merge(arr,p,q,r);
		}		
		
	}
	
	public void merge(int [] arr, int p, int q,int r)
	{
		//System.out.println("p and r in merge" +p +r);
		int n1=q-p+1;
		int n2=r-q;
		//System.out.println("size "+ n1 + " " + n2 );
		
		
		int [] left=new int[n1+1];
		int [] right=new int[n2+1];
		
		for (int i=0;i<n1;i++) 
		{
			left[i]=arr[p+i];
		//	System.out.println(left[i]);
		}
		for (int i=0;i<n2;i++) 
		{
			right[i]=arr[q+i+1];
		//	System.out.println(right[i]);
		}
		
		left[n1]=1000000;
		right[n2]=1000000;
		
		int i=0;
		int j=0;
		for(int k=p;k<=r;k++)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				//System.out.print(arr[k] + " ");
				i=i+1;
				
			}
			else
				{
				arr[k]=right[j];
				j=j+1;
				//System.out.print(arr[k] + " ");
				}
		  }
				
	}
	
	public void display()
	{
		System.out.println("Array in sorted array  :- ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}	
		
	}
	
	public static void main(String args[])
	{
		MergeSort sort=new MergeSort();
		sort.mergeSort(arr,0,arr.length-1);
		sort.display();	
	}
	
}
