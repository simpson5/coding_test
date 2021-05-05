
public class Solution {
	public String solution(int n) {
		// 11 12 14 21 22 24 41 42 44 || 111 112 114 121 122
		// 4 5 6 7 8 9 10 11 12 || 13 14 15 16 17
		String answer = "";
		while (n >= 1) {
			int remainder = n % 3;
			n /= 3;
			switch (remainder) {
			case 1:
				answer = "1" + answer;
				break;
			case 2:
				answer = "2" + answer;
				break;
			case 0:
				n -= 1;
				answer = "4" + answer;
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}

	public String solution2(int n) {
		String[] num = { "4", "1", "2" };
		String answer = "";

		while (n > 0) {
			answer = num[n % 3] + answer;
			n = (n - 1) / 3;
		}
		return answer;
	}
}
