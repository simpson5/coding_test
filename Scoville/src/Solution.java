import java.util.Arrays;

//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
public class Solution {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		
		if(scoville[0] == 0 && scoville[1] == 0) {
			return -1;
		}
		
		while (true) {
			Arrays.sort(scoville);
			
			if(scoville.length == 1 && scoville[0] < K) {
				return -1;
			}
			
			if(scoville[0] >= K) {
				return answer;
			}
			
			int k = scoville[0] + scoville[1] * 2;
			scoville = Arrays.copyOfRange(scoville, 1, scoville.length);
			scoville[0] = k;
			answer++;
			//System.out.println(answer + " : " + Arrays.toString(scoville));
		}
	}
}
