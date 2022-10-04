import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n=10;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=n){
                list.add(arr[i]);
                n=arr[i];
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
