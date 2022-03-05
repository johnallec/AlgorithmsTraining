package ourgroup.example.easy.two_sum;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	private static Solution instance = null;
	
	private Solution() {}
	
	public static Solution getInstance() {
		if(instance == null)
			instance = new Solution();
		return instance;
	}
	
	public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> numeri = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i+=1) {
            numeri.add(nums[i]);
        }
        Collections.sort(numeri);
        
        int[] copia = new int[numeri.size()];
        for(int i = 0; i < numeri.size(); ++i) {
            copia[i] = numeri.get(i);
        }
        int[] soluzione = {-1,-1};
        
        for(int i = 0; i < numeri.size(); ++i) {
            if(soluzione[1] != -1)
                break;
            cerca(i+1, nums.length-1, i, copia, soluzione, target, 0);
        }
        
        if(soluzione[1] == -1)
        	return soluzione;
        
        int notRead = -1;
        for(int i=0; i<nums.length; ++i) {
        	if(copia[soluzione[0]] == nums[i]) {
        		soluzione[0] = i;
        		notRead = 1;
        	}
        	else if(copia[soluzione[1]] == nums[i]) {
        		soluzione[1] = i;
        		notRead = 0;
        	}
        	if(notRead != -1) {
        		for(int j=0; j<nums.length; ++j) {
        			if(copia[soluzione[notRead]] == nums[j] && j != i) {
        				soluzione[notRead] = j;
        				break;
        			}
        		}
        		break;
        	}
        }
        
        return soluzione;
    }

    private void cerca(int i, int j, int k, int[] numeri, int[] soluzione, int target, int porcata) {
    	int centrale = (i+j)/2;
    	if(i > j) {
            return;
        }

        if(numeri[k] + numeri[centrale] == target){
            soluzione[0] = k;
            soluzione[1] = centrale;
            return;
        }
        
        if(numeri[k] + numeri[centrale] > target) {
            cerca(i, centrale-1, k, numeri, soluzione, target, porcata+1);
        }

        if(numeri[k] + numeri[centrale] < target) {
            cerca(centrale+1, j, k, numeri, soluzione, target, porcata+1);
        }
    }
}
