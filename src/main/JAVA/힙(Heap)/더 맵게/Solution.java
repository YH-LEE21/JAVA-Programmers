import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue <Integer> h = new PriorityQueue<Integer>();
        for(int i:scoville){
            h.add(i);
        }
        while(h.peek()<=K){
            if(h.size()==1){
               return answer=-1;
            }
                int a1=h.poll();
                int a2=h.poll();
                int result=a1+a2*2;
                h.add(result);
                answer++;
        }
        return answer;
    }
}
