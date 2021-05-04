package simp.hash1;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i=0; i < participant.length; i++) {
        	int cnt = 0;
        	for(int j=0; j < participant.length; j++) {
        		if(participant[i] == participant[j]) {
        			//중복 이름이 있는 경우
        		}
        	}
        	for(int j=0; j < completion.length; j++) {
        		if(participant[i] == completion[j]) {
        			cnt++;
        		}
        	}
        	if(cnt == 0) {
        		answer = participant[i];
        	}
        }
        return answer;
    }
}
