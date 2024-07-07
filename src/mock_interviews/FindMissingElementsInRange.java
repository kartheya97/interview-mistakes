package mock_interviews;
/*
	Given an array, arr[0..n-1] of distinct elements and a range [low, high], 
	find all numbers that are in a range, but not the array. The missing elements
 	should be printed in sorted order.

	Examples:  

	Input: arr[] = {10, 12, 11, 15}, 
       	   low = 10, high = 15
	Output: 13, 14
	
	Input: arr[] = {1, 14, 11, 51, 15}, 
       	   low = 50, high = 55
	Output: 50, 52, 53, 54 55
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMissingElementsInRange {

	public static int[] findMissingElements(int nums[], int low, int high) {
		
		/* Time  Complexity = O(N)
		 * Space Complexity = O(1).
		 */
		List<Integer> missingElements        = new ArrayList<Integer>();
		Map<Integer, Integer> map            = new HashMap<Integer, Integer>();
		for(int num : nums)
			map.put(num, 0);
		while(low <= high) {
			if(!map.containsKey(low))
				missingElements.add(low);
			low++;
		}
		return missingElements.stream().mapToInt(Integer :: intValue).toArray();		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1, 14, 11, 51, 15};
		System.out.println(Arrays.toString(findMissingElements(nums,50,55)));
	}

}
