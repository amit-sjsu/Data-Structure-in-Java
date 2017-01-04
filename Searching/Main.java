package Searching;

import java.util.Scanner;

public class Main {

	
	public static void main(String args[])
	{
		BinarySearch bs=new BinarySearch();
		int [] arr={1,2,3,4,5,6,7,8,9};
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the value to be searched");
		int data=inp.nextInt();
		
		bs.search(arr,data);
		
		
		
	}
	
}
