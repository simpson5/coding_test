package simp.hash1;

public class run {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(new Solution().solution(participant, completion));
	}

}
