class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int count = 0;
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i] == 0){
                count++;
                continue;
            }  
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i] == win_nums[j]){
                    answer[1]++;
                    break;
                }
            }
        }
        answer[0] = answer[1]+count;
        
        answer[0] = 7 - answer[0];
        answer[1] = 7 - answer[1];
        if(answer[1] == 7 ){
            answer[1] = 6;
        }
        if(answer[1] == 6 && answer[0] == 7){
            answer[0] = 6;
        }
        //전부 안맞을 경우 0도 아니고
        return answer;
    }
}
