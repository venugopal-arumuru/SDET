package com.java.development;

public class ArithematicOperations {

	public int Addition(int x, int y)
	{
		return x+y;
	}
	
	public int findMax(int arr[]){  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
	
	public void Performance()
	{
		for(int i=1;i<=1000;i++) {
			System.out.print(i + "  ");
		}
			System.out.println("Loop Done");
	}

	
	public void ExceptionHandle(int n)
	{
		int div = 10/n;
		System.out.println("Result " + div);		
	}
}
