package mock;

import java.util.Arrays;
import java.util.Collections;

public class arrayminmax {

	public static void main(String[] args) {
		 // Initializing array of integers
        Integer[] a= { 1,2,3,4,5,6,7,8,9,10,11,12,13 };
 
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
