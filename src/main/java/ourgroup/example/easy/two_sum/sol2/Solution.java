package ourgroup.example.easy.two_sum.sol2;

import java.util.HashMap;

public class Solution {
	
	private static Solution instance = null;
	
	private Solution() {}
	
	public static Solution getInstance() {
		if(instance == null)
			instance = new Solution();
		return instance;
	}
	
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; ++i) {
			map.put( (target) - (nums[i]),i);
		}
		
		int[] sol = {-1,-1};
		
		for(int i = 0; i < nums.length; ++i) {
			if(map.get(nums[i]) != null && map.get(nums[i])!=i) {
				sol[0] = i;
				sol[1] = map.get(nums[i]); 
			}
		}
		return sol;
	}

}
