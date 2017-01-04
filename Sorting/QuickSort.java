package Sorting;

public class QuickSort 
{
		static int arr[]={9,8,0,6,5,5,0,9,8,7,4,3,6};
		int q;
		int temp;
		
		public void quickSort(int [] arr, int p, int r)
		{
			if(p<r)
			{	
				q=partition(arr,p,r);
				quickSort(arr,p,q-1);
				quickSort(arr,q+1,r);
			
			}		
			
		}
		
		public int partition(int [] arr, int p,int r)
		{
			int pivot=arr[r];
			int i=p-1;
			for(int j=p;j<=r-1;j++)
			{
				if(arr[j]<=pivot)
				{  
					i=i+1;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			temp=arr[i+1];
			arr[i+1]=arr[r];
			arr[r]=temp;
			return i+1;
					
		}
		
		public void display()
		{
			System.out.println("Array in sorted array by Qucik Sort is  :- ");
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]);
			}	
			
		}
		
		public static void main(String args[])
		{
			QuickSort sort=new QuickSort();
			sort.quickSort(arr,0,arr.length-1);
			sort.display();	
		}
		
	}

