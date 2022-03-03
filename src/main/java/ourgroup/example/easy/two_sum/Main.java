package ourgroup.example.easy.two_sum;

public class Main {

	public static void main(String[] args) {
		int[] numeri = {2,7,1,15};
        int target = 9;
        int[] soluzione;
        soluzione = Solution.getInstance().twoSum(numeri, target);
        System.out.println(soluzione[0] +  ", " + soluzione[1]);
	}

}
