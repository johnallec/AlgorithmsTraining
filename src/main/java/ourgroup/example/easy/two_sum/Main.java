package ourgroup.example.easy.two_sum;

public class Main {

	public static void main(String[] args) {
		int[] numeri = {3,3};
        int target = 6;
        int[] soluzione;
        soluzione = Solution.getInstance().twoSum(numeri, target);
        System.out.println(numeri[soluzione[0]] +  ", " + numeri[soluzione[1]]);
        System.out.println(soluzione[0] +  ", " + soluzione[1]);
	}

}
