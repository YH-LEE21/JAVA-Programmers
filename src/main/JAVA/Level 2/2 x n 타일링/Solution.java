class Solution {
    public int solution(int n) {
        int answer = 0;
        int width = 1;
        int height = 2;
        for(int i=2;i<n;i++){
            answer = (width+height)%1000000007;
            width = height;
            height = answer;
        }
        return answer;
    }
}
