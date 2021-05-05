import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
public class Solution {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for (int s : scoville) {
			list.add(s);
		}
		while (true) {
			boolean check = true;
			for (int s : list) {
				if (s < K) {
					check = false;
				}
			}
			if (check) {
				break;
			}

			Collections.sort(list);

			int k = list.get(0) + list.get(1) * 2;
			list.remove(0);
			list.remove(0);
			list.add(k);

			answer++;
		}
		return answer;
	}
}
