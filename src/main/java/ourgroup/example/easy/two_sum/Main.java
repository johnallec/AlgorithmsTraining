package ourgroup.example.easy.two_sum;

public class Main {

	public static void main(String[] args) {
		int[] numeri = {5,11,2,8,10,4};
        int target = 19;
        int[] soluzione;
        soluzione = Solution.twoSum(numeri, target);
        System.out.println(soluzione[0]);
        System.out.println(soluzione[1]);
	}

}
