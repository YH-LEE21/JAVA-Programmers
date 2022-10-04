import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        int count=0;
        for(int i=0;i<progresses.length;i++){
            count=(int)Math.ceil((100-progresses[i])/(double)speeds[i]);
            queue.offer(count);
        }
        
        count=0;
        int z= queue.poll();
        while(!queue.isEmpty()){
            count++;
            if(z<queue.peek()){
                list.add(count);
                count=0;
                z=queue.peek();
            }
            queue.poll();
        }
        count++;
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);    
        }
        return answer;
    }
}
