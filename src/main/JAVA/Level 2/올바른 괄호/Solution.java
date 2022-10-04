class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();
        int front = 0;
        int count = 0;
        if(c[0]==')'){
            answer=false;
        }
        else{
            while(true){
                if(c[front]=='('){
                    count++;
                }
                else{
                    count--;
                }
                front++;
                if(count<0){
                    break;
                }
                else if(front>=c.length){
                    break;
                }
            }
        }
        if(count!=0){
            answer=false;
        }

        return answer;
    }
}
