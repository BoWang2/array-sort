package test1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args)
	{
		int[] array = { 5, 2, 4, 7, 1, 3, 6};
		//bubblesort(array);
		//selectionsort(array);
		insersorta(array);
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void bubblesort(int[] array)
	{
		
		 for (int i = 0; i < array.length; i++) 
		 {
		      for (int j = i + 1; j < array.length; j++) 
		      {
		    	  if (array[i] > array[j]) 
		    	  {                       // compare numbers
		    		  int temp = array[i];// swap the element
		    		  array[i] = array[j];
		    		  array[j] = temp;
		           }
		       }
		  }
	}
	

	
	public static void selectionsort(int[] array)
	{
		int minim = 0;
		for(int i = 0; i<array.length; ++i)
		{
			
			for(int k = i+1; k<array.length; ++k)
			{
				if(array[i] < array[k])
				{
					minim = i;
				}else
				{
					minim = k;
				}
				int temp = array[minim];
				array[minim] = array[i];
				array[i] = temp;
			}
		}
		
	}
	
	
	
	
	public static void insertsort(int[] array)
	{
		for(int i = 1; i<array.length; ++i )
		{
			
			for(int k = i; k > 0; --k )
			{
				if(array[k] < array[i])
				{
					int temp = array[i];
					while(i > (k+1))
					{
						array[i] = array[i-1];
						--i;
					}
					array[k+1] = temp;
				}
			}
			
		}
		
		
	}
	
	public static void insersorta(int[] array)
	{
		int j;
		int k;
		for(int i = 1; i<array.length; i++)
		{
			if(array[i] < array[i-1])
			{
				k = array[i];
				for(j = i - 1; j>=0 && array[j] > k; j--)
				{
					array[j+1] = array[j];
				}
				array[j+1] = k;
			} 
		}
	}
	
	
	
	public static void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentNumber) {
            	array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentNumber;
        }
    }
}

