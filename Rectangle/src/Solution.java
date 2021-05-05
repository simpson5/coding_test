import java.util.HashSet;
import java.util.Set;

public class Solution {
	public long solution(int[][] rectangles) {
		long answer = -1;
		Set<int[]> r = new HashSet<int[]>();
		
		for (int i = 0; i < rectangles.length; i++) {
			int x1 = rectangles[i][0];
			int y1 = rectangles[i][1];
			int x2 = rectangles[i][2];
			int y2 = rectangles[i][3];

			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {
					int[] s = { j, k };
					boolean b = true;
					if (r.size() == 0) {
						r.add(s);
					}
					for (int[] rec : r) {
						if (rec[0] == j && rec[1] == k) {
							b = false;
						}
					}
					if (b) {
						r.add(s);
					}
				}
			}
		}
		answer = r.size();
		return answer;
	}
}
