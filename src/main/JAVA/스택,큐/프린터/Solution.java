import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer=1;
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0;i<priorities.length;i++){
            queue.offer(priorities[i]);
        }
        while(!queue.isEmpty()){
            for(int i=0;i<priorities.length;i++){
                if(queue.peek()==priorities[i]){
                    if(location==i)return answer;
                    queue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
