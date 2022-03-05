package ourgroup.example.easy.two_sum;

import ourgroup.example.easy.two_sum.sol2.Solution;

public class Main {

	public static void main(String[] args) {
		int[] numeri = {3,3};
        int target = 6;
        int[] soluzione = Solution.getInstance().twoSum(numeri, target);
        System.out.println("Indexes: " + soluzione[0] + " " + soluzione[1]);
        System.out.println("Values: " + numeri[soluzione[0]] + " " + numeri[soluzione[1]]);
	}

}
