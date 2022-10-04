class Solution {
    public int solution(int[][] sizes) {
         for(int i =0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        //X,Y 지갑 가로 세로 최대길이
        int maxX=0;
        int maxY=0;
        for(int i =0;i<sizes.length;i++){
            if(maxX<sizes[i][0]){
                maxX = sizes[i][0];
            }
            if(maxY<sizes[i][1]){
                maxY = sizes[i][1];
            }
        }
        return maxX*maxY;
    }
}
