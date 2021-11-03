package mock;

import java.util.Arrays;
import java.util.Collections;

public class arrayminmax {

	public static void main(String[] args) {
		 // Initializing array of integers
        Integer[] a= { 2, 4, 7, 5, 9 };
 
        int l= a.length;
        
        int max=a[0];
    //    int min=a[0];
        
        for(int i=0;i<l;i++) {
        	if (max < a[i]);
        	{
        		a[i]=max;
        		
        		}
        }     
        
     System.out.println(max);   
        
        
        
        
        // using Collections.min() to
        // find minimum element
        // using only 1 line.
      //  int min = Collections.min(Arrays.asList(num));
 
        // using Collections.max()
        // to find maximum element
        // using only 1 line.
     //   int max = Collections.max(Arrays.asList(num));
 
        // printing minimum and maximum numbers
      //  System.out.println(min);
      //  System.out.println(max);
		
		
		
		
		

	}

}
