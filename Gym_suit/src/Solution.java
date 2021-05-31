public class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        //현재 사람
        int i = 0;
        
        while(n > 0) {
        	i ++;
        	for(int l : lost) {
        		if(i == l) {
        			for(int r : reserve) {
        				if((r-1) == i || (r+1) == i || r==i) {
        					
        				}
        			}
        		}
        	}
        	
        	n--;
        }
        
        return answer;
    }
}
