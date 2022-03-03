package ourgroup.example.easy.two_sum;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> numeri = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i+=1) {
            numeri.add(nums[i]);
        }
        Collections.sort(numeri);
        int[] copia = new int[numeri.size()];
        for(int i = 0; i < numeri.size(); ++i) {
            copia[i] = numeri.get(i);
        }
        int[] soluzione = new int[2];
        for(int i = 0; i < numeri.size(); ++i) {
            if(soluzione[soluzione.length-1] != 0) {
                return soluzione;
            }
            cerca(i+1, nums.length-1, i, copia, soluzione, target, 0);
        }
        
        for(int i = 0; i < nums.length; i+=1) {
            if(nums[i] == copia[soluzione[0]]) {
                soluzione[0] = i;
            }
            if(nums[i] == copia[soluzione[1]]) {
                soluzione[1] = i;
            }
        }
        return soluzione;
    }

    private static void cerca(int i, int j, int k, int[] numeri, int[] soluzione, int target, int porcata) {
        if(i >= j) {
            return;
        }
        
        int centrale = (i+j)/2;
        if(numeri[k] > target) {
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
