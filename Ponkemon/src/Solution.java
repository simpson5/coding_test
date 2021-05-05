import java.util.HashSet;
import java.util.Set;

public class Solution {
	//nums�� ���ϸ��� ���� ��ȣ�� ��� 1���� �迭�Դϴ�.
	//nums�� ����(N)�� 1 �̻� 10,000 ������ �ڿ����̸�, �׻� ¦���� �־����ϴ�.
	//���ϸ��� ���� ��ȣ�� 1 �̻� 200,000 ������ �ڿ����� ��Ÿ���ϴ�.
    public int solution(int[] nums) {
    	//���� ���� ������ ���ϸ��� �����ϴ� ����� ���� ������ ��쿡��, ������ �� �ִ� ���ϸ� ���� ������ �ִ� �ϳ��� return �ϸ� �˴ϴ�.
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
