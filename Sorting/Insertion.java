package Sorting;

public class Insertion 
{
	
	
	public static void insertionSort(int [] test)
	{   int key;
		int i;
		
		for(int j =1;j<test.length;j++)
		{
			key=test[j];
			i=j-1;
			while(i>-1 & test[i]> key)
			{
				test[i+1]=test[i];
				i=i-1;
				if(i== -1)
				{
					break;
				}		
			}
			test[i+1]=key;
							
		}
	
		System.out.println("Sorted Array is");
		for (int k=0;k<test.length;k++)
		{
			System.out.print(test[k]+ " ");
		}
		
	}

	public static void main(String ars[])
	{
		
		int [] test={9,8,5,4,3,6,7,1,10,56,44,78,33,10};
		insertionSort(test);
	}

}
