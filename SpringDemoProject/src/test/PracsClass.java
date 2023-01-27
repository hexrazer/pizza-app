package test;

import java.util.Arrays;
import java.util.List;

public class PracsClass {
	public static void main(String[] args) {
		miniMaxSum(Arrays.asList(256741038 ,623958417 ,467905213 ,714532089 ,938071625));
	}
	
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
	    long min=0,max=0,total=0,lowest=arr.get(0),highest=arr.get(0);
	    for(int i=0;i<arr.size();i++){
	    	if(arr.get(i)<lowest) {
	    		lowest=arr.get(i);
	    	}
	    	if(arr.get(i)>highest) {
	    		highest=arr.get(i);
	    	}
	        total=total+arr.get(i);
	    }
	    
	    min = total-highest;
	    max = total-lowest;
	    System.out.println(min+" "+max);

	    }
}
