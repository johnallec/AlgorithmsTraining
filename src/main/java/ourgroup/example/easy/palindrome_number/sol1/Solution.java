package ourgroup.example.easy.palindrome_number.sol1;


public class Solution {
	private static Solution instance = null;
	
	private Solution() {}
	
	public static Solution getInstance() {
		if(instance == null)
			instance = new Solution();
		return instance;
	}
	
	public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        for(int i = 0, j = number.length()-1; i < number.length(); ++i, --j) {
        	if(i>=j)
        		break;
        	if(Integer.valueOf(number.charAt(i)) != Integer.valueOf(number.charAt(j)))
        		return false;
        }
        return true;
    }
}
