import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		List<Integer> barsket = new ArrayList<>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (barsket.size() > 0 && barsket.get(barsket.size() - 1) == board[j][moves[i] - 1]) {
						barsket.remove(barsket.size() - 1);
						answer += 2;
					} else {
						barsket.add(board[j][moves[i] - 1]);
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}
}