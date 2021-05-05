import java.util.HashSet;
import java.util.Set;

public class Solution {
	//nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
	//nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
	//폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
    public int solution(int[] nums) {
    	//가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
        	set.add(n);
        }
        if(set.size() <= nums.length / 2) {
        	answer = set.size();
        }
        else {
        	answer = (nums.length / 2);
        }
        return answer;
    }
}
