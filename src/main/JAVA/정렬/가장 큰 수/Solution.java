import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] result = new String[numbers.length];
        
        for(int i = 0;i < numbers.length;i++){
            result[i] = numbers[i]+"";
        }
        Arrays.sort(result,(o1,o2) -> (o2+o1).compareTo(o1+o2));
        
        if(result[0].equals("0")){
            return "0";
        }
        
        for(String str : result){
            answer+=str;
        }
        
        return answer;
    }
}
